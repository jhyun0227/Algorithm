package baekjoon.step5;

import java.io.*;

public class bj2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();

        br.close();
        bw.write(String.valueOf(word.length()));
        bw.flush();
        bw.close();
    }
}
