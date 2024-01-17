package string;

import java.io.*;

/**
 * 백준 10988번
 */
public class Palindrome3 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(palindrome("Do geese see God?"));
        long end = System.nanoTime();

        System.out.println("time = " + (end - start));
    }

    public static boolean palindrome(String string) {
        /**
         * 1. 우선적으로 문자열에서 띄어쓰기나, 부호 같은 것들 제거
         * 2. 소문자화 후, 문자 배열로 변경
         * 3. 비교
         */
        char[] chars = string.replaceAll("\\W", "").toLowerCase().toCharArray();

        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
