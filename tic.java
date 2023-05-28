import java.util.Scanner;

public class tic{
		
	public static void main(String[] args){
		try (Scanner sc = new Scanner(System.in)) {
			char board[][] = new char[3][3];
			char player = 'x';
			boolean gameOver=false;
			
			for(int i=0;i<board.length;++i){
				for(int j=0;j<board[0].length;++j){
					board[i][j]=' ';
				}
			}
			
			while(!gameOver){
				printboard(board);
				System.out.println("Enter position "+player+" ");
				int x= sc.nextInt();
				int y=sc.nextInt();
				
				if(board[x][y] == ' '){
					board[x][y]=player;
					gameOver=haveWon(board,player);
					if(gameOver){
						System.out.println("Player "+player+" has won the Game!!!");
					}else{
						player=(player=='x') ? '0' : 'x';	
					}
				}else{
					System.out.println("Invalid move! ");
				}
			}
		}
		
	}

	public static void printboard(char board[][]){
		for(int i=0;i<board.length;++i){
			for(int j=0;j<board[0].length;++j){
				 System.out.print(board[i][j]+" | ");
			}
			System.out.println();
		}
	}
	
	public static boolean haveWon(char[][] board,char player){
		//row
		for(int i=0;i<board.length;++i){
			if(board[i][0]==player && board[i][1]==player && board[i][2]==player) return true;
		}
		//column	
		for(int j=0;j<board[0].length;++j){
			if(board[0][j]==player && board[1][j]==player && board[2][j]==player) return true;
		}
		//diagonal
		if (board[0][2] == player && board[1][1] == player && board[2][0] == player) return true;
		
		return false;
	}

}