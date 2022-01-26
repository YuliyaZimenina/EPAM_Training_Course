package com.juliya.zimenina;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LocalMaxima {
    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array){

        List<Integer> resultList = new ArrayList<>();
        List<Integer> maxList = new ArrayList<>();

        if (array[0] > array[1])
            maxList.add(array[0]);
        for (int i = 1; i < array.length - 1; i++) {
            if ((array[i - 1] < array[i]) &&
                    (array[i] > array[i + 1]))
                maxList.add(array[i]);
        }
        if (array[array.length - 1] > array[array.length - 2])
            maxList.add(array[array.length - 1]);

        for (int num : array) {
            if (!maxList.contains(num))
                resultList.add(num);
        }

        return resultList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
