package collections;

import java.util.HashSet;
import  java.util.Set;

public class Sets {
    public static void main(String[] args){
        Set fruits = new HashSet();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");

        System.out.println(fruits);
        System.out.println("have apple? " + fruits.contains("apple") );
        fruits.remove("banana");
        System.out.println("number of elements: " + fruits.size());

        Set moreFruit = Set.of("pear", "raisin", "cherry");
        System.out.println(moreFruit);
    }
}
