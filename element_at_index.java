import java.util.*;
public class element_at_index {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];

        for(int i =0 ;i <arr.length;i++){
            arr[i] = scn.nextInt();
        }

        int num = scn.nextInt();

        int notFound = -1;

        for(int i =0 ;i<arr.length;i++){
            if(arr[i] == num){
                notFound = i;
                break;
            }

        }

        System.out.println(notFound);


    }
    
}
