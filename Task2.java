package home03;

import java.util.Random;
import java.util.Scanner;

public class Task2 {

    void game(int random){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        int num=scanner.nextInt();
        if(num==random) {
            System.out.println("congratulations");
            return;
        }
        else if(num>random){
            System.out.println("too high");
            game(random);
        }
        else {
            System.out.println("too low");
            game(random);
        }
    }

    public static void main(String[] args) {
        Task2 task2=new Task2();
        Random r= new Random();
        int random=r.nextInt(99+1);
//        System.out.println(random);
        task2.game(random);

    }
}
