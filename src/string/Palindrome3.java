package string;

import java.io.*;

/**
 * 백준 10988번
 */
public class Palindrome3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();

        int start = 0;
        int end = s.length() - 1;
        String result = "1";

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                result = "0";
                break;
            }

            start++;
            end--;
        }

        br.close();

        bw.write(result);
        bw.flush();
        bw.close();
    }
}
