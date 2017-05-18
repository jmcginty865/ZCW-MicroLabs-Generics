package ArrayListCombiner;

import java.util.ArrayList;

/**
 * Create two generic methods that take two arraylists.  The methods should both append the second ArrayList's items,
 * to the first.  Use a wildcard for one of the type arguments in each method.
 * The first method should be called extendCombiner and should use ? extends E
 * The second method should be called superCombiner and should use ? super E
 */
public class ArrayListCombiner <E> {

    ArrayList<? extends E> first = new ArrayList<>();
    ArrayList< ? super E> second = new ArrayList<>();

    public void extendCombiner(ArrayList<E> first, ArrayList<E> second){

    }

    public void superCombiner(){}

}
