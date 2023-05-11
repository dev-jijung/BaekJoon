import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int scoreSumA = 0;
        int scoreSumB = 0;
        int[] scoreA = new int[9];
        int[] scoreB = new int[9];
        
        for (int i = 0 ; i < 9 ; i++) {
        	scoreA[i] = sc.nextInt();
        }
        
        for (int i = 0 ; i < 9 ; i++) {
        	scoreB[i] = sc.nextInt();
        }
        
        sc.close();
        
        for (int i = 0 ; i < 9 ; i++) {
        	scoreSumA += scoreA[i];
        	
	        if (scoreSumA > scoreSumB) {
	        	System.out.println("Yes");
	        	break;
	        }
	        
	        scoreSumB += scoreB[i];

	        if (i == 8) {
	        	System.out.println("No");
	        }
        }
    }
}