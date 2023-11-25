package loop.test7RandomNumberBtw2Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SolveQuestion();
    }

    public static void SolveQuestion() {
        int trackingNo = -1;
        int answer = 0;
        int guessNumber = 17;
        System.out.println("let's guess the number between 1-100: ");

        String activePlayer = "";
        do {
            trackingNo++;
            activePlayer = FindActivePlayer(trackingNo);
            System.out.print("player " + activePlayer + " number : ");
            Scanner sc = new Scanner(System.in);
            answer = sc.nextInt();

            if (answer > guessNumber) {
                System.out.println("it's too high");
                System.out.println("------------------------ ");
            } else if (answer < guessNumber) {
                System.out.println("it's too low");
                System.out.println("------------------------ ");
            }
        } while (answer != guessNumber);

        System.out.println("bigo! correct number is : " + answer);
        System.out.println("the winner is : player " + activePlayer);
    }

    public static String FindActivePlayer(int trackingNo) {
        return trackingNo % 2 == 0 ? "A" : "B";
    }
}
