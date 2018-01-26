import java.util.*;

public class Dream {
	static int[][][] rooms;
	static int sum;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int cases = Integer.parseInt(in.nextLine());

		while (cases-- > 0) {
			sum = 0;
			int[] dimensions = Arrays.stream(in.nextLine().split(" ")).mapToInt(c -> Integer.parseInt(c)).toArray();

			rooms = new int[dimensions[2]][dimensions[0]][dimensions[1]];

			for (int z = 0; z < dimensions[2]; z++) {
				for (int x = 0; x < dimensions[0]; x++) {
					String line = in.nextLine();

					rooms[z][x] = Arrays.stream(line.split("")).mapToInt(c -> c.equals("#") ? 0 : 1).toArray();
				}
			}

			int[] start = Arrays.stream(in.nextLine().split(" ")).mapToInt(c -> Integer.parseInt(c)).toArray();

			floodFill(start[0], start[1], start[2]);

			System.out.println(sum);
		}
	}

	public static void floodFill(int x, int y, int z) {
		if (x >= rooms[0].length || y >= rooms[0][0].length || z >= rooms.length)
			return;

		if (x < 0 || y < 0 || z < 0)
			return;

		if (rooms[z][x][y] == 0 || rooms[z][x][y] == 2)
			return;

		if (rooms[z][x][y] == 1) {
			rooms[z][x][y]++;
			sum++;
		}

		floodFill(x + 1, y, z);
		floodFill(x - 1, y, z);
		floodFill(x, y + 1, z);
		floodFill(x, y - 1, z);
		floodFill(x, y, z + 1);
		floodFill(x, y, z - 1);
	}
}
