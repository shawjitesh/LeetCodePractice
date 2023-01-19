package org.practice.subarraySumsDivisibleByK;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumsDivisibleByK {

    /*While traversing the array, for each index
    * calculate the sum till that index and store the remainder (sum % k)
    * in a hashmap. Initially put 0 as remainder in the hashmap with frequency 1.
    * If remainder < 0, add k to the remainder.
    * If the hashmap does not contain the remainder, put the new remainder
    * in the hashmap with frequency 1, else add the frequency to count and
    * increment the frequency in the hashmap by 1.
    * Return the count*/

    public int subarraysDivByK(int[] nums, int k) {

        int count = 0, sum = 0;
        Map<Integer, Integer> remainderMap = new HashMap<>();
        remainderMap.put(0, 1);

        for (int num : nums) {
            sum += num;
            int remainder = sum % k;
            if (remainder < 0) remainder += k;

            if (remainderMap.containsKey(remainder)) {
                count += remainderMap.get(remainder);
                remainderMap.put(remainder, remainderMap.get(remainder) + 1);
            } else remainderMap.put(remainder, 1);
        }

        return count;
    }
}
