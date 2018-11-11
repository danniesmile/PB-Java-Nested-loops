package pavlova;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int counter = 0;

        for (int i = 0; i <= n; i++) { // x1
            for (int j = 0; j <= n; j++) { // x2
                for (int k = 0; k <= n; k++) { // x3
                    for (int l = 0; l <= n; l++) { // x4
                        for (int m = 0; m <= n; m++) { //x5
                            int result = i + j + k + l + m;
                            if (result == n) {
                                counter++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
