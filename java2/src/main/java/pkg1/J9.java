import java.util.Scanner;

public class J9{
    private static char[][] board = new char[3][3];
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        initBoard();
        System.out.println("Welcome to Tic-Tac-Toe!");
        printBoard();

        while (true) {
            System.out.println("Player " + currentPlayer + ", enter your move (1-9):");
            int move = -1;
            try {
                move = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number between 1 and 9.");
                continue;
            }

            if (!makeMove(move)) {
                System.out.println("Invalid move. Try again.");
                continue;
            }

            printBoard();

            if (isWinner(currentPlayer)) {
                System.out.println("Player " + currentPlayer + " wins! 🎉");
                break;
            }

            if (isBoardFull()) {
                System.out.println("It's a tie!");
                break;
            }

            switchPlayer();
        }

        sc.close();
        System.out.println("Game over. Thanks for playing!");
    }

    // Put numbers or spaces into the board
    private static void initBoard() {
        int count = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = (char) ('0' + count); // show 1..9 initially
                count++;
            }
        }
    }

    // Draw the board to the console
    private static void printBoard() {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(" ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("---+---+---");
        }
        System.out.println();
    }

    // Convert move 1-9 to board position and place current player's mark
    private static boolean makeMove(int move) {
        if (move < 1 || move > 9) return false;
        int row = (move - 1) / 3;
        int col = (move - 1) % 3;

        // If cell is already 'X' or 'O', it's invalid
        if (board[row][col] == 'X' || board[row][col] == 'O') {
            return false;
        }

        board[row][col] = currentPlayer;
        return true;
    }

    // Check all winning combinations
    private static boolean isWinner(char player) {
        // Rows & Columns
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player &&
                    board[i][1] == player &&
                    board[i][2] == player) return true;

            if (board[0][i] == player &&
                    board[1][i] == player &&
                    board[2][i] == player) return true;
        }

        // Diagonals
        if (board[0][0] == player &&
                board[1][1] == player &&
                board[2][2] == player) return true;

        if (board[0][2] == player &&
                board[1][1] == player &&
                board[2][0] == player) return true;

        return false;
    }

    // Check if board has any free cells left
    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // cells that still hold digits 1..9 are free
                if (board[i][j] != 'X' && board[i][j] != 'O') return false;
            }
        }
        return true;
    }

    private static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
}
