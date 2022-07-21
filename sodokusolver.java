public class sodokusolver {
	private static final int Board_Size = 9;

	public static void main(String[] args) {
		int[][] board= {
				{7, 0, 2, 0, 5, 0, 6, 0, 0},
				{0, 0, 0, 0, 0, 3, 0, 0, 0},
				{1, 0, 0, 0, 0, 9, 5, 0, 0},
				{8, 0, 0, 0, 0, 0, 0, 9, 0},
				{0, 4, 3, 0, 0, 0, 7, 5, 0},
				{0, 9, 0, 0, 0, 0, 0, 0, 8},
				{0, 0, 9, 7, 0, 0, 0, 0, 5},
				{0, 0, 0, 2, 0, 0, 0, 0, 0},
				{0, 0, 7, 0, 4, 0, 2, 0, 3}
		};
		if(boardCheck(board)){
			System.out.println("Board is SolveAble");
		}
		else{
			System.out.println("Board is Invalid");
		}

		print(board);

	}
	private  static final void print(int[][] board){
		for ( int i=0;i<Board_Size;i++){
			for (int j=0;j<Board_Size;j++){
				System.out.print(board[i][j]);
			}
			System.out.println();
		}

	}

	private static final boolean checkRow(int[][] board, int row, int num) {
		for (int i = 0; i < Board_Size; i++) {
			if (board[row][i] == num) {
				return true;
			}
		}
		return false;
	}

	private static final boolean checkColumn(int[][] board, int column, int num) {
		for (int i = 0; i < Board_Size; i++) {
			if (board[i][column] == num) {
				return true;
			}
		}
		return false;
	}

	private static final boolean checkbox(int[][] board, int row, int column, int num) {
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

	private static final boolean isValid(int[][] board, int row, int column, int num) {
		return !checkRow(board, row, num) && !checkColumn(board, column, num) && !checkbox(board, row, column, num);
	}

	private static final boolean boardCheck(int[][] board) {
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
