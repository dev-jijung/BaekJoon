import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int people = Integer.parseInt(sc.nextLine());
        int diceA = 0;
        int diceB = 0;
        int diceC = 0;
        int money = 0;
        int maxMoney = 0;
        
        for (int i = 0 ; i < people ; i++) {
            diceA = sc.nextInt();
            diceB = sc.nextInt();
            diceC = sc.nextInt();

            if (diceA == diceB && diceB == diceC) {
                money = 10000 + diceA * 1000;
            } else if (diceA != diceB && diceA != diceC && diceB != diceC) {
                money = Math.max(diceA, Math.max(diceB, diceC)) * 100;
            } else {
                if (diceA == diceB || diceA == diceC) {
                    money = 1000 + diceA * 100;
                } else if (diceB == diceC) {
                    money = 1000 + diceB * 100;
                }
            }

            if (money > maxMoney) {
                maxMoney = money;
            }
        }
        System.out.println(maxMoney);
    }
}