package org.contest.biweekly.minimumCommonValue;

import java.util.ArrayList;
import java.util.List;

public class MinimumCommonValue {

    public int getCommon(int[] nums1, int[] nums2) {

        List<Integer> nums2List = new ArrayList<>();
        for(int element : nums2) {
            nums2List.add(element);
        }

        for(int element : nums1) {
            if(nums2List.contains(element)){
                return element;
            }
        }

        return -1;
    }
}
