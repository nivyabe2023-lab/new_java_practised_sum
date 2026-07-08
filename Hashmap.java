import java.util.*;
public class Hashmap {
    public static void main(String[]args){
        HashMap<Integer,String> name = new HashMap<>();
        name.put(1,"Nivya");
        name.put(2,"munivesh");
        name.put(3,"munusamy");
        System.out.println(name.get(2));
        System.out.println(name.containsKey(3));
        System.out.println(name.containsValue("munivesh"));
        System.out.println(name.size());
    }
}
