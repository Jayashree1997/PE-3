//package com.stackroute.pe3;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class RemoveVowelsTest {
//
//    RemoveVowels removeVowels;
//        @Before
//        public void setup() {
//            //This method runs, before running an of the testcase
//            //This method is used to initialize the required variables
//
//            this.removeVowels= new RemoveVowels();
//        }
//
//        @After
//        public void tearDown() {
//            //This method runs,after running all the testcases
//            //This method is used to clear the initialized variables
//
//            removeVowels = null;
//        }
//        @Test
//       public void givenAnArrayOfStringsShouldReturnStringsWithRemovedVowels(){
//            String place={India, London, Australia, Europe};
//            char[] arr=new char[place];
//            String actualResult=RemoveVowels.removeVowels(char[] arr);
//            assertEquals("nd,lndn,strl,rp");
//        }
//        public void givenAnArrayOfStringsShouldReturnStringWithRemovedVowels(){
//            String place={Canada,Quebec};
//            char[] arr=new char[place];
//            String actualResult=RemoveVowels.removeVowels(char[] arr);
//            assertEquals("Cnd,Qbc");
//
//        }
//}