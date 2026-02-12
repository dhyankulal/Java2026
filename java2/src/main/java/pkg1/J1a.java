package pkg1;
import java.util.Scanner;

public class J1a {
    public static void main(String[] args) {
        char[][] board={
                {' ',' ',' '},{' ',' ',' '},{' ',' ', ' ' }
        };
        int count =0;
        while(true){
            System.out.println(board[0][0]+" | "+board[0][1]+" | "+board[0][2]);
            System.out.println("--+---+---");
            System.out.println(board[1][0]+" | "+board[1][1]+" | "+board[1][2]);
            System.out.println("--+---+---");
            System.out.println(board[2][0]+" | "+board[2][1]+" | "+board[2][2]);
            Scanner ding = new Scanner(System.in);
            System.out.println("Enter the row(1-3)");
            int row = ding.nextInt();
            System.out.println("Enter the column(1-3)");
            int col = ding.nextInt();
            if(count%2==0){
                char player = 'x';
                board[row-1][col-1] = player;
                count++;
                }else{
                char player = 'o';
                board[row-1][col-1] = player;
                count++;
            }
            if((board[0][0]=='x' && board[0][1]=='x' && board[0][2]=='x')||
                    (board[1][0]=='x' && board[1][1]=='x' && board[1][2]=='x')||
                    (board[2][0]=='x' && board[2][1]=='x' && board[2][2]=='x')||
                    (board[0][0]=='x' && board[1][1]=='x' && board[2][2]=='x')||
                    (board[0][2]=='x' && board[1][1]=='x' && board[2][0]=='x')||
                    (board[0][0]=='x' && board[1][0]=='x' && board[2][0]=='x')||
                    (board[0][1]=='x' && board[1][1]=='x' && board[2][1]=='x')||
                    (board[0][2]=='x' && board[1][2]=='x' && board[2][2]=='x')){
                System.out.println(board[0][0]+" | "+board[0][1]+" | "+board[0][2]);
                System.out.println("--+---+---");
                System.out.println(board[1][0]+" | "+board[1][1]+" | "+board[1][2]);
                System.out.println("--+---+---");
                System.out.println(board[2][0]+" | "+board[2][1]+" | "+board[2][2]);
                System.out.println("X win the match");
                break;

            } else if ((board[0][0]=='o' && board[0][1]=='o' && board[0][2]=='o')||
                    (board[1][0]=='o' && board[1][1]=='o' && board[1][2]=='o')||
                    (board[2][0]=='o' && board[2][1]=='o' && board[2][2]=='o')||
                    (board[0][0]=='o' && board[1][1]=='o' && board[2][2]=='o')||
                    (board[0][2]=='o' && board[1][1]=='o' && board[2][0]=='o')||
                    (board[0][0]=='o' && board[1][0]=='o' && board[2][0]=='o')||
                    (board[0][1]=='o' && board[1][1]=='o' && board[2][1]=='o')||
                    (board[0][2]=='o' && board[1][2]=='o' && board[2][2]=='o')) {
                System.out.println(board[0][0]+" | "+board[0][1]+" | "+board[0][2]);
                System.out.println("--+---+---");
                System.out.println(board[1][0]+" | "+board[1][1]+" | "+board[1][2]);
                System.out.println("--+---+---");
                System.out.println(board[2][0]+" | "+board[2][1]+" | "+board[2][2]);
                System.out.println("O win the match");
                break;
            }
        }
    }
}
