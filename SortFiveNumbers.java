package MuhriZ;

import java.util.Scanner;
import java.util.Arrays;

public class SortFiveNumbers {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            int[] numbers = new int[5];

            System.out.println("Enter 5 numbers:");
            for (int i = 0; i < 5; i++) {
                numbers[i] = scanner.nextInt();
            }

            Arrays.sort(numbers);

            System.out.println("Sorted numbers:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
                System.out.println();

                // Descending sort
                System.out.println("Sorted numbers (Descending):");
                for (int i = numbers.length - 1; i >= 0; i--) {
                    System.out.print(numbers[i] + " ");
                }
        }
    }
}