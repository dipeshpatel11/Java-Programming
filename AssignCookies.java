// Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.

// Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with; and each cookie j has a size s[j].
// If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content. 
// Your goal is to maximize the number of your content children and output the maximum number.

import java.util.Arrays;

public class AssignCookies {

    public static int assignCookies(int[] greed_size, int[] cookie_size){

        Arrays.sort(greed_size);
        Arrays.sort(cookie_size);
        int i = 0;
        for(int j=0; i<greed_size.length && j<cookie_size.length; j++) {
                if (greed_size[i] <= cookie_size[j]) {
                    i++;
                }
            }
        return i;
    }

    public static void main(String[] args) {

        int [] greed_size = {1,4,2,3};
        int [] cookie_size = {4,1,2,3};
        System.out.println(assignCookies(greed_size,cookie_size));
    }

}