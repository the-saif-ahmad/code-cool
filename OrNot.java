import java.util.*;

public class OrNot {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int k = Integer.parseInt(in.nextLine());

		while (k-- > 0) {
			String line = in.nextLine();
			System.out.printf("To %s or not to %s.\n", line, line);
		}
	}
}
