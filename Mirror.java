import java.util.*;
import java.text.*;

public class Mirror {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int cases = Integer.parseInt(in.nextLine());

		while (cases-- > 0) {
			String line = in.nextLine();

			int[] nums = Arrays.stream(line.split(":")).mapToInt(n -> Integer.parseInt(n)).toArray();

			int hours = 11-(nums[0] % 12);
			if(nums[1]==0)
				hours++;
			if (hours == 0)
				hours = 12;

			int mins = (60 - nums[1]) % 60;

			String x = Integer.toString(mins);

			if (mins == 0) {
				x = "00";
			}

			System.out.printf("%d:%s\n", hours, x);
		}
	}
}
