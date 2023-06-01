import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        sc.close();
        
        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();
        
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        
        int[] firstCount = new int[26];
        int[] secondCount = new int[26];
        
        for (int i = 0 ; i < firstArray.length ; i++) {
        	firstCount[firstArray[i] - 'a']++;
        }
        
        for (int i = 0 ; i < secondArray.length ; i++) {
        	secondCount[secondArray[i] - 'a']++;
        }
        
        int count = 0;
        for (int i = 0 ; i < firstCount.length ; i++) {
        	if (firstCount[i] != secondCount[i]) {
        		count = count + Math.abs(firstCount[i] - secondCount[i]);
        	}
        }
        
        System.out.println(count);
    }
}