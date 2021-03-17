import java.util.Scanner;
public class plmove{  
  public static void playerMove(char [][] gameBoard){
        Scanner input = new Scanner(System.in);
        updtBrd uB = new updtBrd();
        valid_Move vM = new valid_Move();
        
        System.out.println("Please make a move. (1-9)");

        int move = input.nextInt();

        boolean result = vM.isValidMove(move,gameBoard);

        while(!result){
            System.out.println("Sorry ! Invalid move. Try again");
            move = input.nextInt();
            result = vM.isValidMove(move,gameBoard);
            }
        System.out.println("Player moved at position " + move);
        uB.updateBoard(move,(1),gameBoard);

        }
}