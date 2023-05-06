import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long input = Long.parseLong(sc.nextLine());
        long output = 0;
        
        for (long i = 1 ; i < input ; i++) {
            output = output + ((input + 1) * i); 
        }
        
        System.out.println(output);
    }
}