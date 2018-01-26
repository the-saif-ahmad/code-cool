import java.util.*;
import java.util.stream.Collectors;

public class Love {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			String[] line = in.nextLine().split(" ");
			int shift = Integer.parseInt(line[0]);
			String str = line[1];
			String result = "";

			for (int i = 0; i < str.length(); i++) {
				int c = str.charAt(i) + shift;

				if (c > 122) {
					c -= 26;
				}

				result += (char)c;
			}

			System.out.println(result);
		}
	}
}
