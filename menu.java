    import java.util.Scanner;
    import java.util.Random;
    
    class menu
    {
    static int playerScore = 0;
    static int computerScore = 0;
    static int n;
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[]args)
    {
    
        prntBrd pB = new prntBrd();
        pl_Move pM = new pl_Move();
        cmp_Move cM = new cmp_Move();
        resetBrd rB = new resetBrd();
        ranking rnK = new ranking();
        
        System.out.println("\n\n\t\t\t     WELCOME TO XOXO GAME");
        System.out.println("\t\t\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
    
        System.out.println("|------------------|");
        System.out.println("|   PLEASE CHOOSE  |");
        System.out.println("|   1.PLAY         |");
        System.out.println("|   2.EXIT         |");
        System.out.println("|------------------|");
        n = input.nextInt();
    
        char [][] gameBoard = {{'_','|','_','|','_'},{'_','|','_','|','_'},{'_','|','_','|','_'}};
        String [] names = {};
        int [] scores = {};
        
        boolean gameOver = false;
        boolean playAgain = true;
          
        if(n==1){
            pB.printBoard(gameBoard); 
            while(playAgain){
               
                    
                while(!gameOver)
                {
                    pM.playerMove(gameBoard);
                    gameOver = isGameOver(gameBoard);
                    if(gameOver)
                    {
                        break;
                    }
    
                    cM.computerMove(gameBoard);
                    gameOver = isGameOver(gameBoard);
                    if(gameOver)
                    {
                        break;
                    }
                }
                System.out.println("Player\'s Total Score is :" + playerScore);
                System.out.println("Computer\'s Total Score is :" + computerScore);
                
                while(true)
                {
                    System.out.print("Would you like to play again ? Y/N: ");
                    String res = input.nextLine();
                    
                    if(res.equals("Y")||res.equals("y"))
                    {
                       playAgain = true;
                       System.out.println("\nLet's play again !\n");
                       rB.resetBoard(gameBoard);
                       gameOver = false;
                       pB.printBoard(gameBoard);
                       break;
                    }else if(res.equals("N")||res.equals("n")){
                        playAgain = false;
                        System.out.print("Enter your (short) name: ");
                        String playerName = input.nextLine();
                        rnK.leaderboard(rnK.addName(names, playerName), rnK.addScore(scores, playerScore));
                        exit();
                        break;
                    }else{
                        System.out.println("Invalid input!");
                        continue;
                    }
                }
            }
        }else{
            exit();
        }
    }
    
    //EXIT & RATING SYSTEM
    public static void exit()
    {
        System.out.println("\nYou exited!\nRate your experience (1-5)");
        while(true)
        {
            int rating = input.nextInt();
            if(rating >=1 && rating<=5)
            {
                System.out.println("BYE ! Thank you for playing hihihi\n");
                return;
            }else{
                System.out.println("Invalid input!");
            }
        }
    }
    
    public static boolean isGameOver(char [][] gameBoard){
        if(gameBoard[0][0] == 'X'&&gameBoard[0][2] == 'X' && gameBoard [0][4] == 'X'){
            System.out.println("Player Wins");
            playerScore++;
            return true;

            }
        if(gameBoard[0][0] == 'O'&& gameBoard[0][2] == 'O' && gameBoard [0][4] == 'O'){
            System.out.println("Computer Wins");
            computerScore++;
            return true;

            }
        if(gameBoard[1][0] == 'X'&&gameBoard[1][2] == 'X' && gameBoard [1][4] == 'X'){
            System.out.println("Player Wins");
            playerScore++;
            return true;

            }
        if(gameBoard[1][0] == 'O'&& gameBoard[1][2] == 'O' && gameBoard [1][4] == 'O'){
            System.out.println("Computer Wins");
            computerScore++;
            return true;

            }
        if(gameBoard[2][0] == 'X'&&gameBoard[2][2] == 'X' && gameBoard [2][4] == 'X'){
            System.out.println("Player Wins");
            playerScore++;
            return true;

                        }
        if(gameBoard[2][0] == 'O'&& gameBoard[2][2] == 'O' && gameBoard [2][4] == 'O'){
            System.out.println("Computer Wins");
            computerScore++;
            return true;
            }
        //Vertical Wins

        if(gameBoard[0][0] == 'X'&&gameBoard[1][0] == 'X' && gameBoard [2][0] == 'X'){
            System.out.println("Player Wins");
            playerScore++;
            return true;

            }
        if(gameBoard[0][0] == 'O'&& gameBoard[1][0] == 'O' && gameBoard [2][0] == 'O'){
            System.out.println("Computer Wins");
            computerScore++;
            return true;
        }
        if(gameBoard[0][2] == 'X'&&gameBoard[1][2] == 'X' && gameBoard [2][2] == 'X'){
            System.out.println("Player Wins");
            playerScore++;
            return true;

                        }
        if(gameBoard[0][2] == 'O'&& gameBoard[1][2] == 'O' && gameBoard [2][2] == 'O'){
            System.out.println("Computer Wins");
            computerScore++;
            return true;

        }
        if(gameBoard[0][4] == 'X'&&gameBoard[1][4] == 'X' && gameBoard [2][4] == 'X'){
            System.out.println("Player Wins");
            playerScore++;
            return true;

                        }
        if(gameBoard[0][4] == 'O'&& gameBoard[1][4] == 'O' && gameBoard [2][4] == 'O'){
            System.out.println("Computer Wins");
            computerScore++;
            return true;
        }
        //Diagonal Wins
        if(gameBoard[0][0] == 'X'&&gameBoard[1][2] == 'X' && gameBoard [2][4] == 'X'){
            System.out.println("Player Wins");
            playerScore++;
            return true;

        }
        if(gameBoard[0][0] == 'O'&& gameBoard[1][2] == 'O' && gameBoard [2][4] == 'O'){
            System.out.println("Computer Wins");
            computerScore++;
            return true;
        }
        if(gameBoard[2][0] == 'X'&&gameBoard[1][2] == 'X' && gameBoard [0][4] == 'X'){
            System.out.println("Player Wins");
            playerScore++;
            return true;

        }
        if(gameBoard[2][0] == 'O'&& gameBoard[1][2] == 'O' && gameBoard [0][4] == 'O'){
            System.out.println("Computer Wins");
            computerScore++;
            return true;
        }

        if(gameBoard[0][0] != '_' && gameBoard[0][2] != '_' && gameBoard[0][4] != '_' && gameBoard[1][0] != '_' && gameBoard[1][2] != '_' && gameBoard[1][4] != '_' && gameBoard[2][0] != '_' && gameBoard[2][2] != '_' && gameBoard[2][4] != '_'){
            System.out.println("Ops ! DRAW");
            return true;
        }
        return false;
    }
}




