package javachallenge;

public class WordCount {

	public static void main(String[] args) {
		String word="   fly me   to   the moon  ";
		String[] splitword=word.split(" ");
		System.out.println("the word is : "+word);
		for (int i=0; i<splitword.length;i++)
		{
			System.out.println(i+" "+splitword[i]);
		}
		System.out.println("the count of last word is : "+splitword[11].length());
	}

}
