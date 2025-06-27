import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 5; // Size of each letter block

        for (int i = 0; i < n; i++) {
            // Letter J
            for (int j = 0; j < n; j++) {
                if ((i == 0) || (j == n / 2) || (i == n - 1 && j <= n / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            // Letter A
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j != 0 && j != n - 1) || (i == n / 2) || (j == 0 && i != 0) || (j == n - 1 && i != 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            // Letter Y
            for (int j = 0; j < n; j++) {
                if ((i == j && i < n / 2) || (i + j == n - 1 && i < n / 2) || (j == n / 2 && i >= n / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            // Letter A
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j != 0 && j != n - 1) || (i == n / 2) || (j == 0 && i != 0) || (j == n - 1 && i != 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            // Letter N
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            // Letter T
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            // Letter H
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            // Letter A
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j != 0 && j != n - 1) || (i == n / 2) || (j == 0 && i != 0) || (j == n - 1 && i != 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            // Letter N
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println(); // Move to next row
        }
    }
}
