import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
	
	static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
	static ArrayList<Integer> compPositions = new ArrayList<Integer>();

	public static void main(String[] args) 
	
	{
		
		char [] [] board = {{'|', ' ','|', ' ', '|', ' ','|' }, 
				{'|', '-','+', '-', '+', '-','|'},
				{'|', ' ','|', ' ', '|', ' ','|'}, 
				{'|', '-','+', '-', '+', '-','|'}, 
				{'|', ' ','|', ' ', '|', ' ','|'}, 
				{'|', '-','+', '-', '+', '-','|'} };
		
			printBoard(board);
			
			while(true) {
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("Enter your placement: (1-9)");
				int playerPosition = scanner.nextInt();
				while (playerPositions.contains(playerPosition) || compPositions.contains(playerPosition)) {
					System.out.println("Position taken, choose another.");
					playerPosition = scanner.nextInt();
				}
				placeTurn(board, playerPosition, "player");
				
				Random random = new Random();
				int compPosition = random.nextInt(9)+ 1;
				while (compPositions.contains(compPosition) || playerPositions.contains(compPosition)) {
					System.out.println("Position taken, choose another.");
					compPosition = random.nextInt(9) + 1;
			
				}
				placeTurn(board, compPosition, "comp");
				
				printBoard(board);
				String result = checkWinner();
				System.out.println(result);
				
				
			}
		
			
		}
		
		public static void printBoard(char [][] board) {
			
			for (char[] row : board) {
				for (char a : row) {
					System.out.print(a);
				}
				System.out.println();
			}
		}
		public static void placeTurn(char [][] board, int position, String user) {
			
		char symbol = ' ';
			
			if (user.equals("player")) {
				symbol = 'X';
				playerPositions.add(position);
			}else {
				symbol = 'O';
				compPositions.add(position);
			}
			
			switch(position) {
				case 1:
					board [0][1] = symbol;
					break;
				case 2:
					board [0][3] = symbol;
					break;
				case 3:
					board [0][5] = symbol;
					break;
				case 4:
					board [2][1] = symbol;
					break;
				case 5:
					board [2][3] = symbol;
					break;
				case 6:
					board [2][5] = symbol;
					break;
				case 7:
					board [4][1] = symbol;
					break;
				case 8:
					board [4][3] = symbol;
					break;
				case 9:
					board [4][5] = symbol;
					break;
				default:
					break;
			}
		}
		
		public static String checkWinner() {
			List topRow = Arrays.asList(1 ,2 ,3);
			List midRow = Arrays.asList(4 ,5 ,6);
			List botRow = Arrays.asList(7 ,8 ,9);
			List leftColumn = Arrays.asList(1, 4, 7);
			List midColumn = Arrays.asList(2, 5, 8);
			List rightColumn = Arrays.asList(3, 6, 9);
			List firstDiagonal = Arrays.asList(1, 5, 9);
			List secondDiagonal = Arrays.asList(3, 5, 7);
	
			List <List> winning = new ArrayList<List>();
			winning.add(topRow);
			winning.add(midRow);
			winning.add(botRow);
			winning.add(rightColumn);
			winning.add(midColumn);
			winning.add(leftColumn);
			winning.add(firstDiagonal);
			winning.add(secondDiagonal);
			
			for (List l : winning) {
				if(playerPositions.containsAll(l)) {
					return "Congratatulations you Won!";
				} else if (compPositions.containsAll(l)) {
					return "You Lose.";
				} else if (playerPositions.size() + compPositions.size() == 9) {
					return "Draw";
				}
			}
			
			
			return " ";
		}

}
