package Problems2019;

import java.util.Scanner;

public class j1 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int one, two, three, four, five, six;

        one = in.nextInt();
        two = in.nextInt();
        three = in.nextInt();
        four = in.nextInt();
        five = in.nextInt();
        six = in.nextInt();

        int aScore = 0;
        int bScore = 0;

        aScore = (one*3) + (two*2) + (three);
        bScore = (four*3) + (five*2) + (six);

        if(aScore > bScore){
            System.out.println("A");
        } else if( aScore == bScore){
            System.out.println("T");
        } else{
            System.out.println("B");
        }


    }
}
