import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int chicken = sc.nextInt();
        int coke = sc.nextInt();
        int beer = sc.nextInt();
        int count = 0;
        
        for (int i = 0 ; i < chicken ; i++) {
        	if ((coke >= 2 || beer >= 1) && count <= chicken) {
        		if (coke >= 2) {
        			coke = coke - 2;
        		} else if (beer >= 1) {
        			beer = beer - 1;
        		}
        		count++;
        	}
        }
        
        System.out.println(count);
    }
}