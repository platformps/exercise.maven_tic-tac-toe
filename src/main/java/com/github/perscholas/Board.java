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
        if(isPlayerXWins())
            return true;
        else
            return false;
    }

    public Boolean isInFavorOfO() {
        if(isPlayerOWins())
            return true;
        else
            return false;
    }

    public Boolean isTie() {
        if(isPlayerOWins()== false && isPlayerXWins() == false)
            return true;
        else
            return false;
    }

    public String getWinner() {
        if(isPlayerXWins())
            return "X";
        else if (isPlayerOWins())
                return "O";
            else
                return "";
    }


    public boolean isPlayerXWins(){
        Boolean isMatchX = true;
        for (int i = 0; i < 3; i++) {
            String concatX ="";
            for (int j = 0; j < 3; j++) {
                concatX = concatX + boardMatrix[i][j];
            }
            if (("XXX").equals(concatX)){
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            Character toStartX = 'X';
            String concatX ="";
            for (int j = 0; j < 3; j++) {
                concatX = concatX + boardMatrix[j][i];
            }
            if (("XXX").equals(concatX)){
                return true;
            }
        }
        if((boardMatrix[0][0]+""+boardMatrix[1][1]+""+boardMatrix[2][2]+"").equals("XXX"))
            return true;
        if((boardMatrix[0][2]+""+boardMatrix[1][1]+""+boardMatrix[2][0]+"").equals("XXX"))
            return true;

        return false;
    }
    public boolean isPlayerOWins(){
        Boolean isMatchX = true;
        for (int i = 0; i < 3; i++) {
            String concatX ="";
            for (int j = 0; j < 3; j++) {
                concatX = concatX + boardMatrix[i][j];
            }
            if (concatX.equals("OOO")){
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            Character toStartX = 'O';
            String concatX ="";
            for (int j = 0; j < 3; j++) {
                concatX = concatX + boardMatrix[j][i];
            }
            if (concatX.equals("OOO")){
                return true;
            }
        }
        if((boardMatrix[0][0]+""+boardMatrix[1][1]+""+boardMatrix[2][2]+"").equals("OOO")){
            return true;
        }
        if((boardMatrix[0][2]+""+boardMatrix[1][1]+""+boardMatrix[2][0]+"").equals("OOO"))
            return true;

        return false;
    }

}
