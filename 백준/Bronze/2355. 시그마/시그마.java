import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long inputA = sc.nextLong();
        long inputB = sc.nextLong();
        long temp = 0;
        long sumA = 0;
        long sumB = 0;
        long output = 0;
        
        if (inputA > inputB) {
            temp = inputA;
            inputA = inputB;
            inputB = temp;
        }
        
        if (inputA < 0 && inputB < 0) {
            sumA = -(inputA * (inputA - 1) / 2);
            sumB = -((inputB + 1) * inputB / 2);
            output = sumA - sumB;
        } else if (inputA < 0 && inputB > 0) {
            sumA = -(inputA * (inputA - 1) / 2);
            sumB = (inputB * (inputB + 1) / 2);
            output = sumA + sumB;
        } else if (inputA > 0 && inputB > 0) {
            sumA = ((inputA - 1) * inputA / 2);
            sumB = (inputB * (inputB + 1) / 2);
            output = sumB - sumA;
        }
        
        System.out.println(output);
    }
}