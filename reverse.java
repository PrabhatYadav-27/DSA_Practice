import java.util.*;
public class reverse {
    public static void main(String[] args) {
        String str = "hello this is bhushan here";
        System.out.println(reverse(str));

    }

    public static String reverse(String str){
        String res = "";
        String [] words = str.split(" ");

        for(int i = words.length-1;i>=0;i--){
            if(i == 0){
                res += words[i];

            }else{
                res +=words[i] + " ";
            }
        }

        return res;
    }
}
