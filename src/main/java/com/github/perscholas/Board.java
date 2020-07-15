package com.github.perscholas;

/**
 * @author leon on 6/22/18.
 */

/**
 * Given a multidimensional array, representative of a 3 by 3 tic-tac-toe board, determine if the state of a board is
 * in favor of player X
 * in favor of player O
 * a tie
 */

/**
 * Implemented methods.
 * Monica Deshmukh
 * 07/15/2020
 */
public class Board {
    private Character[][] myBoard;
    public Board(Character[][] matrix) {
        myBoard = matrix;
    }

    public Boolean isInFavorOfX() {
        return __whoIsTheWinner('X');
       //return null;
    }

    public Boolean isInFavorOfO() {
        return __whoIsTheWinner('O');
        //return null;
    }

    public Boolean isTie() {
        if (isInFavorOfO() || isInFavorOfX())
            return false;
        else
            return true;
        //return null;
    }

    public String getWinner() {
        String winner = "";
        if (isInFavorOfX())
            winner = "X";
        else if(isInFavorOfO())
            winner = "O";
        return winner;
        //return null;
    }

    //checking X's or O's beginning in places [0][0], [0][1], [0][2], [1][0] and [2][0] will be sufficient
    private Boolean __whoIsTheWinner(Character ox) {
        Boolean isWinner = false;
        if (myBoard[0][0] == ox) {
            if ((myBoard[1][0] == ox && myBoard[2][0] == ox) || (myBoard[0][1] == ox && myBoard[0][2] == ox) || (myBoard[1][1] == ox && myBoard[2][2] == ox))
                return true;
        }
        if (myBoard[0][1] == ox && myBoard[1][1] == ox && myBoard[2][1] == ox) {
            return true;
        }
        if (myBoard[0][2] == ox) {
            if ((myBoard[1][1] == ox && myBoard[2][0] == ox) || (myBoard[1][2] == ox && myBoard[2][2] == ox))
                return true;
        }
        if ((myBoard[1][0] == ox) || (myBoard[1][1] == ox && myBoard[2][1] == ox)) {
            // if ((myBoard[0][0] == ox && myBoard[0][1] == ox) || (myBoard[1][1] == ox && myBoard[2][0] == ox) || (myBoard[1][2] == ox && myBoard[2][2] == ox))
            //if ((myBoard[0][0] == ox && myBoard[2][0] == ox) || (myBoard[1][1] == ox && myBoard[2][1] == ox))
            return true;
        }
        if ((myBoard[2][0] == ox) || (myBoard[2][1] == ox && myBoard[2][2] == ox)) {
            return true;
        }
        return isWinner;
    }
}
