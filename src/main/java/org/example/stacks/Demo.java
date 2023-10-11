package org.example.stacks;

public class Demo {
    public static void main(String[] args) {
        ListStack stack = new ListStack();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
            System.out.println(i);
        }
        System.out.println("Index: " + stack.search(4));
    }
}
