package baekjoon.step5;

import java.io.*;
import java.util.StringTokenizer;

public class bj2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder firstNum = new StringBuilder(st.nextToken());
        StringBuilder secondNum = new StringBuilder(st.nextToken());

        int first = Integer.parseInt(String.valueOf(firstNum.reverse()));
        int second = Integer.parseInt(String.valueOf(secondNum.reverse()));

        int result = 0;

        if (first > second) {
            result = first;
        } else if (first < second) {
            result = second;
        }

        br.close();
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
