package Problems2012;

import java.util.Scanner;

public class j1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int speedLimit = in.nextInt();  
        int speed = in.nextInt();  
        int fineOne = speedLimit + 20;  

        if ( speed <= speedLimit){
            System.out.println("Congratulations, you are within the speed limit!");
        } 

        if (speed > speedLimit){
            if (speed <= fineOne ){
                System.out.println("You are speeding and your fine is $100.");
            } else if (speed > fineOne && speed <= speedLimit + 30)  {
                System.out.println("You are speeding and your fine is $270.");
            } else {
                System.out.println("You are speeding and your fine is $500.");
            }
        }

        }
    }

