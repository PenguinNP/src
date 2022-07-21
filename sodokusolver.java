public class sodokusolver {
	private static final int Board_Size = 9;

	public static void main(String[] args) {

	}

	public boolean checkRow(int[][] board, int row, int num) {
		for (int i = 0; i < Board_Size; i++) {
			if (board[row][i] == num) {
				return true;
			}
		}
		return false;
	}

	public boolean checkColumn(int[][] board, int column, int num) {
		for (int i = 0; i < Board_Size; i++) {
			if (board[i][column] == num) {
				return true;
			}
		}
		return false;
	}

	public boolean checkbox(int[][] board, int row, int column, int num) {
		int Row = row - row % 3;
		int Column = column - column % 3;
		for (int i = Row; i < Row + 3; i++) {
			for (int j = Column; j < Column + 3; j++) {
				if (board[i][j] == num) {
					return true;
				}
			}
		}
		return false;
	}

	boolean isValid(int[][] board, int row, int column, int num) {
		return !checkRow(board, row, num) && !checkColumn(board, column, num) && !checkbox(board, row, column, num);
	}

	boolean boardCheck(int[][] board) {
		for (int row = 0; row < Board_Size; row++) {
			for (int column = 0; column < Board_Size; column++) {
				if (board[row][column] == 0) {
					for (int numberToTry = 1; numberToTry <= Board_Size; numberToTry++) {
						if (isValid(board, row, column, numberToTry)) {
							board[row][column] = numberToTry;
							if (boardCheck(board)) {
								return true;
							} else {
								board[row][column] = 0;
							}
						}

					}
				}
			}
		}
		return false;

	}
}
