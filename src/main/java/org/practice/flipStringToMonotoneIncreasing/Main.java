package org.practice.flipStringToMonotoneIncreasing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter a binary string: ");
            String s = reader.readLine();

            FlipStringToMonotoneIncreasing monotoneIncreasing = new FlipStringToMonotoneIncreasing();
            System.out.println("FLips required: " + monotoneIncreasing.minFlipsMonoIncr(s));
        } catch(IOException exception) {
            System.out.println("Exception: " + exception.getMessage());
        }
    }
}