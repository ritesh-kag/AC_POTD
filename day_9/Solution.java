class Solution {
    public void rotate(int[] nums, int k) {  
       int i;
            int[] nums2 = new int[nums.length];
            for( i=0; i< nums.length; i++){
                nums2[(i+k)% nums.length]=nums[i];
            }
            for(i=0; i< nums.length; i++){
                nums[i]=nums2[i];
            }
            for(i=0; i< nums.length; i++){
                System.out.println(nums[i]);
            }
    }
}
//using kadane's algorithm
/* Numbers: [-2, 1, -3, 4, -1, 2, 1, -5, 4]

step 1. Add numbers one by one
step 2. If your running sum drops below 0 → reset to 0 (start new subarray)
step 3. Remember the highest sum you ever get*/
