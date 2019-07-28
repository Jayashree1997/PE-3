package com.stackroute.pe3;

public class GenerateError {

    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {

        //throws NegativeArraySizeException
        try{
            throw new NegativeArraySizeException();
        }

        //catches NegativeArraySizeException
        catch(NegativeArraySizeException e1){
            System.out.println(e1.toString());
        }


        //throws IndexOutOfBoundsException
        try{
            throw new IndexOutOfBoundsException();
        }

        //catches IndexOutOfBoundsException
        catch (IndexOutOfBoundsException e2){
            System.out.println(e2.toString());
        }

    }
}
