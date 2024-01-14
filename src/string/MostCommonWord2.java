package string;

import java.util.*;

public class MostCommonWord2 {
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
        //금지어 목록이 Stirng 배열, 비교 메소드를 제공하는 Set으로 변경
        HashSet<String> ban = new HashSet<>(Arrays.asList(banned));

        //각 단어별 개수가 저장될 키-값 맵
        HashMap<String, Integer> counts = new HashMap<>();

        //전처리 작업 후 단어 목록을 배열로 저장
        String[] words = paragraph.replaceAll("\\W+", " ").toLowerCase().split(" ");

        //금지 단어 선별
        for (String word : words) {
            //금지 단어 Set에 단어가 포함되지 않으면, 맵에 값을 1씩 증가시킨다.
            if (!ban.contains(word)) {
                counts.put(word, counts.getOrDefault(word, 0) + 1);
            }
        }

        //가장 흔하게 등장하는 단어를 추출한다.
        System.out.println("가장 많이 등장한 단어 : " + Collections.max(counts.entrySet(), Map.Entry.comparingByValue()).getKey());
    }
}
