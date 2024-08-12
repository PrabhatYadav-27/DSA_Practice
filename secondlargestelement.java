import java.util.*;
public class secondlargestelement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int  n = scn.nextInt();
        int arr [] = new int [n];
        for(int i =0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }

        System.out.println(ans(arr));
    }

    public static int ans (int arr[]){
        int max,secmax;
        max = secmax= Integer.MIN_VALUE;

        for(int x:arr){
            if(x > max){
                secmax = max;
                max = x;
            }else {
                if( x > secmax && x!=max){

                }
            }
        }


        return secmax;

    }
}
