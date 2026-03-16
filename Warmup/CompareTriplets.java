import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class CompareTriplets {

    private static final int TRIPLET_SIZE = 3;

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aliceScore = 0;
        int bobScore = 0;
        for (int i = 0; i < TRIPLET_SIZE; i++) {
            if (a.get(i) > b.get(i)) {
                aliceScore++;
            } else if (a.get(i) < b.get(i)) {
                bobScore++;
            }
        }
        List<Integer> result = new ArrayList<>();
        result.add(aliceScore);
        result.add(bobScore);
        return result;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Integer> a = new ArrayList<>();
            for (int i = 0; i < TRIPLET_SIZE; i++) {
                a.add(scanner.nextInt());
            }
            List<Integer> b = new ArrayList<>();
            for (int i = 0; i < TRIPLET_SIZE; i++) {
                b.add(scanner.nextInt());
            }
            List<Integer> result = compareTriplets(a, b);
            System.out.println(result.get(0) + " " + result.get(1));
        }
    }
}
