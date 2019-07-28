package com.stackroute.pe3;
import java.sql.SQLOutput;

    public class UserDefinedExecption {
        /**
         * main method
         * @param args
         */
        public static void  main(String [] args)
        {
            //try block: an object of Exception class is thrown
            try {
                throw new Exception();
            }

            //catch block:catches the exception and prints the String argument
            catch (Exception e)
            {
                System.out.println(e.toString());
            }

            //finally block:prints a message
            finally {
                System.out.println("Executing finally block");
            }

        }
    }

