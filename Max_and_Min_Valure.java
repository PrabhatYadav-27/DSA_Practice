import java.util.*;

public class Max_and_Min_Valure{
    public static void main(String[]args){
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt(); //array length;
        int [] arr = new int [n]; //size to n
        // taking input in array
        for(int i =0;i<n;i++){
            arr[i] = scn.nextInt();
        }

        //calling the functiion
        System.out.println(min_value(arr, n));
        System.out.println(max_value(arr, n));
    }

    //function for min_value
    public static  int min_value(int []A, int N){
        int minvalue = Integer.MAX_VALUE;
        for(int i =0;i<N;i++){
            if(A[i] < minvalue){
                minvalue = A[i];
            }
        }
        return minvalue;
    }

    public static int max_value(int []A, int N){
        int maxvlaue = Integer.MIN_VALUE;
        for(int i =0; i<N;i++){
            if(A[i] > maxvlaue){
                maxvlaue =A[i];
            }
        }
        return maxvlaue;

    }
}