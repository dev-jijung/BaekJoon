import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        String[][] output = new String[t][2];
        int x = 0;
        int y = 0;
        
        for (int i = 0 ; i < t ; i++) {
        	x = sc.nextInt();
        	y = sc.nextInt();
        	
        	for (int j = 0 ; j < 2 ; j++) {
                output[i][j] = "No";
        		if (j == 0 && x < 24 && y < 60) {
        			output[i][j] = "Yes";
        		}
        		
        		if (j == 1 && x > 0 && x <= 12) {
        			switch(x) {
        			case 1:
        			case 3:
        			case 5:
        			case 7:
        			case 8:
        			case 10:
        			case 12:
        				if (y > 0 && y <= 31) {
        					output[i][j] = "Yes";
        				}
        				break;
        			case 4:
        			case 6:
        			case 9:
        			case 11:
        				if (y > 0 && y <= 30) {
        					output[i][j] = "Yes";
        				}
        				break;
        			case 2:
        				if (y > 0 && y <= 29) {
        					output[i][j] = "Yes";
        				}
        				break;
        			}
        		}
            }
        }
        
        sc.close();
        
        for (int i = 0 ; i < t ; i++) {
            for (int j = 0 ; j < 2 ; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }
}