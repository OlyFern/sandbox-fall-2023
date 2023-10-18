package org.example.linkedlists;

public interface LinkedList<E> {

    void addFirst(E first);

    void addLast(E sixth);

    E peekFirst();

    E peekLast();

    E pollFirst();

    E pollLast();

    boolean contains(E first);

    boolean size();

    void clear();
}
