public class prntBrd
{
    public static void printBoard(char [][] gameBoard){

        for(char[] row : gameBoard){
            for( char c : row){
                System.out.print(c);
                }
                System.out.println();
            }
        }
}