package nested_loops;

import java.util.Scanner;

public class NameWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int maxSum = 0;
        String maxName = "";
        while (!name.equals("STOP")) {
            int sumSymbols = 0;

            for (int i = 0; i < name.length(); i++) {
                char symbol = name.charAt(i);
                sumSymbols += symbol;
            }

            if (sumSymbols > maxSum) {
                maxSum = sumSymbols;
                maxName = name;
            }
            name = scanner.nextLine();
        }
        System.out.printf("Winner is %s - %d!", maxName, maxSum);
    }
}
