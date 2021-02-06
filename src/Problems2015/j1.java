package Problems2015;

import java.util.Scanner;

public class j1 {
    public static void main(String[] args) {
        
        //Feb 18 is the benchmark from which we decide if its higher or lower
        //input 1 = month, input 2 = day
        //If the date occurs before February 18, output the word Before. If the date occurs after February
        //18, output the word After. If the date is February 18, output the word Special.

        Scanner in = new Scanner(System.in);

        int month = in.nextInt();
        int day = in.nextInt();

        if (month == 2 && day == 18) {System.out.println("Special");}
        else if (month == 2 && day > 18) {System.out.println("After");}
        else {
            System.out.println((month >= 3)? "After":"Before");
        }
        
    }
}
