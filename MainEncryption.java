import java.util.Scanner;

public class MainEncryption {

	public static void main(String[] args) {

		encryption();

	}

	public static void encryption() {
		Scanner sc = new Scanner(System.in);
		boolean playAgain = true;

		do{
		System.out.println("Enter message to be encrypted");
		String words = sc.nextLine();

		String[] arrayOfInput = words.split("\\s");

		for (int i = 0; i < arrayOfInput.length; i++) {
			cipher(arrayOfInput[i]);
			
		}
		System.out.println();
		}while(playAgain);
	}

	public static void cipher(String wordsToCipher) {

		StringBuilder word = new StringBuilder(wordsToCipher);

		for (int i = 0; i < word.length(); i++) {

			switchStatement(word.charAt(i));
		}

	}

	public static void switchStatement(char letters) {
		boolean playAgain = true;
		
		
		if (badSymbols(letters)){
			System.out.println("Invalid input. Please try again.");
			encryption();
		}else{
	
		switch (Character.toLowerCase(letters)) {

		case 'a':
			System.out.print(" ");
			break;
		case 'b':
			System.out.print("4");
			break;
		case 'c':
			System.out.print("porcupine");
			break;
		case 'd':
			System.out.print("r");
			break;
		case 'e':
			System.out.print("puddin");
			break;
		case 'f':
			System.out.print("[]");
			break;
		case 'g':
			System.out.print("k");
			break;
		case 'h':
			System.out.print("W");
			break;
		case 'i':
			System.out.print("^");
			break;
		case 'j':
			System.out.print("9302");
			break;
		case 'k':
			System.out.print("j");
			break;
		case 'l':
			System.out.print("C");
			break;
		case 'm':
			System.out.print("ERIN");
			break;
		case 'n':
			System.out.print(")");
			break;
		case 'o':
			System.out.print("USA");
			break;
		case 'p':
			System.out.print("\\\\\\\\\\\\\\");
			break;
		case 'q':
			System.out.print("&");
			break;
		case 'r':
			System.out.print("HELLOWORLD");
			break;
		case 's':
			System.out.print("yellow");
			break;
		case 't':
			System.out.print("Shawshank Redemption");
			break;
		case 'u':
			System.out.print("!!!!");
			break;
		case 'v':
			System.out.print("Forrest");
			break;
		case 'w':
			System.out.print("%");
			break;
		case 'x':
			System.out.print("m");
			break;
		case 'y':
			System.out.print("qu");
			break;
		case 'z':
			System.out.print(";(");
			break;
		case ' ':
			System.out.print(" ");
			break;
		case '0':
			System.out.print("%");
			break;
		case '1':
			System.out.print("FIZZBUZZBANG");
			break;
		case '2':
			System.out.print("Did this work?");
			break;
		case '3':
			System.out.print("!");
			break;
		case '4':
			System.out.print("B82res");
			break;
		case '5':
			System.out.print("*/+-");
			break;
		case '6':
			System.out.print("cumberbund");
			break;
		case '7':
			System.out.print("8");
			break;
		case '8':
			System.out.print("crispy");
			break;
		case '9':
			System.out.print("magic");
			break;
			}
		}
		
	}

	public static boolean badSymbols(char lookingForBadSymbols) {

		boolean isSymbol = true;

		if (lookingForBadSymbols == 'a' || lookingForBadSymbols == 'b' || lookingForBadSymbols == 'c' || lookingForBadSymbols == 'd'
				|| lookingForBadSymbols == 'e' || lookingForBadSymbols == 'f' || lookingForBadSymbols == 'g' || lookingForBadSymbols == 'h' || lookingForBadSymbols == 'i' || lookingForBadSymbols == 'j'
				|| lookingForBadSymbols == 'k' || lookingForBadSymbols == 'l' || lookingForBadSymbols == 'm' || lookingForBadSymbols == 'n' || lookingForBadSymbols == 'o' || lookingForBadSymbols == 'p' 
				|| lookingForBadSymbols == 'q' || lookingForBadSymbols == 'r' || lookingForBadSymbols == 's' || lookingForBadSymbols == 't' || lookingForBadSymbols == 'u' || lookingForBadSymbols == 'v'
				|| lookingForBadSymbols == 'w' || lookingForBadSymbols == 'x' || lookingForBadSymbols == 'y' || lookingForBadSymbols == 'z' || lookingForBadSymbols == '0' || lookingForBadSymbols == '1' 
				|| lookingForBadSymbols == '2' || lookingForBadSymbols == '3' || lookingForBadSymbols == '4' || lookingForBadSymbols == '5' || lookingForBadSymbols == '6' || lookingForBadSymbols == '7' 
				|| lookingForBadSymbols == '8' || lookingForBadSymbols == '9' || lookingForBadSymbols == 'A' || lookingForBadSymbols == 'B' || lookingForBadSymbols == 'C' || lookingForBadSymbols == 'D'
				|| lookingForBadSymbols == 'E' || lookingForBadSymbols == 'F' || lookingForBadSymbols == 'G' || lookingForBadSymbols == 'H' || lookingForBadSymbols == 'I' || lookingForBadSymbols == 'J'
				|| lookingForBadSymbols == 'K' || lookingForBadSymbols == 'L' || lookingForBadSymbols == 'M' || lookingForBadSymbols == 'N' || lookingForBadSymbols == 'O' || lookingForBadSymbols == 'P'
				|| lookingForBadSymbols == 'Q' || lookingForBadSymbols == 'R' || lookingForBadSymbols == 'S' || lookingForBadSymbols == 'T' || lookingForBadSymbols == 'U' || lookingForBadSymbols == 'V'
				|| lookingForBadSymbols == 'W' || lookingForBadSymbols == 'X' || lookingForBadSymbols == 'Y' || lookingForBadSymbols == 'Z') {
			isSymbol = false;
		}

		return isSymbol;
	}
}
