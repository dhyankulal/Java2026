import java.util.Scanner;

public class J10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        char player = 'X';
        int moves = 0;

        while (true) {
            // Print board
            System.out.println("\nCurrent Board:");
            System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
            System.out.println("---+---+---");
            System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
            System.out.println("---+---+---");
            System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
            System.out.println();

            // Take input
            System.out.println("Player " + player + ", enter row (0-2): ");
            int r = sc.nextInt();
            System.out.println("Enter column (0-2): ");
            int c = sc.nextInt();

            // Check valid move
            if (r < 0 || r > 2 || c < 0 || c > 2 || board[r][c] != ' ') {
                System.out.println("Invalid move, try again!");
                continue;
            }

            // Place mark
            board[r][c] = player;
            moves++;

            // Check winner
            if (checkWin(board, player)) {
                System.out.println("\nPlayer " + player + " wins!");
                break;
            }

            // If all moves done -> draw
            if (moves == 9) {
                System.out.println("\nIt's a draw!");
                break;
            }

            // Change player
            player = (player == 'X') ? 'O' : 'X';
        }

        sc.close();
    }

    // Very simple win checker
    public static boolean checkWin(char[][] b, char p) {
        // Rows
        for (int i = 0; i < 3; i++)
            if (b[i][0] == p && b[i][1] == p && b[i][2] == p)
                return true;

        // Columns
        for (int i = 0; i < 3; i++)
            if (b[0][i] == p && b[1][i] == p && b[2][i] == p)
                return true;

        // Diagonals
        if (b[0][0] == p && b[1][1] == p && b[2][2] == p)
            return true;

        if (b[0][2] == p && b[1][1] == p && b[2][0] == p)
            return true;

        return false;
    }
}
