package com.github.perscholas;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    public Board(Character[][] matrix) {
    }

    public Boolean isInFavorOfX() {
        return true;
    }
    public Boolean isInFavorOfO() {
        return false;
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


}
