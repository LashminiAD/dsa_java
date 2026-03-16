import java.util.Scanner;

public class SimpleArraySum {

    public static int simpleArraySum(int[] ar) {
        int sum = 0;
        for (int num : ar) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int[] ar = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = scanner.nextInt();
            }
            System.out.println(simpleArraySum(ar));
        }
    }
}
