package loop.test10DiscountRandom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("cost : ");
        int cost = sc.nextInt();
        int maxDiscount = 0;
        int randomRound = 3;

        for (int i = 1; i <= randomRound; i = i + 1) {
            //random discount
            int discount = getDiscount();
            if (discount > maxDiscount) {
                maxDiscount = discount;
            }
            System.out.println("discount percent " +(i) +" : "  + (discount));
        }


        int totalCost = (cost*(100-maxDiscount))/100;
        System.out.println ("you need to pay : " + totalCost);

    }

    public static int getDiscount() {
        int min = 0; // Minimum value of range
        int max = 20; // Maximum value of range
        return (int)Math.floor(Math.random() * (max - min + 1) + min);
    }

}
