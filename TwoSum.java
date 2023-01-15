// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

public class TwoSum {
    public static void twosum(){

        int nums[];
        nums = new int[]{ 1,12,31,42,4,4356,34,1,4354,1,35,12,3,6,45,6,9,1,23,5,12,5,6,32,5,2,3,67,1,35,43,63,234,25,6,34,5,46,78,5,78,65,3,1,234,11,3,999, 999 };
        int target;
        target = 1998;
        int nums_len = nums.length;

        boolean flag = true;
        for(int i = 0; i< nums_len;i++ ){
            for(int j = 0; j< nums_len;j++ ){
                while (flag){
                    if( i != j && nums[i]+nums[j] == target){
                        System.out.println("[" + i + "," + j + "]");
                        flag = false;
                    }
                    else{
                        break;
                    }

                }

                }
            }
        }
    
    public static void main(String[] args) {

        twosum();
    }

}