package main.java.com.stackroute.pe4;

public class OccurancesOfCharacter {

/*This function returns the count of occurances of specific character in the given String*/
    public static int  checkOccurancesOfGivenCharacter(String sentence,char character)
    {

       int countOfOccurances=0;
        //replace the char with empty string

        String replacedString = sentence.replace(""+character,"");

        //calculates the difference between length of original string replaced string

        countOfOccurances= sentence.length() - replacedString.length();
       return countOfOccurances;
    }
}
