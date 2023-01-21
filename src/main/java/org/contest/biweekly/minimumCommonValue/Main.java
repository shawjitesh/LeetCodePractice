package org.contest.biweekly.minimumCommonValue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter size of array, nums1: ");
            int size = Integer.parseInt(reader.readLine());

            int[] nums1 = new int[size];
            System.out.println("Enter " + size + " elements in the array -->");
            for(int i = 0; i < size; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                nums1[i] = Integer.parseInt(reader.readLine());
            }

            System.out.println("Enter size of array, nums2: ");
            size = Integer.parseInt(reader.readLine());

            int[] nums2 = new int[size];
            System.out.println("Enter " + size + " elements in the array -->");
            for(int i = 0; i < size; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                nums2[i] = Integer.parseInt(reader.readLine());
            }

            System.out.println("Result: " + new MinimumCommonValue().getCommon(nums1, nums2));
        } catch(IOException exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
    }
}
