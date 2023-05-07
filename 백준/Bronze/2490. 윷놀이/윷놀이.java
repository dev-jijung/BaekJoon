import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] input = new int[2];
        String[] output = new String[3];
        
        for (int i = 0 ; i < 3 ; i++) {
            Arrays.fill(input, 0);
            
            for (int j = 0 ; j < 4 ; j++) {
                input[sc.nextInt()]++;
            }
            
            if (input[0] == 0) {
                output[i] = "E";
            } else if (input[0] == 1) {
                output[i] = "A";
            } else if (input[0] == 2) {
                output[i] = "B";
            } else if (input[0] == 3) {
                output[i] = "C";
            } else if (input[0] == 4) {
                output[i] = "D";
            }
        }
        
        for (int i = 0 ; i < output.length ; i++) {
            System.out.println(output[i]);
        }
    }
}