import java.util.*;
public class Duplicate {
    public static void main(String[]args){
        int arr[] = {1,2,2,3,4,4,5};
        HashSet<Integer> numbers = new HashSet<>();
        for(int num:arr){
            numbers.add(num);
        }
        System.out.println(numbers);
    }
    
}
