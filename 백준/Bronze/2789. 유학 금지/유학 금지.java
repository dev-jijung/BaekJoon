import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();

        input = input.replaceAll("[CAMBRIDGE]", "");
		
        System.out.println(input);
	}
}