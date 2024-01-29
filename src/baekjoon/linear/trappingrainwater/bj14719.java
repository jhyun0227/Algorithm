package baekjoon.linear.trappingrainwater;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj14719 {

    //투 포인터를 이용한 방법
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int length = Integer.parseInt(st.nextToken());
        int width = Integer.parseInt(st.nextToken());

        int[] height = new int[width];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < width; i++) {
            height[i] = Integer.parseInt(st.nextToken());
        }

        int volume = 0;
        int left = 0;
        int right = height.length - 1;
        int leftMax = height[left];
        int rightMax = height[right];

        while (left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            if (leftMax <= rightMax) {
                volume += leftMax - height[left];
                left++;
            } else {
                volume += rightMax - height[right];
                right--;
            }
        }

        br.close();
        bw.write(String.valueOf(volume));
        bw.flush();
        bw.close();
    }
}