import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int[] frequency = new int[n];
        int count = 0;
        int start = 0;
        int distance = 0;
  
        for (int i = 0 ; i < n ; i++) {
            frequency[i] = sc.nextInt();
        }
        
        sc.close();
        
        distance = Math.abs(b - a);
        start = a;
        
        for (int i = 0 ; i < n ; i++) {
            if (distance > Math.abs(b - frequency[i])) {
                distance = Math.abs(b - frequency[i]);
                start = frequency[i];
                count = 1;
            }
        }
        
        if (start > b) {
            while (start - b > 0) {
                count++;
                start--;
            }
        } else if(start < b) {
            while (start - b < 0) {
                count++;
                start++;
            }
        }
        
        System.out.println(count);
    }
}