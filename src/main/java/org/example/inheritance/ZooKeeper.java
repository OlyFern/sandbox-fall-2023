package org.example.inheritance;

public class ZooKeeper {
    public static void main(String[] args) {
        Animal frog = new Frog();
        Animal fish = new Fish();
        frog.eat();
        fish.eat();

        frog.name = "Lion";
        fish.name = "Bubbles";

        System.out.println(frog.name);
        System.out.println(fish.name);
    }
}
