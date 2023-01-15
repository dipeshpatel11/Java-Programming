import java.util.HashSet;
import java.util.Set;

// You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. 
// Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

// Letters are case sensitive, so "a" is considered a different type of stone from "A".

public class JewelnStones {

    public static int jewelnStones(String jewels, String stones){

        Set<Character> jewelStore = new HashSet<>();
        for (char c : jewels.toCharArray()) {
            jewelStore.add(c);
        }
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewelStore.contains(stones.charAt(i))) {
                count += 1;
            }
        }
        return count;
    }
    

    public static void main(String[] args) {

        String jewel = "z";
        String stones = "ZzZz";
        System.out.println(jewelnStones(jewel, stones));
    
    }
    
}
