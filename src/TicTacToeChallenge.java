
public class TicTacToeChallenge {
	public int checkTicTacToe(int[][] board) {
		Boolean openspace = false;
		Boolean Xwin = false;
		Boolean Owin = false;
		Boolean contin = false;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 0) {
					openspace = true;
				}
			}
		}
		for (int k = 0; k < board.length; k++) {

			if (board[k][0] == board[k][1] && board[k][0] == board[k][2]) {
				if (board[k][0] == 1) {
					Xwin = true;
				}
				if (board[k][0] == 2) {
					Owin = true;
				}
			}
		}
		for (int k = 0; k < board.length; k++) {
			if (board[0][k] == board[1][k] && board[0][k] == board[2][k]) {
				if (board[0][k] == 1) {
					Xwin = true;
				}
				if (board[0][k] == 2) {
					Owin = true;
				}
			}
		}
		if (board[0][0] == board[1][1] && board[0][0] == board[2][2]
				|| board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
			if (board[1][1] == 1) {
				Xwin = true;
			}
			if (board[1][1] == 2) {
				Owin = true;
			}
		}

		if (openspace == true && Xwin == false && Owin == false) {
			contin = true;
		}

		if (contin) {
			return -1;
		}
		if (Xwin) {
			return 1;
		}
		if (Owin) {
			return 2;
		} else {
			return 0;
		}
	}
}
