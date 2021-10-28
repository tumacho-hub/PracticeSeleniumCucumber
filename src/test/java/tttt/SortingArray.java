package tttt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingArray {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("ares");
        names.add("Ares");
        names.add("Krystal");
        names.add("shante");
        names.add("maria");
        names.add("Jorge");

        System.out.println("before sorting " + names);

        // we can sort two ways with ArrayList Collections.sort() method
        Collections.sort(names);
        System.out.println("after sorting with collection " + names);

        System.out.println("second way to sort with ArrayList");
        names.sort(Comparator.naturalOrder());
        System.out.println("Sorted Names " + names);



    }
}
