package org.example.stacks;

import java.util.ArrayList;
import java.util.List;

public class ListStack<T> implements Stack<T> {

    private List<T> stack;

    public ListStack() {
        this.stack = new ArrayList<T>();
    }

    @Override
    public boolean empty() {
        return this.stack.isEmpty();
    }

    @Override
    public T peek() {
        return this.stack.get(this.stack.size() - 1);
    }

    @Override
    public T pop() {
        return this.stack.remove(this.stack.size() - 1);
    }

    @Override
    public void push(T element) {
        this.stack.add(element);
    }

    @Override
    public int search(T item) {

        return this.stack.size() - this.stack.lastIndexOf(item);
    }
}
