package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumTest {
    ConsecutiveNum consecutiveNum;

    @Before
    public void setup() {
        //This method runs, before running an of the testcase
        //This method is used to initialize the required variables

        this.consecutiveNum= new ConsecutiveNum();
    }

    @After
    public void tearDown() {
        //This method runs,after running all the testcases
        //This method is used to clear the initialized variables

        consecutiveNum = null;
    }
    @Test
    public void givenAnArrayOfIntegersShouldReturnTrueIfConsecutive(){
        int array[]={50,51,52,53,54,55,56};
        int size=7;
        boolean actualResult=ConsecutiveNum.checkConsecutive(array,size);
        assertEquals(true,actualResult);
    }
    @Test
    public void givenAnArrayOfIntegersShouldReturnFalseIfNotConsecutive(){
        int array[]={49,51,52,54,57,59,62};
        int size=7;
        boolean actualResult=ConsecutiveNum.checkConsecutive(array,size);
        assertEquals(false,actualResult);
    }
}