import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		double a = 0;
		double b = 0;
		double c = 0;
		List<String> output = new ArrayList<String>();
		String impossible = "Impossible.";
		
        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            
            if (a == 0 && b == 0 && c == 0) {
            	break;
            }
            
            if (a == -1) {
        		if ((a = Math.sqrt(Math.pow(c, 2) - Math.pow(b, 2))) + b > c) {
        			output.add(String.format("a = %.3f", a));
        		} else {
        			output.add(impossible);
        		}
        	} else if (b == -1) {
        		if ((b = Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2))) + a > c) {
        			output.add(String.format("b = %.3f", b));
        		} else {
        			output.add(impossible);
        		}
        	} else if (c == -1) {
        		if (a + b > (c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)))) {
        			output.add(String.format("c = %.3f", c));
        		} else {
        			output.add(impossible);
        		}
        	}
        }

        sc.close();
        
        for (int i = 0 ; i < output.size() ; i++) {
            System.out.println("Triangle #" + (i + 1));
            System.out.println(output.get(i));
            System.out.println();
        }
    }
}