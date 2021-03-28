package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyLinkedList<E> extends LinkedList<E> implements MyQueue<E> {

    public ArrayList<E> pollMultiple(int number){

        ArrayList<E> elements = new ArrayList<E>();

        for (int i = 0; i < number; i++) {
            elements.add(poll());
        }
        return elements;
    }
}
