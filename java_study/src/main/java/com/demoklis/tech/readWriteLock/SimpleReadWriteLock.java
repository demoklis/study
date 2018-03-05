package com.demoklis.tech.readWriteLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**
 * 非公平读-写锁实现
 * 读写锁的特点有两个：
 * 1.当读锁和写锁上锁时，不允许有写者锁上锁
 * 2.当写锁上锁时，不允许有读者和写者锁上锁
 * 也就是说写锁是排它锁，同时只能有一个写锁
 * 读锁是共享锁，可以有多个读锁存在
 * @author demoklis
 *
 */
public class SimpleReadWriteLock implements ReadWriteLock{

	private final java.util.concurrent.locks.Lock lock;
	
	private final java.util.concurrent.locks.Condition existsReadCondition;
	
	private final java.util.concurrent.locks.Condition existsWriteCondition;
	
	private final Lock readLock;
	
	private final Lock writeLock;
	
	private volatile boolean write;
	
	private volatile int readCount;
	
	public SimpleReadWriteLock() {
		lock=new ReentrantLock();
		readLock=new ReadLock();
		writeLock=new WriteLock();
		existsReadCondition=lock.newCondition();
		existsWriteCondition=lock.newCondition();
		write=false;
		readCount=0;
	}
	
	private class ReadLock implements Lock{

		@Override
		public void lock() {
			lock.lock();
			try {
				while(write) {
					try {
						existsWriteCondition.await();
					}catch(InterruptedException e) {
						throw new RuntimeException("Interrupted");
					}
				}
				readCount++;
			}finally {
				lock.unlock();
			}
		}

		@Override
		public void unlock() {
			lock.lock();
			try {
				readCount--;
				if(readCount==0) {
					existsReadCondition.signalAll();
				}
			}finally {
				lock.unlock();
			}
		}

		@Override
		public void lockInterruptibly() throws InterruptedException {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean tryLock() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Condition newCondition() {
			// TODO Auto-generated method stub
			return null;
		}		
	}
	
	public class WriteLock implements Lock{

		@Override
		public void lock() {
			lock.lock();
			try {
				while(readCount>0) {
					try {
						existsReadCondition.await();
					}catch(InterruptedException e) {
						throw new RuntimeException("Interrupted");
					}
				}
				while(write) {
					try {
						existsWriteCondition.await();
					}catch(InterruptedException e) {
						throw new RuntimeException("Interrupted");
					}
				}
				write = true;
			}finally {
				lock.unlock();
			}
		}

		@Override
		public void lockInterruptibly() throws InterruptedException {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean tryLock() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void unlock() {
			lock.lock();
			try {
				write =false;
				existsWriteCondition.signalAll();
			}finally {
				lock.unlock();
			}
		}

		@Override
		public Condition newCondition() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	public Lock readLock() {
		return readLock;
	}

	public Lock writeLock() {
		return writeLock;
	}
	public static void main(String[] args) {
		SimpleReadWriteLock frw=new SimpleReadWriteLock();
		frw.readLock.lock();
		
		for(int i=0;i<10;i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					frw.readLock.lock();
				}
			}).start();
		}
	}
}
