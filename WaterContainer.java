public class WaterContainer {
    // BF time: O(n^2) space: O(1)
    // You are given an integer array height of length n. 
    // There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

    // Find two lines that together with the x-axis form a container, such that the container contains the most water.
    
    // Return the maximum amount of water a container can store.
    
    // Notice that you may not slant the container.
    public static int maxArea_bf(int[] height) {
        int len = height.length;
        int max = 0;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                int area = Math.min(height[i], height[j]) * (j - i);
                max = Math.max(max, area);
            }
        }

        return max;
    }

        // Two Pointers time: O(n) space: O(1)
        public static int maxArea_tp(int[] height) {
            int len = height.length;
            int left = 0;
            int right = len - 1;
            int max = Math.min(height[left], height[right]) * (right - left);
            while (left < right) {
                // Move the shorter lines each time
                if (height[left] <= height[right]) {
                    left++;
                } else {
                    right--;
                }
    
                // update the max area
                max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
            }
    
            return max;
        }
    
    public static void main(String[] args) {
        int[] containers1 = {3,6,5,8,4,2,5,7,2,9,6,3,19,5,3,78,6,9,2,1,4,6};
        int[] containers2 = {6,4,6,3,8,3,9,3,7};

        System.out.println(maxArea_bf(containers1));
        System.out.println(maxArea_tp(containers2));

    }
}
