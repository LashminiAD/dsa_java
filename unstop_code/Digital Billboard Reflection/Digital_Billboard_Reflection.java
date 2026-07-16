import java.util.Scanner;

public class Main {

    // Function to reflect the matrix horizontally
    public static int[][] reflectMatrix(int[][] matrix, int r, int c) {

        // Reverse each row
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c / 2; j++) {

                // Swap the left and right elements
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][c - 1 - j];
                matrix[i][c - 1 - j] = temp;
            }
        }

        return matrix;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        int c = scanner.nextInt();

        int[][] matrix = new int[r][c];

        // Read the matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Reflect the matrix
        int[][] result = reflectMatrix(matrix, r, c);

        // Print the reflected matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
