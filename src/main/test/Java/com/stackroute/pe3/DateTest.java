package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateTest {
    Date date;
    @Before
    public void setUp() throws Exception {
        date=new Date();
    }

    @After
    public void tearDown() throws Exception {
        date=null;
    }

    @Test
    public void givenInputShouldReturnStartDate() {
        //Arrange
        boolean expectedValue = true;
        //Act
        boolean actualValue = date.startDate();
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

    @Test
    public void givenInputShouldReturnEndDate() {
        //Arrange
        boolean expectedValue1 = true;
        //Act
        boolean actualValue1 = date.endDate();
        assertEquals(expectedValue1, actualValue1);
        assertNotNull(actualValue1);
    }
}