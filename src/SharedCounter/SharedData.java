package SharedCounter;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class SharedData {

    private AtomicInteger count = new AtomicInteger();

    public void increment() {
        count.incrementAndGet();
    }

    public int getCount() {
        return count.get();
    }
}
