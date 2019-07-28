package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
    ChessBoard chessBoard;
    @Before
    public void setUp() throws Exception {
        chessBoard=new ChessBoard();
    }

    @After
    public void tearDown() throws Exception {
        chessBoard=null;
    }

    @Test
    public void givenInputShouldReturnChessBoardPattern() {


        String expected[][]={{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"}};
        String actualValue[][]=chessBoard.chessBoard();
        assertArrayEquals(expected,actualValue);
        assertNotNull(chessBoard);

    }


    @Test
    public void givenIncorrectInputShouldReturnIncorrectPattern() {


        String expected[][]={{"BB","BB","BB","BB","BB","BB","BB","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"}};
        String actualValue[][]=chessBoard.chessBoard();
        assertNotEquals(expected,actualValue);
        assertNotNull(chessBoard);

    }
}
