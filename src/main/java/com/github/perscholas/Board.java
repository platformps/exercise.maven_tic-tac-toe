package com.github.perscholas;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    private Character[][] board = null;

    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    public Boolean isInFavorOfX() {
        return isWinner('X');
    }

    public Boolean isInFavorOfO() {
        return isWinner('O');
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

    private Boolean isWinner(Character player) {
        if ((board[0][0].equals(player) && board[0][1].equals(player) && board[0][2].equals(player)) ||
            (board[1][0].equals(player) && board[1][1].equals(player) && board[1][2].equals(player)) ||
            (board[2][0].equals(player) && board[2][1].equals(player) && board[2][2].equals(player)) ||
            (board[0][0].equals(player) && board[1][0].equals(player) && board[2][0].equals(player)) ||
            (board[0][1].equals(player) && board[1][1].equals(player) && board[2][1].equals(player)) ||
            (board[0][2].equals(player) && board[1][2].equals(player) && board[2][2].equals(player)) ||
            (board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player)) ||
            (board[0][2].equals(player) && board[1][1].equals(player) && board[2][0].equals(player)))
            return true;
        else
            return false;
    }
}
