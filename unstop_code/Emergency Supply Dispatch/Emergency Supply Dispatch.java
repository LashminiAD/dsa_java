import java.util.*;

public class Main {
    public static List<Integer> dispatchOrder(int N, int K, List<Integer> priorities) {
        // Write your logic here.
        List<Integer> result = new ArrayList<>();
        // Placeholder return
        int last = priorities.size();
        Collections.sort(priorities);
        for(int i = last-1; i >= N-K; i--){
            result.add(priorities.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        List<Integer> priorities = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            priorities.add(scanner.nextInt());
        }

        List<Integer> result = dispatchOrder(N, K, priorities);
        for (int i = 0; i < result.size(); i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(result.get(i));
        }
        System.out.println();
    }
}
