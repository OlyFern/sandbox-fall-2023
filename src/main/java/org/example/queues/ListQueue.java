package org.example.queues;

import java.util.ArrayList;
import java.util.List;

public class ListQueue<T> implements Queue<T> {

    private List<T> queue;

    public ListQueue() {
        this.queue = new ArrayList<>();
    }

    @Override
    public boolean offer(T t) {
        return queue.add(t);
    }

    @Override
    public T poll() {
        return queue.remove(0);
    }

    @Override
    public T peek() {
        return this.queue.get(0);
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
