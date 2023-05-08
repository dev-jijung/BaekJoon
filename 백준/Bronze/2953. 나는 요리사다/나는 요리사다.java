import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int maxScore = 0;
        int maxScorePeople = 0;
        int sumScore = 0;
        
        for (int i = 0 ; i < 5 ; i++) {
            for (int j = 0 ; j < 4 ; j++) {
                sumScore += sc.nextInt();
            }
            if (sumScore > maxScore) {
                maxScore = sumScore;
                maxScorePeople = i + 1;
            }
            sumScore = 0;
        }
        
        sc.close();
        
        System.out.println(maxScorePeople + " " + maxScore);
    }
}