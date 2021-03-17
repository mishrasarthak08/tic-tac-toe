import java.util.Scanner;
import java.util.Random;

public class cmp_Move{
    public static void computerMove(char [][] gameBoard){
        valid_Move vM = new valid_Move();
        updtBrd uB = new updtBrd();
        
        Random rand = new Random();
        int move = rand.nextInt(9) + 1;

        boolean result = vM.isValidMove(move,gameBoard);

        while(!result){
            move = rand.nextInt(9) + 1;
            result = vM.isValidMove(move, gameBoard);

            }
        System.out.println("Computer moved at position " + move);
        uB.updateBoard(move,(2),gameBoard);

        }
}