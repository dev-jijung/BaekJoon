import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String no = " is NOT a multiple of ";
        String yes = " is a multiple of ";
        List<Integer> output = new ArrayList<Integer>();
        int num = 0;

        while (true) {
            num = sc.nextInt();
            if (num == 0) {
                break;
            } else {
                output.add(num);
            }
        }
        
        sc.close();
        
        for (int i = 0 ; i < output.size() ; i++) {
            if (output.get(i) % n == 0) {
                System.out.println(output.get(i) + yes + n +".");
            } else if (output.get(i) % n != 0) {
                System.out.println(output.get(i) + no + n +".");
            }
        }
    }
}