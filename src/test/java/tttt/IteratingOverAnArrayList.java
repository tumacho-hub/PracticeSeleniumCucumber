package tttt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingOverAnArrayList {


    public static void main(String[] args) {

        List<String> tvShows = new ArrayList<>();
        tvShows.add("breaking bad");
        tvShows.add("power");
        tvShows.add("big bang theory ");
        tvShows.add("the chi");
        tvShows.add("Friends ");
        tvShows.add("sex in the city");

        System.out.println("======= Iterate using java 8 forEach and Lambda====");
        tvShows.forEach(tvShow -> {
            System.out.println(tvShows);
        });

        System.out.println("Iterate using simple for-each loop" );
        for (String tvShow : tvShows) {
            System.out.println(tvShow);
        }

        System.out.println("Iterate with a regular for loop ");
        for (int i = 0; i < tvShows.size(); i++){
            System.out.println(tvShows.get(i));
        }


        System.out.println("Iterate with a simple while loop and Iterator Object ");
        // to use the Iterator we need to declare or create an object of Iterator
        Iterator<String> tvShowIterator = tvShows.iterator();
        while(tvShowIterator.hasNext()){
            String tvShow = tvShowIterator.next();
            System.out.println(tvShow);
        }



        System.out.println("========= Iterate using an iterator() and java 8 forEachRemaining() method() =======");

        tvShowIterator = tvShows.iterator();
        tvShowIterator.forEachRemaining(tvShow -> {
            System.out.println(tvShow);
        });

        System.out.println("does tvShows contains \"sex in the city\" ? " + tvShows.contains("sex in the city"));
        System.out.println(tvShows.indexOf("sex in the city"));





    }
}
