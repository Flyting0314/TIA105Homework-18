package work3;

import java.util.*;

public class Lotto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入你不要的數字(1-9): ");
        int dontlikenumber = scanner.nextInt();

        if (dontlikenumber < 1 || dontlikenumber > 9) {
            System.out.println("錯誤,請輸入1~9之間的數字");
        } else {
            List<Integer> numbers = new ArrayList<>();
            for (int i = 1; i <= 49; i++) {
                if (i / 10 != dontlikenumber && i % 10 != dontlikenumber) {
                    numbers.add(i);
                }
            }

            Collections.shuffle(numbers);
            System.out.println("亂數選出的6個號碼: " + numbers.subList(0, 6));
        }

        scanner.close();
    }
}


 
	