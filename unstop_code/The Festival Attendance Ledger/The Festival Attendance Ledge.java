import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] visitor_ids = new int[n];
        for (int i = 0; i < n; i++) {
            visitor_ids[i] = scanner.nextInt();
        }

        int[] result = findMostFrequent(visitor_ids);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] findMostFrequent(int[] visitor_ids) {
        // Write your logic here.
        int n = visitor_ids.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxFreq = 0;
        int answer = Integer.MAX_VALUE;

        for(int i= 0; i<n; i++){
            map.put(visitor_ids[i], map.getOrDefault(visitor_ids[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int id = entry.getKey();
            int freq = entry.getValue();
            if(freq > maxFreq){
                maxFreq = freq;
                answer = id;
            }else if(freq == maxFreq && id < answer){
                answer = id;
            }
        }

        return new int[]{answer, maxFreq};
    }
}
