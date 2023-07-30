package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.*;

public class AppSet {
    public static void main(String[] args) {
       // String[] vogais = {"e","i","o","u","a","b","c"};
        Set<String> setVogais = new HashSet<>();
              //  Set<String> setVogais = new TreeSet<>(Arrays.asList(vogais));
     // Collections.addAll(setVogais,vogais);
     setVogais.add("a");
     setVogais.add("e");
     setVogais.add("i");
     setVogais.add("o");
     setVogais.add("u");
     setVogais.add("b");
     setVogais.add("c");
     String strArray[]= setVogais.toArray(new String[setVogais.size()-1]);
    // Collections.sort(setVogais);


     System.out.println(strArray);
     System.out.println(Arrays.toString(strArray));

     // Set to Streams
     setVogais.stream().forEach(System.out::print);




    }
}
