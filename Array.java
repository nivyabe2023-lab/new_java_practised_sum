public class Array{
    public static void main(String[]args){
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 50;
        int position = 2;
        int value = 90;
        for(int i=3;i>=position;i--){
            arr[i+1] = arr[i];
        }

        arr[position] = value;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        

    }
}