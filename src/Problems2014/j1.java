package Problems2014;

import java.util.Scanner;

public class j1 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int angleOne = in.nextInt();
        int angleTwo = in.nextInt();
        int angleThree = in.nextInt();

        if (angleOne + angleTwo + angleThree != 180){
            System.out.println("Error");
        } else if (angleOne != angleTwo && angleTwo != angleThree && angleThree != angleOne){
            System.out.println("Scalene");
        } else if (angleOne == angleTwo && angleTwo == angleThree){
            System.out.println("Equilateral");
        } else {
            System.out.println("Isosceles");
        }
    }
}
