package com.stackroute.pe3;

public class AdditionOfMatrix {
    public int[][] matrixAdd(int row, int col, int[][] m1, int[][] m2) {
        int c[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                c[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return c;
    }
}

