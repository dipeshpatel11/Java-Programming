import java.util.ArrayList;
import java.util.List;
// You are given a string sentence that consist of words separated by spaces. Each word consists of lowercase and uppercase letters only.

// We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.) The rules of Goat Latin are as follows:

// If a word begins with a vowel ('a', 'e', 'i', 'o', or 'u'), append "ma" to the end of the word.
// For example, the word "apple" becomes "applema".
// If a word begins with a consonant (i.e., not a vowel), remove the first letter and append it to the end, then add "ma".
// For example, the word "goat" becomes "oatgma".
// Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
// For example, the first word gets "a" added to the end, the second word gets "aa" added to the end, and so on.
// Return the final sentence representing the conversion from sentence to Goat Latin.

public class GoatLatin {

    public static boolean isVowel(char c){
        
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static String goatLatin(String sentence) {

        List<String> list = new ArrayList<>();
        String arr[] = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length;i++){
            char detachedOriginal = arr[i].charAt(0);
            char detach = arr[i].toLowerCase().charAt(0);
            String rem = arr[i].substring(1);
            if(isVowel(detach)){
                sb.append(arr[i]);
                sb.append("ma");
                for(int j = 0;j<=i;j++){
                    sb.append("a");
                }
            }
            else{
                sb.append(rem);
                sb.append(detachedOriginal);
                sb.append("ma");
                for(int j = 0;j<=i;j++){
                    sb.append("a");
                }
            }
            list.add(sb.toString());
            sb.setLength(0);
        }
        for(int i = 0;i<list.size() - 1;i++){
            sb.append(list.get(i));
            sb.append(" ");
        }
        sb.append(list.get(list.size()-1));
        return sb.toString();
    }
    public static void main(String[] args) {
        String str ="Deep Patel is great";
        System.out.println (goatLatin(str));
    }
}