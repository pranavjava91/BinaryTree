package Solutions;

import java.util.Arrays;

class Rotate {
    public void solution(int[] nums, int k) {

        if(k>nums.length){
            k = k%nums.length;
        }

        reverseArray(nums,0,nums.length-1);
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,nums.length-1);

    }

    public void reverseArray(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
    	int[] nums = {1,2,3,4,5,6,7};
    	Rotate rotate  = new Rotate();
    	rotate.solution(nums, 3);
    	System.out.println(Arrays.toString(nums));
    }
 }
