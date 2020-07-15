package com.github.perscholas;

import java.time.Instant;
import java.util.Arrays;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    
    //Attributes
    private final Character[][] matrix;
    
    private static final int X = 0;
    private static final int Y = 1;
    
    private static final int[][][] WIN_CONDITIONS = {
            {{0, 0}, {0, 1}, {0, 2}},
            {{1, 0}, {1, 1}, {1, 2}},
            {{2, 0}, {2, 1}, {2, 2}},
            {{0, 0}, {1, 0}, {2, 0}},
            {{0, 1}, {1, 1}, {2, 1}},
            {{0, 2}, {1, 2}, {2, 2}},
            {{0, 0}, {1, 1}, {2, 2}},
            {{2, 0}, {1, 1}, {0, 2}}
    };
    
    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }
    
    public Boolean isInFavorOfX() {
        return isInFavorOf('X');
    }
    
    public Boolean isInFavorOfO() {
        return isInFavorOf('O');
    }
    
    public Boolean isTie() {
        return !isInFavorOfO() && !isInFavorOfX();
    }
    
    public String getWinner() {
        if (isInFavorOfO()) {
            return "O";
        } else if (isInFavorOfX()) {
            return "X";
        }
        return "";
    }
    
    private boolean isInFavorOf(char character) {
        for (int index = 0; WIN_CONDITIONS.length > index; index++) {
            int[][] winConditionPoints = WIN_CONDITIONS[index];
            if (isWin(winConditionPoints, character)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean isWin(int[][] winConditionPoints, char character) {
        for (int index = 0; winConditionPoints.length > index; index++) {
            int[] point = winConditionPoints[index];
            if (matrix[point[X]][point[Y]] != character) {
                return false;
            }
        }
        return true;
    }
}
