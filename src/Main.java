import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        String[] firstLine = br.readLine().split(" ");
        int bagCount = Integer.parseInt(firstLine[0]);
        int reverseCount = Integer.parseInt(firstLine[1]);

        for (int i = 1; i <= bagCount; i++) {
            sb.append(i);
        }

        for (int i = 1; i <= reverseCount; i++) {
            String[] reverseIndex = br.readLine().split(" ");
            int start = Integer.parseInt(reverseIndex[0]) - 1;
            int end = Integer.parseInt(reverseIndex[1]);

            String reverseString = new StringBuilder(sb.substring(start, end)).reverse().toString();
            sb.replace(start, end, reverseString);
        }

        br.close();

        for (int i = 0; i < sb.length(); i++) {
            if (i != sb.length() -1) {
                bw.write(sb.charAt(i) + " ");
            } else {
                bw.write(sb.charAt(i) + "");
            }
        }

        bw.flush();
        bw.close();
    }
}
