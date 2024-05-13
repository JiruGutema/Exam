package Question_Number_1;

import java.util.Scanner;

public class SearchAndCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Number to search: ");
        int searchNumber = scanner.nextInt();

        int count = 0;
        for (int num : arr) {
            if (num == searchNumber) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println(searchNumber + " repeated " + count + " times in the array.");
        } else {
            System.out.println(searchNumber + " is not found");
        }

        scanner.close();
    }
}
