package org.example.Generics;

public class ContainerGenerics<T> implements Container<T>{

    private T item;
    @Override
    public void add(T item) {

    }

    @Override
    public T get() {
        return item;
    }
}
