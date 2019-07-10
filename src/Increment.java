import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/*
Given the following class:
public class IncrementSynchronize { private int value = 0; //getNextValue() }
Write three different method options for getNextValue() that will return 'value++', each
method needs to be synchronized in a different way.
*/

public class Increment {

    private int value = 0;
    private AtomicInteger atomicInteger = new AtomicInteger(value);

    private final Object lock = new Object();
    private final ReentrantLock reentrantLock = new ReentrantLock();

   public synchronized void getNextValueSyncMethod() {
        value++;
    }

    public void getNextValueSyncStatement() {
        synchronized (lock) {
            value++;
        }
    }

    public void getNextValueReentrantLock() {
        reentrantLock.lock();
        try {
            value++;
        } finally {
            reentrantLock.unlock();
        }
    }

    public int getNextValueAtomic() {
        return atomicInteger.incrementAndGet();
    }

    public int getAtomicInteger() {
        return atomicInteger.get();
    }

    public int getValue() {
        return value;
    }
}
