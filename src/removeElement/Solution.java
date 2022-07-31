package removeElement;

public class Solution {
    int[] nums;
    int val;

    public int removeElement(int[] nums, int val) {
        int k=0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                //System.out.println("removed value" + nums[i]);
            } else {
                nums[k++] = nums[i];
                //System.out.println("parsed value" + nums[i]);
            }
        }
        return k;
    }

    public Solution(int[] nums, int val) {
        this.nums = nums;
        this.val = val;
    }
}
