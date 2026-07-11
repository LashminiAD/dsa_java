import java.util.Scanner;

public class Main {
    public static String determineColor(String s) {
        // Write your logic here to determine the color based on the string s.
        // Return "Black" or "White" based on the problem statement.
        //a1
        char col = s.charAt(0); //'a'
        char row = s.charAt(1); //'1'

        int c = col - 'a' + 1; // 'a' - 'a' = 0 -> +1 = 1 
        int r = row - '0'; // '1' - '0' = 1

        if((c+r)%2==0) return "Black";

        return "White";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        String result = determineColor(s);
        System.out.println(result);
    }
}
