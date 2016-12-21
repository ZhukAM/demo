/**
 * Created by Aleksandr Zhuk on 21.12.16.
 */

public class Palindromes {
    public static boolean isPalindrome(String s) {
        String normalizedText = normalize(s);
        return normalizedText.equals(reverse(normalizedText));
    }
    private static String normalize(String s) {
        return s.toLowerCase().replaceAll("\\W+", "");
    }
    private static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I’m Adam") ? "palindrome" : "not palindrome");
    }
}
