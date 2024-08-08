import java.util.Scanner;

public class find_digit_in_string {
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int res =0;

        for(int i= 0; i< str.length();i++){
            if(str.charAt(i) >  48 && str.charAt(i) <= 57){
                res++;
            }

        }

        System.out.println(res);;


    }
}
