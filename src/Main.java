import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                bw.write(" ");
            }
            for (int k = 1; k <= 2*i-1; k++) {
                bw.write("*");
            }

            bw.write("\n");
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= n-i; j++) {
                bw.write(" ");
            }

            for (int k = 1; k <= 2*i-1; k++) {
                bw.write("*");
            }

            if (i != 1) {
                bw.write("\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
