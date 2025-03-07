package Savarjisho1;

import java.util.ArrayList;

public class Savarjisho1 {
    public static void main(String[] args) {
        String[] Array = {"apple", "bee", "apple", "cream", "apple", "bear"};
        ArrayList<String> List = new ArrayList<>();
        int count = 0;

        for (String text : Array) {
            if (!List.contains(text)) {
                List.add(text);
                count++;
            }
        }

        System.out.println(count);
    }
}
