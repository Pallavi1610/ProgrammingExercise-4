package main.java.com.stackroute.pe4;

public class ReplaceACharacter {

    /*This function is used to replace all d with f and all l with t in the given String*/

    public static String replaceCharacterWithOtherCharacter(String sentence)
    {
      sentence=sentence.replace('d','f');
      sentence=sentence.replace('l','t');
      return sentence;
    }
}
