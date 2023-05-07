import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int people = Integer.parseInt(sc.nextLine());
        int[] dice = new int[7];
        int pairA = 0;
        int pairB = 0;
        int pairCheck = 1;
        int oneCheck = 1;
        int maxOne = 0;
        int money = 0;
        int maxMoney = 0;
        
        for (int i = 0 ; i < people ; i++) {
            Arrays.fill(dice, 0);
            pairCheck = 1;
            maxOne = 0;
            
            for (int j = 0 ; j < 4 ; j++) {
                dice[sc.nextInt()]++;
            }
     
            for (int k = 1 ; k < 7 ; k++) {
                if (dice[k] == 4) {
                    money = 50000 + k * 5000;
                    break;
                } else if (dice[k] == 3) {
                    money = 10000 + k * 1000;
                    break;
                } else if (dice[k] == 2) {
                    if (pairCheck == 1) {
                        pairA = k;
                        money = 1000 + pairA * 100;
                        pairCheck++;
                    } else if (pairCheck == 2) {
                        pairB = k;
                        money = 2000 + pairA * 500 + pairB * 500;
                        break;
                    }
                } else if (dice[k] == 1) {
                    if (maxOne < k) {
                        maxOne = k;
                    }
                    if (oneCheck == 4) {
                        money = maxOne * 100;
                    }
                    oneCheck++;
                }
            }
            
            if (maxMoney < money) {
                maxMoney = money;
            }
        }
        
        System.out.println(maxMoney);
    }
}