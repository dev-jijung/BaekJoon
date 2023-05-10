import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int r = sc.nextInt();
        int c = sc.nextInt();
        int zr = sc.nextInt();
        int zc = sc.nextInt();
        
        sc.nextLine();
        
        char[][] newspaper = new char[r][c];
        
        for (int i = 0 ; i < r ; i++) {
        	newspaper[i] = sc.nextLine().toCharArray();
        }
        
        sc.close();
        
        for (int i = 0 ; i < r ; i++) {
        	for (int l = 0 ; l < zr ; l++) {
	        	for (int j = 0 ; j < c ; j++) {
	        		for (int k = 0 ; k < zc ; k++) {
	        			System.out.print(newspaper[i][j]);        		
	        		}
	        	}
	        	System.out.println();
        	}
        }
    }
}