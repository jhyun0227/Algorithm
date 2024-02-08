package baekjoon.step5;

import java.io.*;

public class bj1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = 0;

        String[] wordSplit = br.readLine().split(" ");

        for (int i = 0; i < wordSplit.length; i++) {
            if (!"".equals(wordSplit[i])) {
                length++;
            }
        }

        br.close();
        bw.write(String.valueOf(length));
        bw.flush();
        bw.close();
    }
}