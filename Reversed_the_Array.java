import java.util.*;
public class Reversed_the_Array {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int [n];
        for(int i =0;i<n;i++){
            arr [i] = scn.nextInt();
        }

        //logic
        int left =0;
        int right = arr.length-1;
        int temp ;
        while(left < right){
             temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        for(int i =0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
