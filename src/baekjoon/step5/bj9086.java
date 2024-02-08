package baekjoon.step5;

import java.io.*;

public class bj9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i = 1; i <= count; i++) {
            String inputWord = br.readLine();

            String startChar = String.valueOf(inputWord.charAt(0));
            String endChar = String.valueOf(inputWord.charAt(inputWord.length() - 1));

            if (i != count) {
                bw.write(startChar + endChar + "\n");
            } else {
                bw.write(startChar + endChar);
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
