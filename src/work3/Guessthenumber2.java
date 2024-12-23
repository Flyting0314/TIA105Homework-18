package work3;

import java.util.Scanner;
import java.util.Random;

public class Guessthenumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = new Random().nextInt(20); // 產生 0~19 的亂數

        System.out.println("猜數字遊戲開始！請輸入 0 到 19 的數字。");

        while (true) {
            System.out.print("請輸入數字：");
            int guess = scanner.nextInt();

            if (guess == randomNumber) {
                System.out.println("恭喜，猜對了！答案是：" + randomNumber);
                break;
            } else {
                System.out.println("猜錯了，再試一次");
                
                System.out.println("加油!!");
               
            }
        }

        scanner.close();
    }
}
