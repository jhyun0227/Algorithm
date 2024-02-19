package baekjoon.step6;

import java.io.*;

public class bj1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < loop; i++) {
            if (check(br.readLine())) {
                result++;
            }
        }

        br.close();
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

    private static boolean check(String word) {
        boolean[] alphabet= new boolean[26];

        //첫단어 확인
        alphabet[word.charAt(0) - 'a'] = true;

        //두번째 단어부터 체크
        for (int i = 1; i < word.length(); i++) {
            int now = word.charAt(i);
            int prev = word.charAt(i - 1);

            if (alphabet[now - 'a'] == false) {
                alphabet[now - 'a'] = true;
            } else if (now != prev) {
                return false;
            }
        }

        return true;
    }
}
