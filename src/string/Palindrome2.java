package string;

public class Palindrome2 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(palindrome("Do geese see God?"));
        long end = System.nanoTime();

        System.out.println("time = " + (end - start));
    }

    public static boolean palindrome(String string) {
        string = string.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String reverseString = new StringBuffer(string).reverse().toString();

        return string.equals(reverseString);
    }
}
