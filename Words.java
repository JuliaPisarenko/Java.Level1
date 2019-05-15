package lesson3;

import java.util.*;

public class Words {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("one", "Two", "three", "four", "one",
                "five", "two", "seven", "six", "six", "eight", "nine", "ONE", "three",
                "nine", "tWo", "four", "eighT", "Five", "one"));
        Iterator <String> iter = words.iterator();
        Map<String, Integer> words_counter = new HashMap<>();

        while (iter.hasNext()){
            String item_word = iter.next();
            String word_lowerCase = item_word.toLowerCase();
            Integer count =  words_counter.get(word_lowerCase);
            words_counter.put(word_lowerCase, count == null? 1 : count +1);
        }
        System.out.println(words_counter);
    }
}


