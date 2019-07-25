package com.stackroute.pe3;
 public class ConsecutiveNum {
     public static boolean checkConsecutive(int array[], int size) {
         boolean result = true;
         for (int i = 0; i < size - 1; i++) {
             if ((array[i + 1] - array[i]) == 1) {
                 result = true;
             } else {
                 result = false;
                 break;
             }
         }return result;

     }
 }

