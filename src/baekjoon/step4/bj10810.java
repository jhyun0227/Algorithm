package baekjoon.step4;

import java.io.*;

public class bj10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstLine = br.readLine().split(" ");
        int bagCount = Integer.parseInt(firstLine[0]);
        int inputCount = Integer.parseInt(firstLine[1]);

        int[] bags = new int[bagCount];

        for (int i = 1; i <= inputCount; i++) {
            String[] inputLine = br.readLine().split(" ");
            int startBag = Integer.parseInt(inputLine[0]);
            int endBag = Integer.parseInt(inputLine[1]);
            int ballNum = Integer.parseInt(inputLine[2]);

            for (int j = startBag - 1; j <= endBag - 1; j++) {
                bags[j] = ballNum;
            }
        }

        br.close();

        for (int i = 0; i < bags.length; i++) {
            if (i != bags.length - 1) {
                bw.write(bags[i] + " ");
            } else {
                bw.write(bags[i] + "");
            }
        }
        bw.flush();
        bw.close();
    }
}
