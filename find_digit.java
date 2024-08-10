import java.util.*;
public class find_digit {
    public static void main(String[] args) {
        String str =  "i1progrr4mme8er9is7best";

         System.out.println(str);

         for(char ch: str.toCharArray()){
            if(ch >= '0' && ch <= '9'){
                System.out.print(ch);
            }
         } 
       
        
    }    
}
