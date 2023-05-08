import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] input = new String[5];
        boolean[] find = new boolean[5];
        String fbi = "FBI";
        
        for (int i = 0 ; i < 5 ; i++) {
            input[i] = sc.nextLine();
            if (input[i].contains(fbi)) {
                find[i] = true;
            } else {
                find[i] = false;
            }
        }
        
        sc.close();

        int count = 0;
        for (int i = 0 ; i < 5 ; i++) {
            if (find[i]) {
                System.out.print(i + 1 + " ");
                count++;
            }
        }
        
        if (count == 0) {
            System.out.print("HE GOT AWAY!");
        }
    }
}