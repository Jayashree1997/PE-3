package com.stackroute.pe3;

public class ChessBoard {
    public String ar[][] = new String[8][8];


    public String[][] chessBoard() {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i % 2) == (j % 2)) {
                    ar[i][j] = "WW";
                } else {
                    ar[i][j] = "BB";
                }
            }
        }
        return ar;
    }

}
