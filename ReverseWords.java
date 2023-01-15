// Given an input string s, reverse the order of the words.

// A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

// Return a string of the words in reverse order concatenated by a single space.

// Note that s may contain leading or trailing spaces or multiple spaces between two words. 
// The returned string should only have a single space separating the words. 
// Do not include any extra spaces

public class ReverseWords {

    public static String reverseWords(String s){

        String arr[] = s.split("\s+");

        StringBuilder str = new StringBuilder();
        
        for(int i = arr.length-1;i>=0;i--){
            str.append(arr[i].trim() + " ");
        }
        String rev_str = str.toString().trim();
        return rev_str;
    }

    public static void main(String[] args) {
        String str = "Hi, My name is Dipesh Patel";
        System.out.println(reverseWords(str));

    }
}