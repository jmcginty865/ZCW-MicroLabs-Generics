package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements;

    public ObjectStack() {
        elements = new Object[0];
    }

    public void push(E item){
        Object[] secondElementArray = new Object[elements.length + 1];

        for(int i = 0; i < elements.length; i++){
            secondElementArray[i] = elements[i];
        }

        secondElementArray[secondElementArray.length - 1] = item;

        elements = secondElementArray;
    }

    public Object pop() throws IndexOutOfBoundsException{
        Object items = elements[elements.length - 1];
        Object [] updatedArray = Arrays.copyOf(elements, elements.length - 1);

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
