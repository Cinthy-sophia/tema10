package com.cinthyasophia.tema10.Ejercicio04;

public interface ICola<T> {
    boolean add(T e);
    T remove();
    int size();
    T peek();
    boolean isEmpty();

}
