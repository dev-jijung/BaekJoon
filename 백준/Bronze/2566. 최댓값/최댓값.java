import java.util.*;

public class Main {
    	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int row = 0;
        int column = 0;
        int input = 0;
        int max = 0;
        
        for (int i = 0 ; i < 9 ; i++) {
            for (int j = 0 ; j < 9 ; j++) {
                input = sc.nextInt();
            
                if (input > max) {
                    max = input;
                    row = i;
                    column = j;
                }
            }
        }
        
        System.out.println(max + "\n" + (row + 1) + " " + (column + 1));
    }
}