package string;

import java.util.*;

public class MostCommonWord1 {
    public static void main(String[] args) {
        long start = System.nanoTime();

        String paragraph
                = "Ross hit a ball, the hit BALL flew far away after it was hit";
        String[] banned = {"hit"};
        mostCommonWord1(paragraph, banned);

        long end = System.nanoTime();

        System.out.println("time = " + (end - start));
    }

    public static void mostCommonWord1(String paragraph, String[] banned) {
        //1. banned 배열 -> Set으로 변경 / 비교를 가능하게하는 메서드가 Set에 존재
        HashSet<String> ban = new HashSet<>(Arrays.asList(banned));

        //2. 단어 개수를 확인하기 위한, Map 생성
        Map<String, Integer> counts = new HashMap<>();

        //문자열을 정규식을 통해 치환
        /**
         * \W : 알파벳 대소문자, 숫자가 아닌것 [^a-zA-Z_0-9]
         * + : 표현식이 1개 이상이거나 여러개
         * \W+ :단어문자가 아닌 값을 의미
         */
        String[] words = paragraph.replaceAll("\\W+", " ").toLowerCase().split(" ");

        //변환한 단어들을 ban과 비교하고, Map 담는다.
        for (String word : words) {
            if (!ban.contains(word)) {
                //getOrDefault : Key로 Value를 가져오되, 없다면 2번째 파라미터(기본값)을 사용한다.
                counts.put(word, counts.getOrDefault(word, 0) + 1);
            }
        }

        //가장 많이 나온 단어를 찾는다.
        System.out.println(Collections.max(counts.entrySet(), Map.Entry.comparingByValue()).getKey());
    }
}
