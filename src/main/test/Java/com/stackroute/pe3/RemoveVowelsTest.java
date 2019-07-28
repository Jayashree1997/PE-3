package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    RemoveVowels removeVowels;
    @Before
    public void setUp() throws Exception {
        removeVowels=new RemoveVowels();
    }

    @After
    public void tearDown() throws Exception {
        removeVowels=null;
    }

    @Test
    public void ckeckVowelSuccess() {
        String[] expected = {"Ind","Untd stts","Grmny","Egypt","czchslvk"};
        String[] actual = {"India","United states","Germany","Egypt","czechoslovakia"};
        assertArrayEquals(expected,removeVowels.checkVowel(actual));
    }

    @Test
    public void ckeckVowelFailure() {
        String[] expected = {"Ind","Unitd stts","Gerrmny","Egypt","czchslvk"};
        String[] actual = {"India","United states","Germany","Egypt","czechoslovakia"};
        assertNotEquals(expected,removeVowels.checkVowel(actual));
        assertNotNull(removeVowels.checkVowel(actual));
    }
}
