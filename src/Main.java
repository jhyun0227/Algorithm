import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int loop = num / 4;

        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= loop; i++) {
            result.append("long ");
        }

        result.append("int");

        br.close();
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
