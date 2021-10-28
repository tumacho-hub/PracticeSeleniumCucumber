package tttt;

import java.util.ArrayList;
import java.util.*;

public class PracticeArray {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add(2);
        System.out.println(list.get(0) instanceof Object);
        System.out.println(list.get(1) instanceof Integer);

        System.out.println(Math.abs(123));
    }
    public static int abs(int num){
        return num < 0 ? -num : num;
    }


    }

