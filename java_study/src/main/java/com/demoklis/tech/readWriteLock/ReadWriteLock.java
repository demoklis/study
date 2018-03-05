package com.demoklis.tech.readWriteLock;

import java.util.concurrent.locks.Lock;

/**
 * 读写锁接口
 * @author demoklis
 *
 */
public interface ReadWriteLock {
	public Lock readLock();
	public Lock writeLock();
}
