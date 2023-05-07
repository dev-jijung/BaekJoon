import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int index = 0;
        int input = 0;
        int max = 0;
        
        for (int i = 0 ; i < 9 ; i++) {
            input = Integer.parseInt(sc.nextLine());
            
            if (input > max) {
                max = input;
                index = i;
            }
        }
        
        System.out.println(max + "\n" + (index + 1));
    }
}