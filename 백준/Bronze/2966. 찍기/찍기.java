import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String ans = sc.nextLine();
        char[] answer = ans.toCharArray();
        String[] people = {"ABC", "BABC", "CCAABB"};
        String[] name = {"Adrian", "Bruno", "Goran"};
        int[] count = new int[3];
        		
        sc.close();
        
        for (int i = 0 ; i < 3 ; i++) {
        	char[] temp = people[i].toCharArray();
        	for (int j = 0 ; j < n ; j++) {
        		if (answer[j] == temp[(temp.length + j) % temp.length]) {
        			count[i]++;
        		}
        	}
        }
        
        int maxCount = Math.max(count[0], Math.max(count[1], count[2]));
        
        System.out.println(maxCount);
        for (int i = 0 ; i < 3 ; i++) {
        	if (maxCount == count[i]) {
        		System.out.println(name[i]);
        	}
        }
        
    }
}