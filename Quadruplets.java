package com.inpwrd.benji.channels2.plugins.yahoodsp.businesslogic.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <<TODO>>
 *
 * @author Gabriel Diaz, 9/29/22.
 */
public class Quadruplets {

    public static void main(String[] arg) {
        int[] numbers = new int[] { 7, 6, 4, -1, 1, 2}; // Assuming the numbers are distinct
        int targetSum = 16;
        List<int[]> quadruplets = quadruplets(numbers, targetSum);
        System.out.println("Quadruplets: " + quadruplets.stream().map(Arrays::toString).collect(Collectors.joining()));
    }

    private static List<int[]> quadruplets(int[] numbers, int targetSum) {
        List<int[]> result = new ArrayList<>();
        if (numbers != null) {
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    for (int k = j + 1; k < numbers.length; k++) {
                        for (int l = k + 1; l < numbers.length; l++) {
                            if (numbers[i] + numbers[j] + numbers[k] + numbers[l] == targetSum) {
                                result.add(new int[] { numbers[i], numbers[j], numbers[k], numbers[l] });
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

}

