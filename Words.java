package lesson3;

import java.util.*;

public class Words {    
    public static void main(String[] args) {
        
        words(new ArrayList<>(Arrays.asList("one", "Two", "three", "four", "one",
                "five", "two", "seven", "six", "six", "eight", "nine", "ONE", "three",
                "nine", "tWo", "four", "eighT", "Five", "one")));

        System.out.println("\nПроверка пароля:\n");

        checkPassword("Ds1231232&@34");
        checkPassword("s1231232&@34");
        checkPassword("%S&sdfsSDF32&@34");
        checkPassword("25555)))%%%");
    }

    public static void words(List<String> words){

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

    public static boolean checkPassword(String password){

        if ( password!=null && password.length()>=8&& password.length()<=20
                && password.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[()_@#$%]).{8,}")) {
            System.out.println("Пароль действительный");
            return true;
        } else
            System.out.println("Пароль должен содержать маленькие и заглавные буквы, цыфры и спецсимволы, длина пароля от 8ми до 20ти символов");
        return false;
    }
}


