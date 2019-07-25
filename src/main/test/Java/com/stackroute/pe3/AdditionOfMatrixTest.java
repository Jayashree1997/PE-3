package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionOfMatrixTest {
    AdditionOfMatrix additionOfMatrix;
    @Before
    public void setup() {
        //This method runs, before running an of the testcase
        //This method is used to initialize the required variables

        this.additionOfMatrix= new AdditionOfMatrix();
    }

    @After
    public void tearDown() {
        //This method runs,after running all the testcases
        //This method is used to clear the initialized variables

        additionOfMatrix = null;
    }
    @Test
    public void givenTwoMatrixShouldReturnAdditionOfThoseMatrices(){
        int row = 2;
        int col = 3;
        int[][] m1={{1,2,3},{4,5,6}};
        int[][] m2={{9,8,7},{6,5,4}};
        int[][] actualResult=additionOfMatrix.matrixAdd(row,col,m1,m2);
        int[][] result={{10,10,10},{10,10,10}};
        assertArrayEquals(result,actualResult);
    }
    @Test
    public void givenInvalidInputShouldReturnErrorMessage(){
        int row=0;
        int col=0;
        int[][] m1={{-1,-2,-3},{-4,-5,-6}};
        int[][] m2={{-9,-8,-7},{-6,-5,-4}};
        int[][] actualResult=additionOfMatrix.matrixAdd(row,col,m1,m2);
        int[][] result={{-10,12,13},{11,-12,-13}};
        assertNotEquals(result,actualResult);
    }

}