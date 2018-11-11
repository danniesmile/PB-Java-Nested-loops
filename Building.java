package nested_loops;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countFloors = Integer.parseInt(scanner.nextLine());
        int countRooms = Integer.parseInt(scanner.nextLine());

        for (int i = countFloors; i >= 1; i--) {

            for (int j = 0; j < countRooms; j++) {

                if (i == countFloors) {
                    System.out.print("L");
                } else if (i % 2 != 0) {
                    System.out.print("A");
                } else {
                    System.out.print("O");
                }
                System.out.print("" + i + j + " ");
            }

            System.out.println();
        }
    }
}
