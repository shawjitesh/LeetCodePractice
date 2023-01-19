package org.practice.subarraySumsDivisibleByK;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter size of the array: ");
            int size = Integer.parseInt(reader.readLine());

            int[] nums = new int[size];
            System.out.println("Enter " + size + " elements in the array -->");
            for(int i = 0; i < size; i++){
                System.out.print("Element " + (i + 1) + ": ");
                nums[i] = Integer.parseInt(reader.readLine());
            }

            System.out.print("Enter value of K: ");
            int k = Integer.parseInt(reader.readLine());
            System.out.println("Result: " + new SubarraySumsDivisibleByK().subarraysDivByK(nums, k));
        } catch(IOException exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
    }
}
