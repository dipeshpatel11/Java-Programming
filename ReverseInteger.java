// Given a signed 32-bit integer x, return x with its digits reversed. 
// If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.



public class ReverseInteger {

        public static int reverseInt(int x) {
          long temp = 0,reversed = 0; 
          while(x!=0){
            temp = x%10;
            reversed=reversed*10+temp;
            x=x/10;
          }
          if(reversed>Integer.MAX_VALUE || reversed<Integer.MIN_VALUE){
            return 0;
          } 
          return (int)reversed;
        }

        public static void main(String[] args) {
            int number = 41869;
            System.out.println(reverseInt(number));
            
        }
    }
    

