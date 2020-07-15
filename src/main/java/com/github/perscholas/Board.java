package com.github.perscholas;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    Character[][] board;

    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    public Boolean isInFavorOfX() {
        if ("X".equals(determineWinner())) {
            return true;
        }
        return false;
    }

    public Boolean isInFavorOfO() {
        if ("O".equals(determineWinner())) {
            return true;
        }
        return false;
    }

    public Boolean isTie() {
        if(!("O".equals(determineWinner())) && !("X".equals(determineWinner()))) {
            return true;
        }
        return false;
    }

    public String getWinner() {
        return determineWinner();
    }

    public String determineWinner() {
        if(board[0][0] == board[0][1] && board[0][1] == board[0][2]) { //row 0
            return (board[0][0]).toString(); //"X" or "O"
        }
        else if(board[1][0] == board[1][1] && board[1][1] == board[1][2]) { //row 1
            return (board[1][0]).toString(); //"X" or "O"
        }
        else if(board[2][0] == board[2][1] && board[2][1] == board[2][2]) { //row 2
            return (board[2][0]).toString(); //"X" or "O"
        }
        else if(board[0][0] == board[1][0] && board[1][0] == board[2][0]) { //column 0
            return (board[0][0]).toString(); //"X" or "O"
        }
        else if(board[0][1] == board[1][1] && board[1][1] == board[2][1]) { //column 1
            return (board[0][1]).toString(); //"X" or "O"
        }
        else if(board[0][2] == board[1][2] && board[1][2] == board[2][2]) { //column 2
            return (board[0][2]).toString(); //"X" or "O"
        }
        else if(board[0][0] == board[1][1] && board[1][1] == board[2][2]) { //top-left -> bottom-right diagonal
            return (board[0][0]).toString(); //"X" or "O"
        }
        else if(board[0][2] == board[1][1] && board[1][1] == board[2][0]) { //top-right -> bottom-left diagonal
            return (board[0][2]).toString(); //"X" or "O"
        }
        else {
            return "";
        }
    }
}
