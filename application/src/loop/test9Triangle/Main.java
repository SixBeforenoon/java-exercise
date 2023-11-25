package loop.test9Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input size : ");
        int height = sc.nextInt();
        if (height > 9) {
            System.out.print("Input must be between 1 to 9");
            return;
        }

        /* Print
         *
         **
         ***
         */

        //loop for height
        for (int i = 1; i <= height; i = i + 1) {

            //loop for space
            for (int space = 1; space <= height-i ; space = space + 1) { //2
                System.out.print(" ");
            }//

            //loop for str
            for (int star = 1; star <= i; star = star+1) {
                System.out.print("*");
            }

            //print new line
            System.out.println();

        }

    }
}
