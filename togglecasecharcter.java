import java.util.*;
public class togglecasecharcter {
    
    public static String togglecasecharcter(String str){
          //ascii num for alphabet A=65.B=67...   a=97.b=98..

        //for small c = C + (a-A) lowercase
        //for bigg  C = c +(A-a)  uppercase

        StringBuilder sb = new StringBuilder(str);

        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);

            if(ch >= 'A'  && ch <= 'Z'){
                char lc = (char)(ch + 'a'-'A');
                sb.setCharAt(i, lc);

            }else{
                char uc = (char)(ch + 'A'-'a');
                sb.setCharAt(i, uc);

            }
        }



        return sb.toString();
    }


    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(togglecasecharcter(str));



      
    }
}
