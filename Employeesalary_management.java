import java.util.*;
public class Employeesalary_management {
    public static void main(String[]args){
        HashMap<Integer,String> salary = new HashMap<>();
        salary.put(101,"munivesh,CSE,25000");
        salary.put(102,"nivya,ECE,20300");
        salary.put(103,"munusamy,EEE,30000");
        System.out.println(salary.get(103));
    }
    
}
