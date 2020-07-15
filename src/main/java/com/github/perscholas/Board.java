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
        if(checkColumns('X') || checkRows('X') || checkDiags('X')){
            return true;
        }
        return false;
    }

    public Boolean isInFavorOfO() {
        if(checkColumns('O') || checkRows('O') || checkDiags('O')){
            return true;
        }
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
            if(playBoard[0][currentCol] == playerSymbol && playBoard[1][currentCol] == playerSymbol && playBoard[2][currentCol] == playerSymbol){
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
            if(playBoard[currentRow][0] == playerSymbol && playBoard[currentRow][1] == playerSymbol && playBoard[currentRow][2] == playerSymbol){
                found = true;
            }
            currentRow++;
        }
        return found;
    }
    public boolean checkDiags(char playerSymbol){
        int currentCornerColPos = 0;
        int currentCornerRowPos;
        int diagsChecked = 0;
        boolean found = false;
        while(diagsChecked != 2 && !found){
            if(diagsChecked == 0){
                //checking left corner
                currentCornerRowPos = 0;
                if(playBoard[currentCornerRowPos][currentCornerColPos] == playerSymbol && playBoard[currentCornerRowPos+1][currentCornerColPos+1] == playerSymbol && playBoard[currentCornerRowPos+2][currentCornerColPos+2] == playerSymbol){
                    found = true;
                }

            }
            else if(diagsChecked == 1 && !found){
                currentCornerRowPos = 2;
                if(playBoard[currentCornerRowPos][currentCornerColPos] == playerSymbol && playBoard[currentCornerRowPos-1][currentCornerColPos+1] == playerSymbol && playBoard[currentCornerRowPos-2][currentCornerColPos+2] == playerSymbol){

                }
            }
            diagsChecked++;
        }
        return false;
    }

}
