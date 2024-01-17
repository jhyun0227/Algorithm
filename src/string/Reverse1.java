package string;

public class Reverse1 {
    public static void main(String[] args) {
        long start = System.nanoTime();

        char[] array = {'d', 'a', '2', 'c', 'a', 'r'};
        reverse(array);

        for (char c : array) {
            System.out.println(c);
        }

        long end = System.nanoTime();

        System.out.println("time = " + (end - start));
    }

    public static void reverse(char[] array) {
        int start = 0;
        int end = array.length - 1;

        char temp;

        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }
}
