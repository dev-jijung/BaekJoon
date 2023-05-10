import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = Integer.parseInt(sc.nextLine());
        String input = "";
        int countG = 0;
        int countB = 0;
        String[] output = new String[num];
        
        for (int i = 0 ; i < num ; i++) {
        	countG = 0;
        	countB = 0;
        	input = sc.nextLine();
        	for (int j = 0 ; j < input.length() ; j++) {
        		if (input.charAt(j) == 'g' || input.charAt(j) == 'G') {
        			countG++;
        		} else if (input.charAt(j) == 'b' || input.charAt(j) == 'B') {
        			countB++;
        		}
        	}
            
            if (countG > countB) {
                output[i] = input + " is GOOD";
            } else if (countG < countB) {
                output[i] = input + " is A BADDY";
            } else if (countG == countB) {
                output[i] = input + " is NEUTRAL";
            }
        }
        
        sc.close();
        
        for (int i = 0 ; i < num ; i++) {
	        System.out.println(output[i]);
        }
    }
}