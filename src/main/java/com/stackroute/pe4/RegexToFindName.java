package main.java.com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexToFindName {

/*This function returns true if name "harry" is present in the given String*/

    public boolean checkForHarryInTheGivenString(String inputString) {
        if(inputString.matches("(.*)Harry(.*)"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }


}
