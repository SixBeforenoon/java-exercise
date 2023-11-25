package loop.test8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("start number : ");
        Scanner sc = new Scanner(System.in);
        int startNumber = sc.nextInt();

        System.out.print("end number: ");
        Scanner sc2 = new Scanner(System.in);
        int endNumber = sc2.nextInt();
        int a =0;

        for (int i = startNumber; i <= endNumber;i = i+1) {
            if (i % 7 == 0) {
                a = a+1;
            }
        }
        System.out.println("answer : " + a);
    }
}
