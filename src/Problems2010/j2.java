package Problems2010;

import java.util.ArrayList;
import java.util.Scanner;

public class j2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nSteps = new ArrayList<>();
        ArrayList<Integer> bSteps = new ArrayList<>();

        nSteps.add(Integer.parseInt(in.nextLine()));
        nSteps.add(Integer.parseInt(in.nextLine()));
        
        bSteps.add(Integer.parseInt(in.nextLine()));
        bSteps.add(Integer.parseInt(in.nextLine()));

        int steps = Integer.parseInt(in.nextLine());

        int nDistance = (steps / (nSteps.get(0) + nSteps.get(1))) * (nSteps.get(0) - nSteps.get(1));
        int nRemaining = steps % (nSteps.get(0) + nSteps.get(1));

        nDistance = (nRemaining > nSteps.get(0))?
                nDistance + nSteps.get(0) - (nRemaining - nSteps.get(0)):
                nDistance + nRemaining;

    //------------------------------------------------------------------------------------------
        int bDistance = (steps / (bSteps.get(0) + bSteps.get(1))) * (bSteps.get(0) - bSteps.get(1));
        int bRemaining = steps % (bSteps.get(0) + bSteps.get(1));

        bDistance = (bRemaining > bSteps.get(0))?
                bDistance + bSteps.get(0) - (bRemaining - bSteps.get(0)):
                bDistance + bRemaining;


        if (nDistance == bDistance){
            System.out.println("Tied");
        } else {
            System.out.println(
                    (nDistance > bDistance) ? "Nikky" : "Byron"
            );
        }



        /*byronDistance = (byronRemaining > byronSteps.get(0))?
                byronDistance + byronSteps.get(0) - (byronRemaining - byronSteps.get(0)):
                byronDistance + byronRemaining;
*/






    }
}
