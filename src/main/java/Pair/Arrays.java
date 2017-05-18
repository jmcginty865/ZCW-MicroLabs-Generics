package Pair;

import sun.jvm.hotspot.gc_interface.CollectedHeapName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static javax.swing.UIManager.get;

/**
 * In here you must make firstLast, which will return a pair of the first element in the array list and the last
 * element in the arraylist.
 * You must also make a min method that returns the smallest item in the array list
 * A max method that returns the largest item in the arraylist
 * And a minmax method that returns a pair containing the largest and smallest items from the array list
// */
public class Arrays <E> {
    public static <E extends Comparable> Pair<E> firstLast(ArrayList<E> a) {
        return new Pair(a.get(0), a.get(a.size() - 1));
    }

    public static <E extends Comparable> E min(ArrayList<E> list){
        Collections.sort(list);
        return list.get(0);
    }

    public static <E extends Comparable> E max(ArrayList<E> list){
        Collections.sort(list);
        return list.get(list.size() - 1);
    }


    public static <E extends Comparable> Pair <E> minMax(ArrayList<E> list){
        Collections.sort(list);
        return new Pair<E>(min(list), max(list));
    }
}
