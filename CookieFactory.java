package pavlova;

import java.util.Scanner;

public class CookieFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBatch = Integer.parseInt(scanner.nextLine());

        boolean flour = false;
        boolean sugar = false;
        boolean eggs = false;

        String ingredients = "";

        for (int i = 1; i <= countBatch; i++) {
            while (!flour || !sugar || !eggs || !ingredients.equals("Bake!")) {
                ingredients = scanner.nextLine();

                if ("flour".equals(ingredients)) {
                    flour = true;
                } else if ("sugar".equals(ingredients)) {
                    sugar = true;
                } else if ("eggs".equals(ingredients)) {
                    eggs = true;
                }

                if (ingredients.equals("Bake!")) {
                    if (flour && sugar && eggs) {
                        System.out.printf("Baking batch number %d...%n", i);

                        flour = false;
                        sugar = false;
                        eggs = false;
                        break;
                    } else {
                        System.out.println("The batter should contain flour, eggs and sugar!");
                    }
                }
            }
        }
    }
}


