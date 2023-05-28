import java.util.*;
public class nq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of queens " );
        int n = sc.nextInt();

        char board[][] = new char[n][n];
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                board[i][j] = '.';
            }
        }
        List<List<String>>sol = new List<List<String>>();
        
        place(board,sol,n,0);

        System.out.println(sol);

    }
    public static void place(char[][] board, int n, List<List<String>>sol,int col){
        if(col==board.length){
            saveboard(board,sol);
            return;
        }

        for(int row=0;row<n;++row){
            if(issafe(row,col,board)){
                board[row][col]='Q';
                place(board,n,sol,col++);
            }
                board[row][col]='.';
        }
    }
    public static boolean issafe(int r, int c,char[][] board) {
        // horizontal
        for(int j=0;j<board.length;++j){
            if(board[r][j]=='Q') return false;
        }
        // vertical
        for(int i=0;i<board.length;++i){
            if(board[i][c]=='Q') return false;
        }
        // diagonal upper left
        int row=r;
        for(int col=c;col>=0 && row>=0;col--,row--){
            if(board[row][col]=='Q') return false;
        }
        // upper right
        for(int col=c;col<board.length && row>=0;col++,row--){
            if(board[row][col]=='Q') return false;
        }
        // lower left
        for(int col=c;col>=0 && row<board.length;row++,col--){
            if(board[row][col]=='Q') return false;
        }
        // lower right
        for(int col=c;col<board.length && row<board.length;col++,row++){
            if(board[row][col]=='Q') return false;
        }
        return true;
    }
    public static void saveboard(char[][] board,List<List<Strings>>sol){
        for(int i=0;i<board.length;++i){
            List<String>ans = new List<String>();
            for(int j=0;j<board.length;++j){
                if(board[i][j]=='Q'){
                    String a = ""+i+j;
                    ans.add(a);
                }
            }
            sol.add(ans);
        }
    }
}
