package Savarjisho1;

import java.util.Arrays;
import java.util.TreeMap;

public class Savarjisho1 {
    public static void main(String[] args) {
        String text = "hofgnbfi ubnockxuibwhoifj aiyvboujzahbfdiiuoanf yivubaiebwuowfiano";
        text = text.replace(",", "").replace(".", "").replace(" ", "").toLowerCase();

        TreeMap<Character, Integer> characterAmount = new TreeMap<>();

        char[] SortedTextCharacters = text.toCharArray();
        Arrays.sort(SortedTextCharacters);

        for (char character : SortedTextCharacters){
            characterAmount.put(character, characterAmount.getOrDefault(character, 0) + 1);
        }

        System.out.println(characterAmount);
    }
}
