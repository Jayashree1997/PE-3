package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentDetailsTest {


        StudentDetails studentDetails;

        @Before
        public void setup() {
            //This method runs, before running an of the testcase
            //This method is used to initialize the required variables

            this.studentDetails = new StudentDetails();
        }

        @After
        public void tearDown() {
            //This method runs,after running all the testcases
            //This method is used to clear the initialized variables

            studentDetails = null;
        }
        @Test
        public void givenNoOfStudentsAndGradesAsInputShouldCheckGrades(){
            int noOfStudents=4;
            int[] marks= new int[4];
            marks[0]=40;
            marks[1]=30;
            marks[2]=80;
            marks[3]=50;

            //act

            String actualResult = studentDetails.checkGrades(noOfStudents,marks);

            //assert

            assertEquals("No is between 0 and 100",actualResult);

        }
        @Test
        public void givenInvalidGradeShouldReturnErrorMessage(){
            int noOfStudents=4;
            int[] marks=new int[4];
            marks[0]=-10;
            marks[1]=-20;
            marks[2]=-90;
            marks[3]=-80;
            //act
            String actualResult = studentDetails.checkGrades(noOfStudents,marks);
            //assert
            assertEquals("Invalid input",actualResult);
        }

}