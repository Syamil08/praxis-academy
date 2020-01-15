import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class KataGanjilGenap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i <T; i++) {
            String myString=sc.nextLine();
            String odd = "";
            String even = "";
            for (int j = 0; j < myString.length(); j++) {
                 if(j%2==0){
                     even+=myString.charAt(j);
                 }
                 else{
                     odd+=myString.charAt(j);
                 }
            }
            System.out.println(even+" "+odd);
        }

    }

}