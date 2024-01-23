package baekjoon.linear.twosum;

import java.io.*;
import java.util.Arrays;

/**
 * 백준 10988번
 */
public class bj3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //수열 n
        int n = Integer.parseInt(br.readLine());

        //수열에 포함되는 수
        String[] nums = br.readLine().split(" ");
        int[] intNums = Arrays.stream(nums).mapToInt(Integer::parseInt).toArray();

        //타겟
        int target = Integer.parseInt(br.readLine());

        //수열 정렬
        Arrays.sort(intNums);

        //결과
        int result = 0;

        //투 포인터를 이용해 조회
        int left = 0;
        int right = intNums.length - 1;

        while (left < right) {
            if (target > intNums[left] + intNums[right]) {
                left++;
            } else if (target < intNums[left] + intNums[right]) {
                right--;
            } else {
                left++;
                right--;

                result++;
            }
        }

        br.close();
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
