import java.util.*;
public class reversestring {
    public static void main(String[]args){
        String str = "hello prabhat yadav here";
        
        String res = "";

        for(int i = str.length()-1;i>=0 ;i--){
            res += str.charAt(i);

        }
        System.out.print(res);;
    }
}
