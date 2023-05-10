import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        
        String[] input = new String[n];
        
        for (int i = 0 ; i < n ; i++) {
            input[i] = sc.nextLine();
        }
        
        sc.close();
        
        for (int i = 0 ; i < n ; i++) {
        	System.out.println(input[i].substring(0, 1).toUpperCase() + input[i].substring(1));
        }
    }
}