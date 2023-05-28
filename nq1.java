import java.util.*;
public class nq1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        char board[][] = new board[n][n];
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                board[i][j]='.';
            }
        }
        place(0,board,n);
    }
    static void place(int col,char board[][],int n){
        if(col==n){
            printBoard(board);
            return;
        }
        for(int row=0;row<n;row++){
            if(issafe(row,col,board)){
                board[row][col]='Q';
                place(col+=1,board,n);
                board[row][col]='.';
            }
        }
    }
    static boolean issafe(int row,int col,char board[][]){
        for(int )

        return false;
    }
    static void printBoard(char[][] board){
        for(int i=0;i<board.length;i++){
            String s="";
            for(int j=0;j<board.length;++j){
                if(board[i][j]=='Q'){
                    s=""+i+j;
                }
            }
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
