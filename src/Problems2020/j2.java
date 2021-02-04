package Problems2020;

import java.util.Scanner;

public class j2 {

    public static void main(String[] args) {
        
    
        Scanner input = new Scanner(System.in);
        int P = input.nextInt();
        int N = input.nextInt();
        int R = input.nextInt();

        int numInfectedPeople = N;
        int numInfectedPeopleLastDay = N;
        int days = 0;

        while (numInfectedPeople <= P){
            days += 1;
            numInfectedPeople += numInfectedPeopleLastDay * R;
            numInfectedPeopleLastDay *= R;

        }
        System.out.println(days);


    }
}
