import java.lang.*;

class Test{
	

public static void Count(String sentence){
	int vowels = 0;
	int con = 0;
	char[] str = sentence.toCharArray();
	for (int i=0; i<str.length; i++){
		if(str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u' || str[i] == 'A' || str[i] == 'E' || str[i] == 'I' || str[i] == 'O' || str[i] == 'U'){
			
			vowels++;
		}
		else{
			if(str[i] != ' '){
				con++;
			}
		}
	}
	System.out.println("Number of Vowels: " + vowels + ", Number of Consonants: " + con);
	
}

public static void main(String[] args){
	String sentence = "hello welcome to java world";
	StringBuffer s = new StringBuffer(sentence);
	s.reverse();

	System.out.println("The reverse of the sentence entered is: " + s);
	Count(sentence); 
	}

}