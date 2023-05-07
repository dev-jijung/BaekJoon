import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();

		char[] removeAlpha = "CAMBRIDGE".toCharArray();
    
		for (int i = 0 ; i < removeAlpha.length ; i++) {
			if (input.indexOf(removeAlpha[i]) > -1) {
				input = input.replace(String.valueOf(removeAlpha[i]), "");
			}
		}
		System.out.println(input);
	}
}