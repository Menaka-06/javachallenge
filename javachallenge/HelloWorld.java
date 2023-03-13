package javachallenge;

public class HelloWorld {

	public static void main(String[] args) {
		String word= "Hello World";
		String[] wordsplit=word.split(" ", 0);
		System.out.println("the word is : "+word);
		for (int i=0; i<wordsplit.length; i++)
		{
			System.out.println(wordsplit[i]);
		}
		System.out.println("the second word count is : "+wordsplit[1].length());
	}

}
