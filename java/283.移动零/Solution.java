
public class Solution {
    /**
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     *
     * 示例:
     *
     * 输入: [0,1,0,3,12]
     * 输出: [1,3,12,0,0]
     * 说明:
     *
     * 必须在原数组上操作，不能拷贝额外的数组。
     * 尽量减少操作次数。
     */
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        while(i < nums.length) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
            i++;
        }
        while (i - j  > 0) {
            nums[i-- -1] = 0;
        }
    }

}
