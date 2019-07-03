package main.java.com.stackroute.pe4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortWords {
/*This funnction sorts the words based on alphabetical order in the given sentence*/
    public List<String> sortTheWordsInAString(String sentence)
    {

        String lowerCaseString=sentence.toLowerCase();
        //Extract the words from the given sentence
       List<String> words = Arrays.asList(lowerCaseString.split(" "));
        Collections.sort(words);
        System.out.println(words);

      return words;

    }
}
