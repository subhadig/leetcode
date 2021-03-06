// https://leetcode.com/problems/rotate-array/

class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    
    void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            
            start++;
            end--;
        }
    }
}

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        
        if(k == 0) {
            return;
        }
        
        int i = 0;
        int tmp;
        while(i < k) {
            tmp = nums[i];
            nums[i] = nums[n - k + i];
            nums[n - k + i] = tmp;
            i++;
        }
        
        while(i < n - 1) {
            System.out.println("i:" + i + ", (i + n - 2k):" + (i + n - 2*k));
            System.out.println(Arrays.toString(nums));
            tmp = nums[i];
            nums[i] = nums[i + n - 2*k];
            nums[i + n - 2*k] = tmp;
            i++;
        }
    }
}
