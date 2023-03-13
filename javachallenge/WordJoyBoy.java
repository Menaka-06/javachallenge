package javachallenge;

public class WordJoyBoy {
	public static void main(String[] args) {
		String word= "luffy is still joyboy";
		String[] wordsplit=word.split(" ");
		System.out.println("the word is: "+word);
		for (int i=0; i<wordsplit.length; i++)
		{
			System.out.println(wordsplit[i]);
		}
		System.out.println("the fourth word count is "+wordsplit[3].length());
	}


}
