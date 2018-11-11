package pavlova;


import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")) {
            double savedMoney = 0;
            double neededMoney = Double.parseDouble(scanner.nextLine());
            while (savedMoney < neededMoney) {
                double save = Double.parseDouble(scanner.nextLine());
                savedMoney += save;
            }
            System.out.printf("Going to %s!%n", destination);
            destination = scanner.nextLine();
        }
    }
}

