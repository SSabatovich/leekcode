package removeElement;

public class Solution2 {
    int[] nums;
    int val;

    public int removeElement(int[] nums, int val) {

        int[] newArr = new int[nums.length];

        int deleted = 0;

        for (int i = 0, k = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                System.out.println("removed value" + nums[i]);
                deleted++;
            } else {
                newArr[k++] = nums[i];
                System.out.println("parsed value" + nums[i]);
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println("Koncowo" + newArr[i]);
        }
        return 10;
    }

    public Solution2(int[] nums, int val) {
        this.nums = nums;
        this.val = val;
    }
}
