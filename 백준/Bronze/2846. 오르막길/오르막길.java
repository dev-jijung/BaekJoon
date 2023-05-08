import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] input = new int[n];
        int maxHeight = 0;
        int tempHeight = 0;
        int startPoint = 0;
        int endPoint = 0;
        
        for (int i = 0 ; i < n ; i++) {
            input[i] = sc.nextInt();
        }
        
        sc.close();
        
        for (int i = 0 ; i < n - 1 ; i++) {
            if (input[i] < input[i + 1]) {
            	tempHeight += (input[i + 1] - input[i]);
            } else if (input[i] >= input[i + 1]) {
            	tempHeight = 0;
            }
            if (maxHeight < tempHeight) {
                maxHeight = tempHeight;
            }
        }
        System.out.println(maxHeight);
    }
}