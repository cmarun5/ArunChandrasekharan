package week3.day2.assignment;
public class ReverseEvenWord2{
	public static void main(String[] args) {
		String sentence = "i am a software tester";
		String[] words = sentence.split(" ");

		for (int i = 0; i < words.length; i++) {
			if (i % 2 != 0) { 
				String evenWord = words[i];
				String reverseWord = "";
				for (int j = evenWord.length()-1; j>=0; j--) {
					reverseWord+=evenWord.charAt(j);
				}    
				words[i] = reverseWord;
			}
		}
		String reversedSentence =String.join(" ", words);
		System.out.println(reversedSentence);
	}

}