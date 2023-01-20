package org.practice.nonDecreasingSubsequences;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NonDecreasingSubsequences {

    /*Using backtracking approach to create all possible
    * increasing subsequences of size >= 2 and adding
    * them in the resultant list of subsequences. After
    * reaching the end of each traversal, backtrack and
    * remove element one by one from the subsequence and
    * check if it is already present in the resultant list,
    * if not then add it and repeat this same logic for
    * each index while iterating through the given array*/

    public List<List<Integer>> findSubsequences(int[] nums) {

        List<List<Integer>> listOfSubsequences = new ArrayList<>();
        List<Integer> subsequence = new ArrayList<>();

        backtrack(nums, nums.length, 0, subsequence, listOfSubsequences);

        return listOfSubsequences;
    }

    private void backtrack(int[] nums, int length, int currIndex, List<Integer> subsequence, List<List<Integer>> listOfSubsequences) {

        if(subsequence.size() > 1)
            listOfSubsequences.add(new ArrayList<>(subsequence));

        Set<Integer> set = new HashSet<>();

        for(int i = currIndex; i < length; i++) {
            if(!set.add(nums[i])) continue;
            if(subsequence.isEmpty() || nums[i] >= subsequence.get(subsequence.size() - 1)) {
                subsequence.add(nums[i]);
                backtrack(nums, nums.length, i + 1, subsequence, listOfSubsequences);
                subsequence.remove(subsequence.size() - 1);
            }
        }
    }
}
