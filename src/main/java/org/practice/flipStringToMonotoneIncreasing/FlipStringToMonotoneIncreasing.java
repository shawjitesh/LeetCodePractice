package org.practice.flipStringToMonotoneIncreasing;

public class FlipStringToMonotoneIncreasing {

    /*Starting from the first occurrence of 1 in the string
    * keep track of number of 1's(counter) and 0's(flips) till that point
    * and update flips with minimum of counter and flips, return*/

    public int minFlipsMonoIncr(String s) {

        int firstOne = s.indexOf('1');

        if(firstOne >= 0) {
            int counter = 0, flips = 0;

            for(int i = firstOne; i < s.length(); i++) {
                if(s.charAt(i) == '1') counter++;
                else flips++;
                flips = Math.min(counter, flips);
            }
            return flips;
        }

        return 0;
    }
}
