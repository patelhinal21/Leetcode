class Solution {
    public int[] sortedSquares(int[] nums) {
        int n= nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n -1;
        int pos = n- 1;

         while (left <= right) {
            int leftVal = nums[left];
            int rightVal = nums[right];

            if (Math.abs(leftVal) > Math.abs(rightVal)) {
                result[pos] = leftVal * leftVal;
                left++;
            } else {
                result[pos] = rightVal * rightVal;
                right--;
            }

            pos--;
        }

        return result;
    }
}
