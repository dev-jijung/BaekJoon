import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] num = new int[n];
        int sum = 0;
        int maxSum = 0;
        
        for (int i = 0 ; i < n ; i++) {
            num[i] = sc.nextInt();
        }
        
        sc.close();
        
        for (int i = 0 ; i < n ; i++) {
            for (int j = i + 1 ; j < n ; j++) {
                for (int k = j + 1 ; k < n ; k++) {
                    sum = num[i] + num[j] + num[k];
                    if (sum <= m && sum > maxSum) {
                        maxSum = sum;
                    }
                }
            }
        }
        
        System.out.println(maxSum);
    }
}