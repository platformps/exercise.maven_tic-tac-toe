package com.github.perscholas;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private
        Character playBoard[][];

    public Board(Character[][] matrix) {
        playBoard = matrix;
    }

    public Boolean isInFavorOfX() {
        return false;
    }

    public Boolean isInFavorOfO() {
        if(checkColumns('O') == true)
        return false;
    }

    public Boolean isTie() {
        if(isInFavorOfO() == false && isInFavorOfX() == false){
            return true;
        }
        return false;
    }

    public String getWinner() {
        if(isInFavorOfX()){
            return "X";
        }
        else if(isInFavorOfO()){
            return "O";
        }
        else {
            return "";
        }
    }
    public boolean checkColumns(char playerSymbol){
        int currentCol = 0;
        boolean found = false;
        while(found == false && currentCol < 3){
            if(playBoard[currentCol][0] == playerSymbol && playBoard[currentCol][1] == playerSymbol && playBoard[currentCol][2] == playerSymbol){
                found = true;
            }
            currentCol++;
        }
        return found;
    }
    public boolean checkRows(char playerSymbol){
        int currentRow = 0;
        boolean found = false;
        while(found == false && currentRow < 3){
            if(playBoard[0][currentRow] == playerSymbol && playBoard[1][currentRow] == playerSymbol && playBoard[2][currentRow] == playerSymbol){
                found = true;
            }
            currentRow++;
        }
        return found;
    }
    public boolean checkDiags(char playerSymbol){
        int currentCornerColPos = 0;
        int currentCornerRowPos = 0;
        return false;
    }

}
