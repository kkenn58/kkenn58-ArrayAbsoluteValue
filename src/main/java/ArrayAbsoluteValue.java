
public class ArrayAbsoluteValue {
    /**
     * Given an array of integers 'nums', produce an array of integers composed of the absolute values of all the
     * numbers in 'nums'. Absolute value represents the distance from zero, so negative numbers should become positive
     * and positive numbers should stay the same.
     *
     * @param nums an array.
     * @return the absolute value array of nums.
     */
    public int[] getArrayAbs(int[] nums){
        int nums2[];
        nums2 = new int[nums.length];
       for(int x = 0; x < nums.length; x++){
        nums2[x] = Math.abs(nums[x]);
        
       }
        return nums2;
    }
}