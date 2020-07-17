package com.github.perscholas;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private final Character[][] board;
    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    public Boolean isInFavorOfX() {
        return Score('X');
    }
    public Boolean isInFavorOfO() {
        return Score('O');
    }

    public Boolean isTie() {
        return !isInFavorOfX() && !isInFavorOfO();
    }

    public String getWinner() {
        if(this.isInFavorOfO())
            return "O";
        else if(this.isInFavorOfX())
            return "X";
        else
            return "";
    }

    public boolean Score(char XO){
        if(board[1][0].equals(XO) && board[1][1].equals(XO) &&board[1][2].equals(XO))
            return true;
        else if(board[0][0].equals(XO) && board[0][1].equals(XO) &&board[0][2].equals(XO))
            return true;
        else if(board[0][0].equals(XO) && board[1][0].equals(XO) &&board[2][0].equals(XO))
            return true;
        else if(board[2][0].equals(XO) && board[2][1].equals(XO) &&board[2][2].equals(XO))
            return true;
        else if(board[0][2].equals(XO) && board[1][2].equals(XO) &&board[2][2].equals(XO))
            return true;
        else if(board[0][2].equals(XO) && board[1][1].equals(XO) &&board[2][0].equals(XO))
            return true;
        else if(board[0][1].equals(XO) && board[1][1].equals(XO) &&board[2][1].equals(XO))
            return true;
        else if(board[0][0].equals(XO) && board[1][1].equals(XO) &&board[2][2].equals(XO))

            return true;

        else

            return false;
    }


}
