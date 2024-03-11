package baekjoon.step5;

import java.io.*;

public class bj11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String word = br.readLine();

            if ("".equals(word) || word == null) {
                break;
            }

            bw.write(word + "\n");
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
