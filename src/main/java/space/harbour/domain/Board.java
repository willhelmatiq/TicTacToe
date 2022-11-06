package space.harbour.domain;

import lombok.Data;

@Data
public class Board {

    Tile[][] boardValues = new Tile[3][3];

    @Override
    public String toString() {
        return boardValues[0][0] + "|" + boardValues[0][1] + "|" + boardValues[0][2] + "\n" + "-+-+- \n" +
                boardValues[1][0] + "|" + boardValues[1][1]  + "|"+ boardValues[1][2] + "\n" + "-+-+- \n" +
                boardValues[2][0] + "|" + boardValues[2][1]  + "|"+ boardValues[2][2] + "\n";
    }

    public void initBoard(){
        for (int i = 0; i< boardValues.length; i++){
            for (int j = 0; j< boardValues[i].length; j++){
                boardValues[i][j] = new Tile(' ');
            }
        }
    }

    public boolean isPlayerWin(char achar){
        if(achar == boardValues[0][0].getValue() &&  achar == boardValues[0][1].getValue()
                && achar == boardValues[0][2].getValue() ){
            return  true;
        } else if(achar == boardValues[1][0].getValue() &&  achar == boardValues[1][1].getValue()
                && achar == boardValues[1][2].getValue() ) {
            return  true;
        } else if(achar == boardValues[2][0].getValue() &&  achar == boardValues[2][1].getValue()
                && achar == boardValues[2][2].getValue() ) {
            return  true;
        } else if(achar == boardValues[0][0].getValue() &&  achar == boardValues[1][0].getValue()
                && achar == boardValues[1][2].getValue() ) {
            return  true;
        } else if(achar == boardValues[0][1].getValue() &&  achar == boardValues[1][1].getValue()
                && achar == boardValues[2][1].getValue() ) {
            return  true;
        } else if(achar == boardValues[0][2].getValue() &&  achar == boardValues[1][2].getValue()
                && achar == boardValues[2][2].getValue() ) {
            return  true;
        } else if(achar == boardValues[0][0].getValue() &&  achar == boardValues[1][1].getValue()
                && achar == boardValues[2][2].getValue() ) {
            return  true;
        } else if(achar == boardValues[0][2].getValue() &&  achar == boardValues[1][1].getValue()
                && achar == boardValues[2][0].getValue() ) {
            return  true;
        } else {
            return false;
        }
    }

    public boolean moveAllowed(int row, int column) {
        if (row < 1 || row > 3) {
            return false;
        } else if (column < 1 || column > 3) {
            return false;
        } else if (getBoardValues()[row - 1][column - 1].getValue() == ' ') {
            return true;
        }
        return false;
    }

}
