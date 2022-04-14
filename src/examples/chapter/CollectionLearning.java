package examples.chapter;

import java.util.*;

public class CollectionLearning {

    public static void main (String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("4");
        myList.add("5");
        myList.add(0, "0");
        System.out.println("My Sub List " + myList.subList(1, 3));
        System.out.println("My List " + myList);
        System.out.println("Index of " + myList.indexOf("4"));
        System.out.println("Last Index of " + myList.lastIndexOf("4"));
        System.out.println("Size " + myList.size());

        Set <String> addOn = new <String>HashSet();
        addOn.add("S1");
        addOn.add("S2");
        addOn.add("S3");
        addOn.add("S4");
        addOn.add("S5");

        myList.addAll(addOn);
        System.out.println("My Add On List " + myList);

        System.out.println("My List Contains  " + myList.contains("S2"));
        System.out.println("My List does not contain  " + myList.contains("S7"));

        System.out.println("My List is Empty? " + myList.isEmpty());

        System.out.println("Iterating My List");

        for (String listValue : myList) {
            System.out.println("My Value : " + listValue);
        }

        String[] myListArray = new String[myList.size()];
        System.out.println(Arrays.toString(myList.toArray(myListArray)));

//        for (String listValue : myListArray) {
//            System.out.println("My Array Value : " + listValue);
//        }


        myList.clear();

        System.out.println("My Cleared List " + myList);
        System.out.println("My Cleared List is Empty? " + myList.isEmpty());

    }
}
