import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int c = 0;
		List<String> output = new ArrayList<String>();
		
        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            
            if (a == 0 && b == 0 && c == 0) {
            	break;
            }
            
            if (c - b == b - a) {
            	output.add("AP " + (c + (c - b)));
            } else if (c / b == b / a) {
            	output.add("GP " + (c * (c / b)));
            }
        }

        sc.close();
        
        for (int i = 0 ; i < output.size() ; i++) {
            System.out.println(output.get(i));
        }
    }
}