package ua.com.foxminded.yevhenpiven.task1;

public class Anagram {
	public  String apply(String text) {
		if (text == null) {
			  throw  new IllegalArgumentException("Text can't be null");
			}
			String words[] = text.split(" ");
		
		String reverseWords []=new String[words.length];
		int i=0;
		for (String word : words) {
			reverseWords [i]=reverse(word);
			i++;
			
					}
				return String.join(" ", reverseWords);
			}

	private  String reverse(String word) {
		char chars[] = word.toCharArray();
		for (int i = 0, j = chars.length - 1; i < j;) {
			if (!Character.isAlphabetic(chars[i]))
				i++;
			else if (!Character.isAlphabetic(chars[j]))
				j--;
			else {
				char current = chars[i];
				chars[i] = chars[j];
				chars[j] = current;
				i++;
				j--;
			}
		}

		String reverseWords = new String(chars);
				return reverseWords;
	}

}
