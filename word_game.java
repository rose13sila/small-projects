package project;
import java.util.Scanner;
import java.util.Random;
public class word_game {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		String[] words = { "voleybol" };
		Random random = new Random(System.currentTimeMillis());
		int indeks = random.nextInt(words.length);
		
		String selectedWord = words[indeks];
		
		char[] secretWord = new char [selectedWord.length()];
		for (int i = 0; i < selectedWord.length(); i++) {
			secretWord[i] = '_';
		}
		int chance = 5;
		boolean gameContinue = true;
		while (gameContinue && chance > 0 ) {
		  for (int i = 0; i  < secretWord.length; i++) {
				 System.out.print(secretWord[i] + "");
			 }
		  System.out.println("");
		  System.out.println("Enter a letter");
		  char guess = input.next().charAt(0);
		  boolean correctGuess = false;
		  for(int i = 0; i < selectedWord.length(); i++) {
			  if(selectedWord.charAt(i) == guess) {
				  secretWord[i] = guess;
				  correctGuess = true;
			  }
		  }
		  if(!correctGuess) {
			  chance--;
			  System.out.println("Wrong guess! Remaining:" + chance );
		  }
		  boolean won = true;
		  for(int i = 0; i< selectedWord.length(); i++) {
			  if(secretWord[i] =='_') {
				  won = false;
				  break;
			  }
		  }
		  if(won) {
			  System.out.println("Congralutions! You guessed the word:" + selectedWord);
			  gameContinue = false;
		  }
		  if(chance ==0) {
			  System.out.println("Gameover! the word was " + selectedWord);
		  }
			  		
				  
			  
			  
				  
			  }
			     
			     
			     
			     
			     
			     
			     
			     
			 }
			 
	}
