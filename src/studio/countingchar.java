package studio;

import java.util.HashMap;
import java.util.Map;

public class countingchar {
    public static void main(String[] args) {
        String myString = "The quick brown fox jumped over the lazy brown dog.";
        char[] charactersInString = myString.toCharArray();
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char ch = charactersInString){
        if (charCount.containsKey(ch)){
            int num = charCount.get(ch)+1;
            charCount.put(ch,num);
        } else {
            charCount.put(ch,1);
        }

        }
        for (Map.Entry<Character, Integer> c : charCount.entrySet()) {
            System.out.println(c.getKey() + ": " + c.getValue());
        }


    }
}
