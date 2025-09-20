package String;

public class PalindromeCheck {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man a plan a canal Panama"));
    }
}
