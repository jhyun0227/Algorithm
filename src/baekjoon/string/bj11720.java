package baekjoon.string;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/11720
 */
public class bj11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        char[] chars = br.readLine().toCharArray();

        int result = 0;
        for (int i = 0; i < n; i++) {
            result += Integer.parseInt(String.valueOf(chars[i]));
        }

        br.close();

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
