package baekjoon.step4;

import java.io.*;

public class bj10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstLine = br.readLine().split(" ");
        int bagCount = Integer.parseInt(firstLine[0]);
        int reverseCount = Integer.parseInt(firstLine[1]);

        int[] bag = new int[bagCount];
        for (int i = 0; i < bagCount; i++) {
            bag[i] = i + 1;
        }

        int temp = 0;
        for (int i = 1; i <= reverseCount; i++) {
            String[] reverseIndex = br.readLine().split(" ");
            int start = Integer.parseInt(reverseIndex[0]) - 1;
            int end = Integer.parseInt(reverseIndex[1]) - 1;

            while (start < end) {
                temp = bag[start];
                bag[start] = bag[end];
                bag[end] = temp;

                start++;
                end--;
            }
        }

        br.close();

        for (int i = 0; i < bag.length; i++) {
            if (i != bag.length) {
                bw.write(bag[i] + " ");
            } else {
                bw.write(bag[i] + "");
            }
        }

        bw.flush();
        bw.close();
    }
}
