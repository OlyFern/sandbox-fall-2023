package org.example.inheritance;

public class Frog extends Amphibian{
    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void makSound() {
        System.out.println("Frog goes Ribbit");;
    }
}
