package string;

public class LongestPalindrome1 {

    int left, maxLength;

    public String longestPalindrome(String input) {
        if (input.length() < 2) {
            return input;
        }

        for (int i = 0; i < input.length() - 1; i++) {
            extendPalindrome(input, i, i+1);
            extendPalindrome(input, i, i+2);
        }

        return input.substring(left, maxLength);
    }

    private void extendPalindrome(String input, int i, int j) {
        while (i >= 0 && j < input.length() && input.charAt(i) == input.charAt(j)) {
            i--;
            j++;
        }

        if (maxLength < j - i - 1) {
            left = i + 1;
            maxLength = j - i - 1;
        }
    }
}
