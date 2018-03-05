package com.demoklis.tech.readWriteLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairReadWriteLock implements ReadWriteLock {
	private final java.util.concurrent.locks.Lock lock;

	private final java.util.concurrent.locks.Condition existReadCondition;

	private final java.util.concurrent.locks.Condition existWriteCondition;

	private final Lock readLock;

	private final Lock writeLock;

	private volatile boolean write;

	private volatile int readAccquired;

	private volatile int readReleased;

	public FairReadWriteLock() {
		lock = new ReentrantLock(true);
		existReadCondition = lock.newCondition();
		existWriteCondition = lock.newCondition();
		readLock = new ReadLock();
		writeLock = new WriteLock();
		write = false;
		readAccquired = 0;
		readReleased = 0;
	}

	private class ReadLock implements Lock {

		@Override
		public void lock() {
			lock.lock();
			try {
				while (write) {
					try {
						existWriteCondition.await();
					} catch (InterruptedException e) {
						throw new RuntimeException("Interrupted");
					}
				}
				readAccquired++;
			} finally {
				lock.unlock();
			}
		}

		@Override
		public void unlock() {
			lock.lock();
			try {
				readReleased++;
				if (readReleased == readAccquired) {
					existReadCondition.signalAll();
				}
			} finally {
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

	private class WriteLock implements Lock {

		@Override
		public void lock() {
			lock.lock();
			try {
				while (write) {
					try {
						existWriteCondition.await();
					} catch (InterruptedException e) {
						throw new RuntimeException("Interrupted");
					}
				}
				// 让新加入的读锁不能增加readAccquired
				write = true;
				while (readAccquired != readAccquired) {
					try {
						existReadCondition.await();
					} catch (InterruptedException e) {
						throw new RuntimeException("Interrupted");
					}
				}
			} finally {
				lock.unlock();
			}
		}

		@Override
		public void unlock() {
			lock.lock();
			try {
				write = false;
				existWriteCondition.signalAll();
			} finally {
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

	@Override
	public Lock readLock() {
		return readLock;
	}

	@Override
	public Lock writeLock() {
		return writeLock;
	}

	public static void main(String[] args) {
		FairReadWriteLock frw=new FairReadWriteLock();
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
