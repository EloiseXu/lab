package lab;

public class Money {
	public static String check(int x) {
		int[] coin = new int[8];
		coin[0] = 50;
		coin[1] = 20;
		coin[2] = 10;
		coin[3] = 5;
		coin[4] = 5;
		coin[5] = 1;
		coin[6] = 1;
		coin[7] = 1;
		for (int i = 0; i<8; i++) {
			if (x>=coin[i]) {
				x -= coin[i];
			}
		}
		if (x > 0) {
			return "No";
		}else {
			return "Yes";
		}
	}

}
