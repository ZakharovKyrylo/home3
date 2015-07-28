package home03;

import java.util.Random;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Game game = new Game();
        Random r= new Random();
        int random=r.nextInt(99+1);
        game.guessTheNumber(random);
    }
}

class Game{
    void guessTheNumber(int random){
        Scanner scanner = new Scanner(System.in);
        int num=0;
        while (true) {

            System.out.println("enter number");
            num = scanner.nextInt();
            if (num == random) {
                System.out.println("congratulations");
                return;
            } else if (num > random) {
                System.out.println("too high");
            } else {
                System.out.println("too low");
            }
        }
    }
}