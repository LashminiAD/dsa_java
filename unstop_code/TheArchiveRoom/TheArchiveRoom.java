import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    // Function where the user will implement the logic
    public static int getTopRecord(int n, List<String> operations) {
        // User logic goes here
        Stack<Integer> rec = new Stack<>();
        for(int i = 0; i<n; i++){
            String[] parts = operations.get(i).split(" ");
            if(parts[0].equals("ADD"))
                rec.push(Integer.parseInt(parts[1]));
            else{
                if(!rec.isEmpty())
                rec.pop(); 
            }
        }
        if(!rec.isEmpty())
            return rec.peek();
        
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character
        List<String> operations = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            operations.add(scanner.nextLine());
        }

        // Call the user logic function and print the output
        int result = getTopRecord(n, operations);
        System.out.println(result);
    }
}
