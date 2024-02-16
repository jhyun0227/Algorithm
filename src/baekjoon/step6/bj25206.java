package baekjoon.step6;

import java.io.*;

public class bj25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double creditSum = 0;
        double gradeSum = 0;
        for (int i = 0; i < 20; i++) {
            String[] input = br.readLine().split(" ");

            if ("P".equals(input[2])) {
                continue;
            }

            //학점의 총합
            Double credit = Double.valueOf(input[1]);
            creditSum += credit;

            //과목평점의 총합
            switch (input[2]) {
                case "A+":
                    gradeSum += 4.5 * credit;
                    break;
                case "A0":
                    gradeSum += 4.0 * credit;
                    break;
                case "B+":
                    gradeSum += 3.5 * credit;
                    break;
                case "B0":
                    gradeSum += 3.0 * credit;
                    break;
                case "C+":
                    gradeSum += 2.5 * credit;
                    break;
                case "C0":
                    gradeSum += 2.0 * credit;
                    break;
                case "D+":
                    gradeSum += 1.5 * credit;
                    break;
                case "D0":
                    gradeSum += 1.0 * credit;
                    break;
                case "F":
                    gradeSum += 0.0 * credit;
                    break;
            }
        }

        br.close();
        bw.write(String.valueOf(gradeSum / creditSum));
        bw.flush();
        bw.close();
    }
}
