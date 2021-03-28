package com.company;
import java.util.ArrayList;
import java.util.Queue;

public interface MyQueue<E> extends Queue<E> {
    ArrayList<E> pollMultiple(int number);
}
