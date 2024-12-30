package work4;

import java.util.Scanner;

public class homework4_4 {

    public static void main(String[] args) {
        int[][] employees = {
                {25, 500},
                {19, 1500},
                {27, 1000},
                {34, 800},
                {42, 2000}
        };
        Scanner scanner = new Scanner(System.in);
        System.out.print("輸入預借金額: ");
        int amount = scanner.nextInt();

        int count = 0;
        System.out.print("可借錢的員工編號: ");
        for (int[] employee : employees) {
            if (employee[1] >= amount) {
                System.out.print(employee[0] + " ");
                count++;
            }
        }
        System.out.println("\n共 " + count + " 人有足夠的現金可借。");

        scanner.close();
   
    }
}
