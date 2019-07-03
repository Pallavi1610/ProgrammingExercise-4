package main.java.com.stackroute.pe4;

import java.util.Arrays;

public class Transpose {
    /*This function returns the transpose of the given String*/

    public static String getTransposeOfaString(String sentence)
    {
        String words[]=sentence.split("\\s");
        String reverseWords="";
        for(String i:words)
        {
            //declaration and initialization
            StringBuilder stringBuilder=new StringBuilder(i);
            reverseWords+= stringBuilder.reverse()+" ";
        }
        return reverseWords.trim();
    }
}
