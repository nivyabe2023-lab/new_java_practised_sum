import java.util.*;
public class Largestnumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        int max = 0;
        int second = 0;
        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i=0;i<a;i++){
            if(arr[i]>=max){
                max = arr[i];}
        else if(arr[i]>=second && arr[i]<max){
            second = arr[i];
        }
    }

        System.out.print(second+" ");
        
}

    
}
