package baekjoon.step5;

import java.io.*;

public class bj27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        int index = Integer.parseInt(br.readLine()) - 1;

        br.close();
        bw.write(word.charAt(index));
        bw.flush();
        bw.close();
    }
}
