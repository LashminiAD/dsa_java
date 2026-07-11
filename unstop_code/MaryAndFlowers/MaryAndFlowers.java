import java.util.*;

public class Main {
    public static void find_flower_indices(int n, int t, int[] arr, int[] result) {
        // Write your logic here.
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == t) {
                    result[0] = i;
                    result[1] = j;
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] result = new int[2];
        find_flower_indices(n, t, arr, result);
        System.out.println(result[0] + " " + result[1]);
    }
}
