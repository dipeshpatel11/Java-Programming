// You are climbing a staircase. It takes n steps to reach the top.

// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

public class ClimbingStairs {

    public static int climbStairs(int n) {

        if(n == 0){
            return 0;
        }
        if(n <= 1){
            return 1;
        }

        int[] arr = new int[n + 1];
        arr[1] = 1;
        arr[2] = 2;

        for(int i = 3;i <= n;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }

     public static void main(String[] args) {

        int stairs = 10;
        System.out.println(climbStairs(stairs));
        
    }
}
