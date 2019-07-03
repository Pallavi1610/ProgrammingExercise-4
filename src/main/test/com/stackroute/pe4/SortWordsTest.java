package main.test.com.stackroute.pe4;

import main.java.com.stackroute.pe4.SortWords;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SortWordsTest {
    SortWords object;

    @Before
    public void setUp() throws Exception {
        object=new SortWords();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }
    @Test
    public void givenASentenceShouldReturnASentenceWithSortedWords()
    {
        List<String> result=object.sortTheWordsInAString("the eagle");
        List<String> expected= Arrays.asList("eagle","the");

        assertEquals(expected,result);
    }
    @Test
    public void givenIntegerStringsReturnsSortedIntegerStrings() {
        List<String> actualResult = object.sortTheWordsInAString("23 0 45 73");
        List<String> expectedResult = Arrays.asList("0", "23", "45", "73");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenNullReturnNullString() {
        List<String> actualResult = object.sortTheWordsInAString("");
        List<String> expectedResult = Arrays.asList("");
        assertEquals(expectedResult, actualResult);
    }
}