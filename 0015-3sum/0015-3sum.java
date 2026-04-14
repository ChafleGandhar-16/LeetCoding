class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        
        Arrays.sort(nums);
        
        for (int i = 0; i<nums.length-2; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = 1+i;
            int right = nums.length-1;
            while (left<right) {
                if ((nums[i] + nums[left] + nums[right] == 0)) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else {
                    if (nums[i] + nums[left] + nums[right] > 0) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
            left = 1+i;
            right = nums.length-1;
        }
        return res;
    }
}