import java.util.*;

class Solution {
    public boolean isPalindrome(String s) {
        // int k = 0;
        // for (int i = 0; i<s.length(); i++) {
        //     if (Character.isLetter(s.charAt(i))) {
        //         s.replace(s.charAt(k), s.charAt(i));
        //         k++;
        //     }
        // }
        // s = s.toLowerCase();
        // System.out.println(s);
        // for (int i = 0; i<k/2; i++) {
        //     if (s.charAt(i)!=s.charAt(k-i)) return false;
        // }
        // return true;
        if (s.length() == 1 && Character.isLetterOrDigit(s.charAt(0))) return true;
        int left = 0;
        int right = s.length()-1;
        s = s.toLowerCase();
        while (left<right) {
            while (left<right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while (left<right && !Character.isLetterOrDigit(s.charAt(right))) right--;
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;        
        }
        return true;
    }
}