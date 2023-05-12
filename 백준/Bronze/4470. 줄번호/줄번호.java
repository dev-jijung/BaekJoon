import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String[] output = new String[n];
        
        sc.nextLine();
        for (int i = 0 ; i < n ; i++) {
            output[i] = (i + 1) + ". " + sc.nextLine();
        }
        
        sc.close();
        
        for (int i = 0 ; i < n ; i++) {
            System.out.println(output[i]);
    	}
    }
}