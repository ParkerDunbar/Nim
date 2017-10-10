package Stuffs0;

public class NimWaterfall {

	public static void main(String[] args) {
		int[] heaps = FillHeap((int) (Math.random() * (2) + .5));

		int turn = 0;
		boolean playing = true;
			while (playing) {
				for (int i = 0; i < 4; i++) {
					System.out.println(heaps[i]);
				}
				System.out.println();
				heaps = AI(heaps);
				turn = SwitchPlayer(turn);
				if (WinCondition(heaps)) {
					System.out.println((turn + 1) + " wins!");
					System.out.println();
					playing = false;
//					heaps = FillHeap((int) (Math.random() * (2) + .5));
//					turn = 0;
				}
			}

	}

	public static int[] AI(int[] heaps) {
		int size = 4;
		if (heaps[3] == 0) {
			size = 3;
			if (heaps[2] == 0) {
				size = 2;
			}
		}
		int pickPile = 0;
		boolean Success = false;
		while (!Success) {
			pickPile = (int) (Math.random() * (size - 1) + .5);
			if (heaps[pickPile] != 0) {
				Success = true;
			}
		}
		int pickAmount = (int) (Math.random() * (heaps[pickPile] - 1) + 1.5);
		heaps[pickPile] -= pickAmount;
		return heaps;
	}

	public static boolean WinCondition(int[] heaps) {
		if ((heaps[0] + heaps[1] + heaps[2] + heaps[3]) == 0) {
			return true;
		}
		return false;
	}

	public static int SwitchPlayer(int whoseTurn) {
		if (whoseTurn == 0) {
			return 1;
		} else if (whoseTurn == 1) {
			return 0;
		} else {
			return -1;
		}
	}

	public static int[] FillHeap(int difficulty) {
		int[] heaps = new int[4];
		heaps[0] = 2;
		if (difficulty == 0) {
			heaps[1] = 2;
		} else if (difficulty == 1) {
			heaps[1] = 5;
			heaps[2] = 7;
		} else if (difficulty == 2) {
			heaps[1] = 3;
			heaps[2] = 8;
			heaps[3] = 9;
		}
		return heaps;
	}

}
