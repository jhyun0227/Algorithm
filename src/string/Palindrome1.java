package string;

public class Palindrome1 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(palindrome("Do geese see God?"));
        long end = System.nanoTime();

        System.out.println("time = " + (end - start));
    }

    public static boolean palindrome(String string) {
        int start = 0;
        int end = string.length() - 1;

        while (start < end) {
            if (!Character.isLetterOrDigit(string.charAt(start))) { //영숫자인지 판별
                start++;
            } else if (!Character.isLetterOrDigit(string.charAt(end))) { //영숫자인지 판별
                end--;
            } else {
                if (Character.toLowerCase(string.charAt(start)) != Character.toLowerCase(string.charAt(end))) {
                    return false;
                }

                start++;
                end--;
            }
        }

        return true;
    }
}
