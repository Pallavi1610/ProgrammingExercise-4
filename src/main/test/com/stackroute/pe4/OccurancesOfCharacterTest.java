package main.test.com.stackroute.pe4;

import main.java.com.stackroute.pe4.OccurancesOfCharacter;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccurancesOfCharacterTest {
OccurancesOfCharacter object;
    @org.junit.Before
    public void setUp() throws Exception {
        object=new OccurancesOfCharacter();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        object=null;
    }
    @Test
    public void givenASentenceShouldReturnNumberOfOccurancesofACharacter()
    {
        int result=object.checkOccurancesOfGivenCharacter("Java is java again java again",'a');
        assertEquals(10,result);
    }
    @Test
    public void givenASentenceShouldReturnZeroIfCharacterIsNotPresent()
    {
        int result=object.checkOccurancesOfGivenCharacter("Java is java again java again",'z');
        assertEquals(0,result);
    }
    @Test
    public void givennullstringShouldReturnZero()
    {
        int result=object.checkOccurancesOfGivenCharacter("",'z');
        assertEquals(0,result);
    }
    @Test
    public void givenASentenceShouldReturnZeroIfCharacterIsNull()
    {
        int result=object.checkOccurancesOfGivenCharacter("Java is java again java again",'\0');
        assertEquals(0,result);
    }


}