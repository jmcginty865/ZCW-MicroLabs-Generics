package StackArray;

import java.util.Arrays;
import java.util.Stack;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;

    @SuppressWarnings("Unchecked")
    public GenericStack() {

        elements = (E[]) new Object[0];
    }

    public void push(E item) {
        E[] secondElementArray = (E[]) new Object[elements.length + 1];

        for (int i = 0; i < elements.length; i++) {
            secondElementArray[i] = elements[i];
        }

        secondElementArray[secondElementArray.length - 1] = item;

        elements = secondElementArray;
    }

    public E pop() throws IndexOutOfBoundsException {
        E items = elements[elements.length -1];
        E[] updatedArray = Arrays.copyOf(elements, elements.length-1);

        if (elements.length < 1) {
            throw new IndexOutOfBoundsException();
        }

        elements = updatedArray;

        return items;
    }

    public boolean isEmpty(){
        return elements.length == 0;
    }
}
