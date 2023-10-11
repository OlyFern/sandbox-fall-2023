package org.example.generics;

public class Box<T> {
    private T value;

    public Box() {

    }

    public Box(T value) {
        this.value = value;
    }

    public T getId() {
        return value;
    }

    public void setId(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Box{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
