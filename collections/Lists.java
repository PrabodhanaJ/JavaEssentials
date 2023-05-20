package collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args){
        List fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.set(2, "grape");
        fruits.add("lemon");
        fruits.remove(3);

        System.out.println(fruits);
        System.out.println(fruits.get(2));
        System.out.println("Index of first lemon: " + fruits.indexOf("lemon"));
        System.out.println("Index of last lemon: " + fruits.lastIndexOf("lemon"));

        List moreFruit = List.of("banana", "apple", "orange");
    }
}
