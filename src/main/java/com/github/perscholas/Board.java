package com.github.perscholas;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] board;
    String first;
    String second;
    String third;
    String fcol;
    String scol;
    String tcol;
    public Board(Character[][] matrix) {
    this.board=matrix;
    first= String.valueOf(matrix[0][0])+String.valueOf(matrix[0][1])+String.valueOf(matrix[0][2]);
    second= String.valueOf(matrix[1][0])+String.valueOf(matrix[1][1])+String.valueOf(matrix[1][2]);
    third= String.valueOf(matrix[2][0])+String.valueOf(matrix[2][1])+String.valueOf(matrix[2][2]);
    fcol=String.valueOf(matrix[0][0])+String.valueOf(matrix[1][0])+String.valueOf(matrix[1][0]);
    scol=String.valueOf(matrix[0][1])+String.valueOf(matrix[1][1])+String.valueOf(matrix[2][1]);
    tcol=String.valueOf(matrix[0][2])+String.valueOf(matrix[1][2])+String.valueOf(matrix[2][2]);

    }
    public Boolean isEmpty(){
        for(int i=0;i<3;i++){
            for(int l=0;l<3;l++) {
                if (board[i][l].compareTo(' ') == (0)) {
                    return true;
                }
            }}
           return false;
        }


    public Boolean isInFavorOfX() {


        StringBuilder supp=new StringBuilder(1);
        StringBuilder supp2=new StringBuilder(1);
        int l=2;

          if(first.matches("XXX") ||second.matches("XXX") ||third.matches("XXX")) return true;
          if(fcol.matches("XXX") ||scol.matches("XXX") ||tcol.matches("XXX")) return true;
          for(int i=0;i<3;i++){
              supp.append(String.valueOf(board[i][i]));
              supp2.append(String.valueOf(board[l-i][i]));
          }
          if(supp.toString().matches("XXX") || supp2.toString().matches("XXX"))return true;

        return false;
    }

    public Boolean isInFavorOfO() {

        StringBuilder supp=new StringBuilder(1);
        StringBuilder supp2=new StringBuilder(1);
        int l=2;

        if(first.matches("OOO") ||second.matches("OOO") ||third.matches("OOO")) return true;
        if(fcol.matches("OOO") ||scol.matches("OOO") ||tcol.matches("OOO")) return true;
        for(int i=0;i<3;i++){
            supp.append(String.valueOf(board[i][i]));
            supp2.append(String.valueOf(board[l-i][i]));
        }
        if(supp.toString().matches("OOO") || supp.toString().matches("OOO"))return true;

        return false;
    }

    public Boolean isTie() {
        if(isEmpty())return false;
      if(true!=isInFavorOfO() || true !=isInFavorOfX())return true;

        return false;
    }

    public String getWinner() {

        if(true==isInFavorOfO())return "O";
       else if(true ==isInFavorOfX())return "X";
        return "";
    }

}
