package ccc;

import java.util.*;

public class ArrayList {
    public static void main(String[] args) {
        /*
        With ArrayList we can add,remove,clear,sort, contains  methods to help us with our code.
        To iterate through an ArrayList we can use Lambda -> with forEach loop, for each loop and regular loop.
        Exam: below I wrote three different types of how to iterate through an ArrayList.
         */

        List<String> names = new java.util.ArrayList<>();

        names.add("Jorge");
        names.add("Maria");
        names.add("Ares");
        names.add("Krystal");
        names.add("Shante");

        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);

        names.add(0,"David");
        System.out.println(names);

        names.remove(2);
        System.out.println(names);

        names.clear();
        System.out.println(names);

        System.out.println("==================How to Iterate through an ArrayList======================");

        List<String> tvShows = new java.util.ArrayList<>();
        tvShows.add("Sex in the city");
        tvShows.add("Power");
        tvShows.add("The-chi");
        tvShows.add("Cops");
        tvShows.add("Jugde juddy");

        System.out.println("iteration using for each loop");
        for (String each : tvShows) {
            System.out.println(each);

            System.out.println();
            System.out.println("Iteration with a regular for loop");
        for (int i =0; i < tvShows.size(); i++){

            System.out.println(tvShows.get(i));
            }

            System.out.println();
            System.out.println("Iteration using lambda and using for each loop");
            tvShows.forEach(tvShow ->{
                System.out.println(tvShow);
            });

        }

    }
}