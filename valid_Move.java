public class valid_Move{    
    public static boolean isValidMove(int move, char[][] gameBoard){

        switch(move){
            case 1:
                if(gameBoard[0][0] == '_'){
                    return true;
                } else{
                    return false;
                }
            case 2:
                if(gameBoard[0][2] == '_'){
                    return true;
                } else{
                    return false;
                }
            case 3:
                if(gameBoard[0][4] == '_'){
                    return true;
                } else{
                    return false;
                }
            case 4:
                if(gameBoard[1][0] == '_'){
                    return true;
                } else{
                    return false;
                                }
            case 5:
                if(gameBoard[1][2] == '_'){
                    return true;
                } else{
                    return false;
                }
            case 6:
                if(gameBoard[1][4] == '_'){
                    return true;
                } else{
                    return false;
                }
            case 7:
                if(gameBoard[2][0] == '_'){
                    return true;
                } else{
                    return false;
                }
            case 8:
                if(gameBoard[2][2] == '_'){
                    return true;
                } else{
                    return false;
            }
            case 9:
                if(gameBoard[2][4] == '_'){
                    return true;
                } else{
                    return false;
            }

            default:
                return false;
        }

    }
}