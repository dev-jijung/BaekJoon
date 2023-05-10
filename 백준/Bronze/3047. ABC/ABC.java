import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] nums = new int[3];
        
        for (int i = 0 ; i < 3 ; i++) {
        	nums[i] = sc.nextInt();
        }
        
        sc.nextLine();
        Arrays.sort(nums);
        
        Map <Character, Integer> output = new HashMap<Character, Integer>();
        
        for (int i = 0 ; i < 3 ; i++) {        	
        	output.put((char)(65 + i), nums[i]);
        }
        
        char[] alpha = sc.nextLine().toCharArray();
        sc.close();
        
        for (int i = 0 ; i < 3 ; i++) {
	        System.out.print(output.get(alpha[i]) + " ");
        }
    }
}