import java.util.*;

public class Main {

    public static int computeMinimumEnergy(int N, int[] energyValues) {

        int[] dp = new int[N];
        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;

        for (int i = 1; i < N; i++) {

            for (int j = 0; j < i; j++) {

                int jumpCost = Math.abs(energyValues[j] - energyValues[i]) * (i - j);

                dp[i] = Math.min(dp[i], dp[j] + jumpCost);
            }
        }

        return dp[N - 1];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] energyValues = new int[N];

        for (int i = 0; i < N; i++) {
            energyValues[i] = sc.nextInt();
        }

        System.out.println(computeMinimumEnergy(N, energyValues));

        sc.close();
    }
}
