package Problems2013;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class j4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int totalTime = Integer.parseInt(in.nextLine());  
        int numChores = Integer.parseInt(in.nextLine());  
      
        ArrayList<Integer> chores = new ArrayList<>();

        for (int i = 0; i < numChores; i++){
            chores.add(Integer.parseInt(in.nextLine()));
        }

        int current = 0;
        int counter = 0;
        Collections.sort(chores);
        while (totalTime >= 0){
            totalTime -= chores.get(current);
            current++;
            counter++;
        }

        System.out.println(counter - 1);



    }
}
