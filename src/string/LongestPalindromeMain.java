package string;

public class LongestPalindromeMain {

    public static void main(String[] args) {
        LongestPalindrome1 longestPalindrome1 = new LongestPalindrome1();

        long start = System.nanoTime();

//        String input = "dcbabcdd";
        String input = "cdabbadf";
        System.out.println(longestPalindrome1.longestPalindrome(input));

        long end = System.nanoTime();

        System.out.println("time = " + (end - start));
    }
}
