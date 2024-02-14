package baekjoon.step6;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class bj1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine().toUpperCase();

        Map<Character, Integer> countMap = new HashMap<>();

        int max = 0;
        for (int i = 0; i < word.length(); i++) {
            char alphabet = word.charAt(i);

            Integer value = countMap.getOrDefault(alphabet, 0) + 1;
            countMap.put(alphabet, value);

            if (value > max) {
                max = value;
            }
        }

        int cnt = 0;
        char ch = '?';
        for (Map.Entry<Character, Integer> characterIntegerEntry : countMap.entrySet()) {
            if (characterIntegerEntry.getValue() == max) {
                cnt++;
                ch = characterIntegerEntry.getKey();
            }
        }

        br.close();
        bw.write(cnt > 1 ? "?" : String.valueOf(ch));
        bw.flush();
        bw.close();
    }
}
