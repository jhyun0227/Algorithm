import java.io.*;

public class BufferedReaderTest {
    public static void main(String[] args) {
        File file = new File("/Users/uniess", "bfvkdata.txt");

        FileInputStream fis = null;

        try {
            fis = new FileInputStream(file);

            StringBuilder sb = new StringBuilder();
            byte[] b = new byte[5];
            int readByte = 0;

            while ((readByte = fis.read(b)) != -1) {
                sb.append(new String(b, 0, readByte));
            }

            System.out.println(sb.toString());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}