package Problems2018;

import java.util.Scanner;

public class j1 {
    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);
        
        int a, b, c, d;

        a = in.nextInt(); //4
        b = in.nextInt(); //5
        c = in.nextInt(); //6
        d = in.nextInt(); //7

        if(  a == 8 || a == 9 && d == 8 || d == 9 && b == c ){
            System.out.println("ignore");
        } else{
            System.out.println("answer");
        }

    }
}
