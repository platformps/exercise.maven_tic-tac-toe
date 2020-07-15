package com.github.perscholas;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] matrix;
    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    private Integer result(Character c) {
        int max = 1;
        for(int i = 0; i < 3; i ++){ //traverse all the horizontal marks
            int n = 1;
            for(int j = 0; j < 2; j++){
                if(matrix[i][j] == matrix[i][j+1] && matrix[i][j] == c)
                    max = Math.max(n++, max);
            }
        }
        for(int j = 0; j < 3; j ++){ //traverse all the vertical marks
            int n = 1;
            for(int i = 0; i < 2; i++){
                if(matrix[i][j] == matrix[i+1][j] && matrix[i][j] == c)
                    max = Math.max(n++, max);
            }
        }
        int n = 1;
        for(int i = 0; i < 2; i++){ ////traverse all the left diagonal marks
            if(matrix[i][i] == matrix[i+1][i+1] && matrix[i][i] == c)
                max = Math.max(n++, max);
        }
        int m = 1;
        for(int i = 0; i < 2; i++){ //traverse all the right horizontal marks
            if(matrix[i][2-i] == matrix[i+1][1-i] && matrix[i][2-i] == c)
                max = Math.max(m++, max);
        }
        return max;
    }

    public Boolean isInFavorOfX() {
        if (result('X') > result('O'))
                return true;
        else return false;
    }

    public Boolean isInFavorOfO() {
        if (result('X') < result('O'))
            return true;
        else return false;
    }

    public Boolean isTie() {
        if (result('X') == result('O'))
            return true;
        else return false;
    }

    public String getWinner() {
        if(isInFavorOfX() == true)
            return "X";
        else if(isInFavorOfO() == true)
            return "O";
        else return "";
    }

}
