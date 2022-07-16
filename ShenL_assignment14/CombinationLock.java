/*
Shen Lorrin
May 5 2020
Assignment 14: CodeHS CombinationLock
ICS3U7-01 Ms.Strelkovska
*/
public class CombinationLock{
	private String word;
	private String guess;
	private String temp;
	
	public CombinationLock(String secretWord){
		word = secretWord;
	}
	
	public String getWord(){
		return word;
	}
	
	public String getClue(String userInput){
		guess = userInput.toLowerCase();
		String temp ="";
		for(int i = 0; i<word.length(); i++){
			if(word.charAt(i) == guess.charAt(i)){
				temp+=guess.charAt(i);
			}
			else if(word.contains(String.valueOf(guess.charAt(i)))){
				temp+="+";
			}
			else{
				temp+="*";
			}
		}
			return temp;
	}
	
	public String toString(){
		return word;
	}
}