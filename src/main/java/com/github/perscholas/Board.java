package com.github.perscholas;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] check;

    public Board(Character[][] matrix) {
        this.check = matrix;
    }

    public Boolean isInFavorOfX() {
        if ("X".equals(playtoWin())) {
            return true;
        }
        return false;
    }

    public Boolean isInFavorOfO() {
        if ("O".equals(playtoWin())) {
            return true;
        }
        return false;
    }

    public Boolean isTie() {
        return (!isInFavorOfX() && !isInFavorOfO());
    }

    public String getWinner() {
        return playtoWin();
    }

    private String playtoWin() {
        if(check[0][0] == check[0][1] && check[0][1] == check[0][2] && check[0][0] != ' ') { //row 0
            return (check[0][0]).toString(); //"X" or "O"
        }
        else if(check[1][0] == check[1][1] && check[1][1] == check[1][2] && check[1][0] != ' ') { //row 1
            return (check[1][0]).toString(); //"X" or "O"
        }
        else if(check[2][0] == check[2][1] && check[2][1] == check[2][2] && check[2][0] != ' ') { //row 2
            return (check[2][0]).toString(); //"X" or "O"
        }
        else if(check[0][0] == check[1][0] && check[1][0] == check[2][0] && check[0][0] != ' ') { //column 0
            return (check[0][0]).toString(); //"X" or "O"
        }
        else if(check[0][1] == check[1][1] && check[1][1] == check[2][1] && check[0][1] != ' ') { //column 1
            return (check[0][1]).toString(); //"X" or "O"
        }
        else if(check[0][2] == check[1][2] && check[1][2] == check[2][2] && check[0][2] != ' ') { //column 2
            return (check[0][2]).toString(); //"X" or "O"
        }
        else if(check[0][0] == check[1][1] && check[1][1] == check[2][2] && check[0][0] != ' ') { //top-left -> bottom-right diagonal
            return (check[0][0]).toString(); //"X" or "O"
        }
        else if(check[0][2] == check[1][1] && check[1][1] == check[2][0] && check[0][2] != ' ') { //top-right -> bottom-left diagonal
            return (check[0][2]).toString(); //"X" or "O"
        }
        else {
            return "";
        }
    }
}




