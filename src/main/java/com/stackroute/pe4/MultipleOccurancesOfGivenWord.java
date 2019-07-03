package main.java.com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurancesOfGivenWord {

    /*This function is used to find multiple occurances of a given word in a Sentence*/

    public static String findMultipleOccorancesOfGivenWord(String sentence,String word)
    {
        if(sentence == null || word == null || sentence == "" || word == ""){
            return "Please enter valid sentence and word.It should not be empty and null";
        }
        String result = "";
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(sentence);
        while(matcher.find()) {

            result = result + "Found at:"+ matcher.start() + " - " + matcher.end() + " ";
        }

        return result.trim();

    }
}
