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
