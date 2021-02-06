package Problems2015;

import java.util.Scanner;

public class j2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        int happy = 0;
        int sad = 0;


        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equals(":")){
                if (String.valueOf(str.charAt(i + 1)).equals("-") &&
                            String.valueOf(str.charAt(i + 2)).equals(")")){
                                happy++;
                            } else if (String.valueOf(str.charAt(i + 1)).equals("-") &&
                            String.valueOf(str.charAt(i + 2)).equals("(")){
                        sad++;
                    }
                }
            }
    // System.out.println(happy); To visually check the score
    // System.out.println(sad);

        if (happy == 0 && sad == 0){
            System.out.println("none");
        } else if(happy == sad){
            System.out.println("unsure");
        } else if(happy > sad){
            System.out.println("happy");
        } else if(happy < sad){
            System.out.println("sad");
        } else{
            System.out.println("none");
        }
        
    }
}
