import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputScore = new int[8];
        int[] sortScore = new int[8];
        int maxSum = 0;
        int[] maxNum = new int[5];
        
        for (int i = 0 ; i < 8 ; i++) {
            inputScore[i] = sc.nextInt();
            sortScore[i] = inputScore[i];
        }
        sc.close();
        
        Arrays.sort(sortScore);
        for (int i = 7 ; i > 2 ; i--) {
            maxSum += sortScore[i];
        }
        
        int k = 0;
        for (int j = 7 ; j > 2 ; j--) {
            for (int i = 0 ; i < 8 ; i++) {
                if (sortScore[j] == inputScore[i]) {
                    maxNum[k] = i;
                    k++;
                }
            }
        }
        
        Arrays.sort(maxNum);

        System.out.println(maxSum);
        for (int i = 0 ; i < 5 ; i++) {
            System.out.print(maxNum[i] + 1 + " ");
        }
    }
}