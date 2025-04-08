package StringEasyQuestions;
/*Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false*/

public class ValidAnagram {

    public static boolean validAnagram(String s , String t){
        if (s.length() != t.length()){
            return false;
        }

        int[] store = new int[26];

        for (int i =0; i<s.length(); i++){
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        for (int n : store){
            if(n != 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
//        String s = "anagram";
//        String t = "nagaram";

        String s = "rat";
        String t = "car";

        boolean output = validAnagram(s, t);

        System.out.println("Output: " + output);
    }

}
