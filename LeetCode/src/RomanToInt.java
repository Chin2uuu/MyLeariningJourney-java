import java.util.HashMap;

class Solution {
    public static int romanToInt(String s) {

        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        
        int value = roman.get(s.charAt(0));
        
        for (int x = 1; x < s.length(); x++) {
            int preChar = roman.get(s.charAt(x - 1));
            int curChar = roman.get(s.charAt(x));
            
            if (preChar >= curChar)
                value += curChar;
            else {
                value = (value - preChar) + (curChar - preChar);
            }
            
        }
        
        return value;
    }
}
public class RomanToInt extends Solution {
	public static void main(String args[]) {
		System.out.println(romanToInt("LXX"));
	}
}