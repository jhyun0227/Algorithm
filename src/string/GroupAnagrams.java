package string;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        long start = System.nanoTime();

        String[] words = {"eat", "tea", "tan", "ate", "ant", "cat"};
        List<List<String>> results = groupAnagrams(words);

        for (List<String> result : results) {
            for (String word : result) {
                System.out.println("word = " + word);
            }
            System.out.println();
        }

        long end = System.nanoTime();

        System.out.println("time = " + (end - start));
    }

    public static List<List<String>> groupAnagrams(String[] arrays) {
        /**
         * 배열로 넘어오는 문자들을 문자형 배열로 변경후 정렬하여 같은 Map에 담고 개수를 구한다.
         */
        //정렬한 단어를 담을 Map객체
        Map<String, List<String>> resultMap = new HashMap<>();

        for (String array : arrays) {
            //단어를 문자배열로 변경 후 정렬, 다시 String으로 변경
            char[] chars = array.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);

            if (!resultMap.containsKey(key)) {
                resultMap.put(key, new ArrayList<>());
            }
            resultMap.get(key).add(array);
        }

        return new ArrayList<>(resultMap.values());
    }
}
