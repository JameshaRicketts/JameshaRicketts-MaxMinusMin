
//import java.util.Collections;
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        int min = nums.get(0);
        int max = nums.get(0);
        for (int number : nums){
            if(number>max) {
                max = number;
            } else if (number < min) {
                min = number;
            }
        }
        //int min = Collections.min(nums);
        //int max = Collections.max(nums);
        return max-min;
    }
}
