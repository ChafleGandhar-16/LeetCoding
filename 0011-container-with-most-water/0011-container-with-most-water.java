class Solution {
    public int maxArea(int[] arr) {
        int max = -1;
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while (left<right) {
            int h = Math.min(arr[left], arr[right]);
            max = Math.max(max, h * (right-left));
            while (right>left && arr[right]<=h) right--;
            while (right>left && arr[left]<=h) left++;
        }
        return max;
    }
}