package org.example.inheritance;

public abstract class Animal {

    protected String name;

    public void eat(){
        System.out.println("Animal eating");
    }
    public abstract void makSound();
}
