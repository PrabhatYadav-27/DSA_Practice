import java.util.*;
public class find_character_and_digit {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        String str = scn.nextLine();
        count(str);
        
    }

    public static void count (String x){
        char []ch = x.toCharArray();

        int dig = 0;
        int chars= 0;

        for(int i =0; i< x.length();i++){
            if(Character.isDigit(ch[i])){
                dig++;
            }else if(Character.isLetter(ch[i])){
                chars++;
            }
        }

        // System.out.println(x);
        System.out.println(dig);
        System.out.println(chars);
    }
    
}
