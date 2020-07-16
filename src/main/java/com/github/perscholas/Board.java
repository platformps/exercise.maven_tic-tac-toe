package com.github.perscholas;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] boardMatrix;
    public Board(Character[][] matrix) {
        this.boardMatrix = matrix;
    }

    public Boolean isInFavorOfX() {
        if(isPlayerWins('X'))
            return true;
        else
            return false;
    }

    public Boolean isInFavorOfO() {
        if(isPlayerWins('O'))
            return true;
        else
            return false;
    }

    public Boolean isTie() {
        if(isInFavorOfO()== false && isInFavorOfX() == false)
            return true;
        else
            return false;
    }

    public String getWinner() {
        if(isInFavorOfX())
            return "X";
        else if (isInFavorOfO())
                return "O";
            else
                return "";
    }



    public boolean isPlayerWins(char player){

        // concat character player to make it "XXX" or "OOO"
        String numberOfligne = "";
        for (int i = 0; i < 3; i++) {
            numberOfligne = numberOfligne + player;
        }

        // check if any line match
        Boolean isMatchX = true;
        for (int i = 0; i < 3; i++) {
            String concatX ="";
            for (int j = 0; j < 3; j++) {
                concatX = concatX + boardMatrix[i][j];
            }
            if (concatX.equals(numberOfligne)){
                return true;
            }
        }

        // check if any column match
        for (int i = 0; i < 3; i++) {
            String concatX ="";
            for (int j = 0; j < 3; j++) {
                concatX = concatX + boardMatrix[j][i];
            }
            if (concatX.equals(numberOfligne)){
                return true;
            }
        }

        // check \
        if((boardMatrix[0][0]+""+boardMatrix[1][1]+""+boardMatrix[2][2]+"").equals(numberOfligne)){
            return true;
        }
        //check /
        if((boardMatrix[0][2]+""+boardMatrix[1][1]+""+boardMatrix[2][0]+"").equals(numberOfligne))
            return true;

        return false;
    }

}
