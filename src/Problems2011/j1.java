package Problems2011;

import java.util.Scanner;

public class j1 {
    public static void main(String[] args) {
        
        /*
        Input:
        number of antenna
        number of eyes 

        Conditon:
        TroyMartian, who has at least 3 antenna and at most 4 eyes; (antenas >= 3 && eyes <= 4)
        VladSaturnian, who has at most 6 antenna and at least 2 eyes; (antenaa <= 6 && eyes >=2)
        GraemeMercurian, who has at most 2 antenna and at most 3 eyes. (antennas <= 2 && eyes <= 3)

        Output:
        The names of the aliens that match the description
        No output if none are applicable

        Code:
        obtain the two integers first
        then use if else and print the case

        */

        Scanner in = new Scanner(System.in);
        int antena = in.nextInt();
        int eyes = in.nextInt();

        if (antena >= 3 && eyes <= 4){
            System.out.println("TroyMartian");
        } else{
            System.out.println("");
        }

        if (antena <= 6 && eyes >=2){
            System.out.println("VladSaturnian");
        } else{
            System.out.println("");
        }

        if (antena<= 2 && eyes <= 3){
            System.out.println("GraemeMercurian");
        } else{
            System.out.println("");
        }

    }
}
