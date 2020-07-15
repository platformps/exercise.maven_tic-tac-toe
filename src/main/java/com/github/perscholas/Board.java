package com.github.perscholas;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    private Character[][] matrix;
    public Board(Character[][] matrix) {
        this.matrix=matrix;
    }

    public Boolean isInFavorOfX() {
        return  findResult('X');
    }

    public Boolean isInFavorOfO() {
        return findResult('O');
    }

    public Boolean isTie() {
        boolean x=false;
        if(!findResult('X') && !findResult('O')){
            x= true;
        }
        return x;

    }

    public String getWinner() {
        if(isInFavorOfX()==true)
        {
            return "X";
        }
        else if  (isInFavorOfO()==true)
        {
            return "O";
        }
        else {
            return "";
        }
    }

    public boolean findResult(char c)
    {
      if(matrix[0][0]==c &&matrix[0][1]==c &&matrix[0][2]==c)   //check the first row
      {
          return true;
      }
      else if(matrix[0][0]==c&&matrix[1][0]==c&&matrix[2][0]==c){
          return true;      //checks the first column
      }


       else if(matrix[1][0]==c &&matrix[1][1]==c &&matrix[1][2]==c)
        {
            return true; //check the second row
        }
        else if(matrix[0][1]==c&&matrix[1][1]==c&&matrix[2][1]==c){
            return true;      //checks the second column
        }

      else if(matrix[2][0]==c &&matrix[2][1]==c &&matrix[2][2]==c)
      {
          return true; //check the third row
      }
      else if(matrix[0][2]==c &&matrix[1][2]==c &&matrix[2][2]==c){
          return true;      //checks the third column
      }

      else if(matrix[0][0]==c &&matrix[1][1]==c &&matrix[2][2]==c)
      {
          return  true;
          //checks the right horizonal '\'
      }
      else if(matrix[2][0]==c &&matrix[1][1]==c &&matrix[0][2]==c)
      {
          return  true;
          //checks the left horizonal '/'

      }
      else {
          return false;
      }

    }


}
