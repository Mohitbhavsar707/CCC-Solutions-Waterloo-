package Problems2011;

import java.util.ArrayList;
import java.util.Scanner;

public class j3 {
    public static void main(String[] args) {
        
        /*
        Condition:
        In a sumac sequence, t1, t2, .., tm, each term is an integer greater than or equal 0. Also, each term,
        starting with the third, is the difference of the preceding two terms (that is, tn+2 = tn − tn+1 for
        n ≥ 1). The sequence terminates at tm if tm−1 < tm.
    
        For example, if we have 120 and 71, then the sumac sequence generated is as follows:
        120, 71, 49, 22, 27.
        This is a sumac sequence of length 5

        Input

        */
        
    Scanner in = new Scanner(System.in);

    int firstNum = Integer.parseInt(in.nextLine());
    int secondNum = Integer.parseInt(in.nextLine());

    ArrayList<Integer> sumac = new ArrayList<>();
    sumac.add(firstNum);
    sumac.add(secondNum);

    int currentSize = 1; // base size = 1 always

    while (sumac.get(currentSize) <= sumac.get(currentSize - 1)){
        sumac.add(sumac.get(currentSize - 1) - sumac.get(currentSize));
        currentSize++;
    }
    System.out.println(sumac.size());



        }
}
