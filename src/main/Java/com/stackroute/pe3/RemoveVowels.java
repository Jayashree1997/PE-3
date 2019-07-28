package com.stackroute.pe3;
public class RemoveVowels {

    /**
     * This method removes the vowels from s given list of words
     * @param places
     * @return result
     */
    public String[] checkVowel(String[] places){
        String[] result=new String[places.length];

        //Replaces the vowels
        for (int i=0;i<places.length;i++){
            result[i]=places[i].replaceAll("[aeiou]","");
        }

        //returns the resulting changed values
        return result;
    }
}