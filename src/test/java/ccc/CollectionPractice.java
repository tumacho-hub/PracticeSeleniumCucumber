package ccc;

import java.util.ArrayList;
import java.util.*;
public class CollectionPractice {

    public static void main(String[] args) {
        Collection<Integer> coll = new ArrayList<>();
        coll.add(3);
        coll.add(15);
        coll.add(33);
        System.out.println(coll);

        // if you want to pass multiple values in one shot we can always call the addAll method with Array.asList
        coll.addAll(Arrays.asList(4,6,8,10,12,14));
        System.out.println(coll);

        //getting the size
        System.out.println(coll.size());

        //check if is empty or not, and it will return a boolean value true or false.
        System.out.println(coll.isEmpty());

        // we can remove the value with the remote method
        System.out.println(coll.remove(6));
        System.out.println(coll);

        // you can also check if the method contains with contains method
        System.out.println(coll.contains(6));

        //to remove certain values in the collection you must need to pass a collection objects example
        //or you can set individual values
        System.out.println(coll.removeAll(Arrays.asList(10, 12, 14)));
        System.out.println(coll);

        // retain All Method will only display commend values for this example
//        coll.retainAll(Arrays.asList(33, 15, 8));
//        System.out.println(coll);

        //removeIf allows you to have a condition with the lambda expression and get rid os numbers example below
        coll.removeIf(each -> each >10);
        System.out.println(coll);


    }
}
