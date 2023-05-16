import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] input = new int[4];
        
        for (int i = 0 ; i < 4 ; i++) {
            input[i] = sc.nextInt();
        }
        
        sc.close();

        Arrays.sort(input);
        
        int a = (input[0] < input[1]) ? input[0] : input[1];
        int b = (input[2] < input[3]) ? input[2] : input[3];

        System.out.println(a * b);
    }
}