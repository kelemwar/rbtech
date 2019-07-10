import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;





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
