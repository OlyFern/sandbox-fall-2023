package org.example.inheritance;

public class Fish extends Amphibian{
    @Override
    public void eat() {
        System.out.println("Fish is eating");
    }

    @Override
    public void makSound() {
        System.out.println("Fish is making sound");
    }
}
