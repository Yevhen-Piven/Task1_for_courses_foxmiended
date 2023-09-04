package ua.com.foxminded.yevhenpiven.task1;

import static org.junit.jupiter.api.Assertions.*;




import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class AnagramAppTest {
	public Anagram anagram;
	@BeforeEach
	
    void init()  { anagram = new Anagram(); }
    
    @Test 
   
    
    void testThrowExceptionOnNull()  {
    	IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> anagram.apply(null),
    	           "Text can't be null");
    	
    	assertEquals("Text can't be null", ex.getMessage());
    	
    	}
	@Test
	void testCheckEmptyString() {
		assertEquals("" ,anagram.apply(""));
	}
	@Test
	void testCheckSingleSpaceInput() {
		assertEquals("" ,anagram.apply(" "));
	}
	@Test
	void testCheckSeveralSpacesInput() {
		assertEquals("" ,anagram.apply("   "));
	}
	@Test
	void testCheckSingleCharacterInput() {
		assertEquals("a" ,anagram.apply("a"));
	}
	@Test
	void testCheckMultipleSameLetterInput() {
		assertEquals("bbbbb" ,anagram.apply("bbbbb"));
	}
	@Test
	void testCheckCharacterLower_Upper() {
		assertEquals("aaAAAAaaAaaaAAA",anagram.apply("AAAaaaAaaAAAAaa"));
	}
	@Test
	void testCheckDifferentLetters() {
		assertEquals("olleH" ,anagram.apply("Hello"));
	}
	@Test
	void testCheckOnlySymbols() {
		assertEquals("&" ,anagram.apply("&"));
	}
	@Test
	void testCheckSeveralWords() {
		assertEquals("d1cba hgf!e a1bcd efg!h" , anagram.apply("a1bcd efg!h d1cba hgf!e"));
	}

}
