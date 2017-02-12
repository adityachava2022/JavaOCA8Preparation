package com.oca8.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConversion
{

    public static void main(String[] args)
    {
        // arraylist to array.
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray();
        System.out.println(objectArray.length); // 2
        String[] stringArray = list.toArray(new String[0]);   
        // giving '0' will create a size which will fit the array. , if you give any other value, 
        // it will create if it fits the array otherwise it will give take the size that fits the array.
        System.out.println(stringArray.length); // 2
        
        //array to arraylist
        /* the original value and the array list are linked.
         * whatever change is made in either of them , both will be the same. 
         * It is a fixed-size list and is also known a backed List because the array changes with it
         */
        String[] array = { "hawk", "robin" }; // [hawk, robin]
        List<String> alist = Arrays.asList(array); // returns fixed size list
        System.out.println(alist.size()); // 2
        alist.set(1, "test"); // [hawk, test]
        array[0] = "new"; // [new, test]
        System.out.println();
        for (String b : array) 
            System.out.print(b + " "); // new test
        System.out.println();
        for (String b : alist) 
            System.out.print(b + " "); // new test
        alist.remove(1); // throws UnsupportedOperation Exception , 
        //becoz we are not allowed to change the size of the list since it is referenced by array.

    }

}
