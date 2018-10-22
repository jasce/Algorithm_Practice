
import java.util.*;

class Nqueens {
    
    
    public static boolean is_invalid_move(int[][] board, int x , int y, int number) {
        int arr_length = board[0].length;
        // Check every row at xth index
        for(int i=0; i< arr_length; i++) {
            if(board[x][i] == 1)  {
                return true;    
            }
        }
        
        // Check every column at yth index
        for(int i=0; i< arr_length; i++) {
            if(board[i][y] == 1)  {
                return true;
            }
        }
        
        // for(int i=0; i < arr_length; i++) {
        //     for(int j=0; j < arr_length; j++) {
                
        //     }
        // }
        
        return false;
        
        
    }
    
    public static boolean print_n_queens(int[][] board, int number) {
        
        for(int i=0; i< number; i++) {
            for(int j=0;j<number; j++) {
                if(is_invalid_move(board, i, j, number)) {
                    continue;
                }
                board[i][j] = 1;
                if(print_n_queens(board,number-1)) {
                    return true;
                }
                board[i][j]=0;
            }
        }
        return false;
    }
    
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        int [][] board = new int[number][number];
        if(print_n_queens(board, number)) {
            for(int i=0; i< number; i++) {
                for(int j=0; j< number; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println("");
            }
        }

    }
}
