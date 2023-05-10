import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        
        sc.close();
        
        int col = 1;
        int row = 1;
        
        for (int i = 0 ; i < n ; i++) {
        	if (i % 2 == 0) {
        		col++;
        	} else {
        		row++;
        	}
        }

        System.out.println(col * row);
    }
}