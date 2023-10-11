package org.example.generics;

public class GenericsDriver {
    public static void main(String[] args) {

        Box box = new Box();
        box.setId(1234);
        System.out.println(box.toString());
        box.setId("1234");
        System.out.println(box.toString());
    }
}
