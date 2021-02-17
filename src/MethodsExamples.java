import java.util.Arrays;

public class MethodsExamples {
    public static void main(String[] args) {
    
        // countBack(10);
        // String r = reverse("dog");
        // System.out.println(r);

        //Helpful Methods
        int x = 10;
        int y = 20;
        System.out.println(Integer.max(x, y)); //max value
        System.out.println(Integer.compare(x, y)); // compares the ints

        String money = "222";
        System.out.println(Integer.valueOf(money)); // changing a string to an Integer Object
        System.out.println(Integer.parseInt(money)); // changing a string to an int primitive
        

        //String methods

        String word = "helllo bro";
        System.out.println(word.charAt(1)); // retrives index 1 = "e"
        System.out.println(word.charAt(word.length() - 1));  //retrives the last character in the string - length = 10, but since the index begins at 0, you have to do length - 1
        System.out.println(word.length()); // prints out 10
        if(word.contains(":")){ // used to check if the string contains that specific value
            System.out.println("It contains " + ":");
        } else{
            System.out.println("It does not");
        }

        System.out.println(word.indexOf("bro")); // returns 7. the index where the "bro" is located at
        System.out.println(word.lastIndexOf("bro"));

        System.out.println(word.toUpperCase()); // upercase all letters
        System.out.println(word.strip()); // removes white spaces, tabs, and newlines
        System.out.println(word.substring(0, 7)); // only prints out the characters within the index limit - will print "helllo"

        if (word.equals("helloo")){ // checks - a boolean value to see if the word equals that or not
            System.out.println("helloo is correct");
        } else {
            System.out.println("That word is not included");
        }


        // if statement one line

        String name = "claire";
        boolean welcome = false;

        System.out.println(name.equals("clair") ? welcome = true : false); // one line if statement


        // toString 

        int [] grades = {1, 2, 4, 5, 0};
        int [][] grade = {{1, 1, 1, 1, 1}, 
                            {1, 1, 1, 1, 1}};

        System.out.println(Arrays.toString(grades)); // prints out [1, 1, 1, 1, 1]
        System.out.println(Arrays.deepToString(grade)); // used to print out 2d array values

        // array sort
        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades));


        //comparing arrays

        int [] scores = {1, 2,3, 4, 5};
        int [] scores2 = {1, 2,3, 4, 5, 5};

        if (Arrays.equals(scores, scores2)){ // comparing both - returns a boolean
            System.out.println("Equals");
        } else{
            System.out.println("Nope");
        }                                   
        
        // 2d loops checking
        int [][] gradee = {{1, 1, 1, 1, 1}, 
                            {1, 1, 1, 1, 1}};

        System.out.println(gradee[0].length); // returns the length of the first array in that 2d array

        for (int i = 0; i < gradee.length; i++) {
            for (int j = 0; j < gradee[1].length; j++) {
                System.out.print(gradee[i][j] + " "); // prints the array
            }
            System.out.println(); // empty print statement used to separte the two arrays
        }




    }


        // public static void countBack(int n){
        //    if(n == 0){
        //        System.out.println("done");
        //    } else {
        //        System.out.println(n);
        //        n--;
        //        countBack(n);
        //    }
            
        // }

        // public static String reverse(String s) {
        //     char [] letters = new char [s.length()];

        //     int letterIndex = 0;
        //     for (int i = s.length() - 1; i >= 0; i--) {
        //         letters[letterIndex] = s.charAt(i);
        //         letterIndex++;
        //     }

        //     String reverse = "";
        //     for (int i = 0; i < s.length(); i++) {
        //         reverse = reverse + letters[i];
        //     }
        //     return reverse;
        // }


            //Helpful Methods




    
}
