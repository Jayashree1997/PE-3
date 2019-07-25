package com.stackroute.pe3;
public class StudentDetails {


    public String checkGrades(int noOfStudents, int[] marks)
    {
       String result="";

       for(int i=0;i<4;i++) {
           if (marks[i] > 0 && marks[i] < 100)
               result = "No is between 0 and 100";
           else
               result = "Invalid input";
       }
        return result;

    }
}
