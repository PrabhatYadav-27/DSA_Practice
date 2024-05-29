import java.util.*;
public class Duplicate_Number {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = scn.nextInt();

        }
       System.out.println(duplicatenum(arr));

        
        
    }

    public static  boolean duplicatenum(int []nums){
        int num =nums.length;
        for(int i =0;i< num-1;i++){
            for(int j = i + 1;j<num;j++){
                if(nums[i] == nums[j]){
                    return true;

                }
                
                
            }
           
        }
        return false;
    }
}
