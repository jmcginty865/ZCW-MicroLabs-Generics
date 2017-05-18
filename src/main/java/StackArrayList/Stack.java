package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {
    private ArrayList elements;


    public Stack(){
        elements = new ArrayList<E>();
    }

    public E pop(){

        return (E) elements.remove(elements.size() -1 );
    }

    public void push(E item){
        elements.add(item);
    }

    public boolean isEmpty(){
        return elements.isEmpty();
    }
}
