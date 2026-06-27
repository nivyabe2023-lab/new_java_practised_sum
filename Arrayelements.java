import java.util.*;
public class Arrayelements {
    public static void main(String[]args){
        ArrayList<Integer> fruits = new ArrayList<>();
        fruits.add(1);
        fruits.add(2);
        fruits.add(3);
        fruits.add(4);
        fruits.set(1,10);
        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.get(2));


    }
    
}
