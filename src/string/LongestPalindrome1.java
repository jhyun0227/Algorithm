package string;

public class LongestPalindrome1 {

    int left, maxLength;

    public String longestPalindrome(String input) {
        if (input.length() < 2) {
            return input;
        }

        //글자가 짝수일경우, 홀수일 경우를 가정하여 2포인터, 3포인터를 사용
        for (int i = 0; i < input.length() - 1; i++) {
            extendPalindrome(input, i, i+1);
            extendPalindrome(input, i, i+2);
        }

        //시작점 + 최대글자수
        return input.substring(left, left + maxLength);
    }

    private void extendPalindrome(String input, int i, int j) {
        //i, j가 범위에 맞고, 해당 위치의 문자가 같은 문자일 경우
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
