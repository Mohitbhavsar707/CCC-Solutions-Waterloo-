package Problems2016;

import java.util.Scanner;

public class j1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner sc = new Scanner(System.in);

        String a, b, c, d, e, f;

        a = sc.nextLine();
        b = sc.nextLine();
        c = sc.nextLine();
        d = sc.nextLine();
        e = sc.nextLine();
        f = sc.nextLine();

        int w = 0;
        int l = 0;


        if(a.equals("W")){
            w++;
        } else{
            l++;
        }

        if (b.equals("W")){
            w++;
        }else{
            l++;
        }

        if(c.equals("W")){
            w++;
        } else{
            l++;
        }
        if(d.equals("W")){
            w++;
        } else{
            l++;
        }
        if(e.equals("W")){
            w++;
        } else{
            l++;
        }
        if(f.equals("W")){
            w++;
        } else{
            l++;
        }
        
        if ( w == 5 || w==6){
            System.out.println(1);
        } else if(w ==3 || w == 4){
            System.out.println(2);
        } else if( w== 1 || w ==2){
            System.out.println(3);
        } else if( l == 6){
            System.out.println(-1);
        }


    }
}
