package com.github.perscholas;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] matrix;
    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        for (int i = 0; i < matrix.length; i++) {
            if(isWinningRow('X', i)) return true;
        }

        for (int j = 0; j < matrix[0].length; j++) {
            if(isWinningCol('X', j)) return true;
        }

        if(isWinningFirstDiagonal('X')) return true;

        if(isWinningSecondDiagonal('X')) return true;
        return false;
    }

    public Boolean isInFavorOfO() {
        for (int i = 0; i < matrix.length; i++) {
            if(isWinningRow('O', i)) return true;
        }

        for (int j = 0; j < matrix[0].length; j++) {
            if(isWinningCol('O', j)) return true;
        }

        if(isWinningFirstDiagonal('O')) return true;

        if(isWinningSecondDiagonal('O')) return true;
        return false;
    }

    public boolean isWinningRow(Character c, int i) {
        int counter = 0;
        for(int j = 0; j < matrix[i].length; j++) {
            if(matrix[i][j] == c) {
                counter++;
                continue;
            }
            break;
        }
        if(counter == matrix[i].length) return true;
        return false;
    }

    public boolean isWinningCol(Character c, int j) {
        int counter = 0;
        for(int i = 0; i < matrix.length; i++) {
            if(matrix[i][j] == c) {
                counter++;
                continue;
            }
            break;
        }
        if(counter == matrix.length) return true;
        return false;
    }

    public boolean isWinningFirstDiagonal(Character c) {
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(i == j) {
                    if(matrix[i][j] == c) {
                        counter++;
                        continue;
                    }
                    break;
                }
            }
        }
        if(counter == matrix.length) return true;
        return false;
    }

    public boolean isWinningSecondDiagonal(Character c) {
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(i == matrix.length - j - 1) {
                    if(matrix[i][j] == c) {
                        counter++;
                        continue;
                    }
                    break;
                }
            }
        }
        if(counter == matrix.length) return true;
        return false;
    }

    public Boolean isTie() {
        return !(isInFavorOfO() || isInFavorOfX());
    }

    public String getWinner() {
        if(isInFavorOfX()) return "X";
        if(isInFavorOfO()) return "O";
        return "";
    }

}
