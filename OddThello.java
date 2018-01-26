import java.util.*;

public class OddThello {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int cases = Integer.parseInt(in.nextLine());

		while (cases-- > 0) {
			int nums = Integer.parseInt(in.nextLine());

			int sum = 0;

			while (nums-- > 0) {
				int n = Integer.parseInt(in.nextLine());

				if (n % 2 == 0) sum -= n;
				else sum += n;
			}

			if (sum >= 0)
				System.out.println("FAITHFUL");
			else
				System.out.println("UNFAITHFUL");
		}
	}
}
