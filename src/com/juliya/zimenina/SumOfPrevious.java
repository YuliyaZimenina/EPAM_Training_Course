package com.juliya.zimenina;

import java.util.Arrays;

public class SumOfPrevious {
    public static void main(String[] args) {
        int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};

        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }

    public static boolean[] getSumCheckArray(int[] array) {
        boolean[] arrayBool = new boolean[array.length];
        arrayBool[0]=false;
        arrayBool[1]=false;
        for(int i=2;i<array.length;i++){
            int sum = array[i-2] + array[i-1];
            if(array[i] == sum){
                arrayBool[i]=true;
            }
            else{
                arrayBool[i]=false;
            }
        }
        return arrayBool;
    }

}
