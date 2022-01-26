package com.juliya.zimenina;

import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i<matrix1.length; i++) {
            for (int j=0; j<matrix2[0].length; j++) {
                int sum = 0;
                for (int x=0; x<matrix1[0].length; x++) {
                    sum += matrix1[i][x] * matrix2[x][j];
                }
                result[i][j] = sum;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[][] a = {
                {0, 12345},
                {4509, 0},
                {3, 567} };

        int[][] b = {
                {653, 0, 25353},
                {0, 61, 6} };

        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}

