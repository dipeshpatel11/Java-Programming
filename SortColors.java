// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, 
// with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.


public class SortColors {

    public static void main(String[] args) {
        int [] nums = {2,0,2,1,1,0};

        for (int i = 1; i < nums.length; ++i) {
            int key = nums[i];
            int j = i -1;
            while(j >= 0 && nums[j]>key ){
                nums[j+1] = nums[j];
                j--;
                
            }
            nums[j+1] = key;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            
        }
        
    }
    
}
