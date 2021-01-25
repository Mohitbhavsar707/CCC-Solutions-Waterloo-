package Problems2016;

import java.util.Scanner;

public class j3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // retrive input from user
        String str = input.nextLine();
        // shortest palindrome = 1
        int shortest = 1;

        // get the string from the user and set up the new string and the reverse string
        // var
        for (int i = 0; i < str.length(); i++) {
            String original = "";
            String reversed = "";

            // First store the string in temp, then reverse it
            for (int x = 0; x < (str.length() - i); x++) {
                original += str.charAt(i + x);
                reversed = str.charAt(i + x) + reversed;

                // check to see if the original and reverse string match, then check if the
                // length that matches is larger than 1 (this is the shortest palindrom length)
                // if it is larger, than make shortest = to the new length.
                if (original.equals(reversed)) {
                    if (original.length() > shortest) {
                        shortest = original.length();
                    }
                }

            }
            /*
             * To see the actual original and reverse string System.out.println(temp);
             * System.out.println(reversed);
             */
        }
        // print the number of the largest palindrom outside of the loop
        System.out.println(shortest);

    }
}
