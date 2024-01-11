package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 로그의 가장 앞 부분은 식별자로 순서에 영향 없음
 * 문자로 구성된 로그가 숫자 로그보다 앞에 오며, 문자 로그는 사전순으로 하고 문자가 동일할 경우에는 식별자 순서
 * 숫자 로그는 입력 순서대로
 */
public class RecoderLogFiles {
    public static void main(String[] args) {
        long start = System.nanoTime();
        String[] strings = recoderLogFiles(new String[]{"id1 8 1 5 1", "id2 art can", "id3 3 6", "id4 own kit dig", "id5 art zero"});
        long end = System.nanoTime();

        System.out.println("time = " + (end - start));

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static String[] recoderLogFiles(String[] array) {
        List<String> stringList = new ArrayList<>();
        List<String> intList = new ArrayList<>();

        //문자, 숫자 배열 분류
        for (String arr : array) {
            char c = arr.split(" ")[1].charAt(0);

            if (Character.isLetter(c)) {
                stringList.add(arr);
            } else if (Character.isDigit(c)) {
                intList.add(arr);
            }
        }

        //문자배열은 사전순, 단어가 같다면 식별자로 분류
        stringList.sort((o1, o2) -> {
            String[] o1Split = o1.split(" ", 2);
            String[] o2Split = o2.split(" ", 2);

            int compare = o1Split[1].compareTo(o2Split[1]);

            //단어가 같다면 식별자로 분류한다.
            if (compare == 0) {
                compare = o1Split[0].compareTo(o2Split[0]);
            }

            return compare;
        });

        //숫자배열은 입력 순서대로라서 건드릴 정렬 필요 없음
        stringList.addAll(intList);

        return stringList.toArray(new String[0]);
    }
}
