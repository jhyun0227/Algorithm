package baekjoon.step4;

import java.io.*;

public class bj10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        int bagCount = Integer.parseInt(nm[0]);
        int throwCount = Integer.parseInt(nm[1]);

        int[] bagArray = new int[bagCount];

        for (int i = 0; i < bagCount; i++) {
            bagArray[i] = i + 1;
        }

        int temp;
        for (int i = 1; i <= throwCount; i++) {
            String[] changeNums = br.readLine().split(" ");
            int changeNum1 = Integer.parseInt(changeNums[0]);
            int changeNum2 = Integer.parseInt(changeNums[1]);

            temp = bagArray[changeNum1 - 1];
            bagArray[changeNum1 - 1] = bagArray[changeNum2 - 1];
            bagArray[changeNum2 - 1] = temp;
        }

        br.close();

        for (int i = 0; i < bagArray.length; i++) {
            if (i != bagArray.length - 1) {
                bw.write(bagArray[i] + " ");
            } else {
                bw.write(String.valueOf(bagArray[i]));
            }
        }

        bw.flush();
        bw.close();
    }
}
