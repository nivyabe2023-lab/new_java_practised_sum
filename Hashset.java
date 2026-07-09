import java.util.*;
public class Hashset {
    public static void main (String[]args){
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("banana");
        fruits.add("Mango");
        fruits.add("banana");
        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.contains("Apple"));
    }
    
}
