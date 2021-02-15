package Problems2020;

import java.util.Scanner;

public class j2 {

    public static void main(String[] args) {
        
    
        Scanner input = new Scanner(System.in);

        // receive input from the user
        int P = input.nextInt(); // will be used as the condition - more than or equal to P users
        int N = input.nextInt(); // number of people with the disease on Day 0
        int R = input.nextInt(); // other people infected

        int numInfectedPeople = N; // number of infected people begins with N (Day 0), hence, store this value here
        int days = 0; // to check the amount of days it takes

        /* Loop
               1 += 1* (5^1); = 6
               6 += 1 * (5^2); = 31
               31 += 1 * (5^3) = 156
               156 += 1 * (5^4) = 781 (Limit has been reached on the fourth day) = exit loop */
        
        while (numInfectedPeople <= P){
            days++;
            numInfectedPeople += N*(Math.pow(R, days));
            System.out.println(numInfectedPeople);
        }
        System.out.println(days);


    }
}
