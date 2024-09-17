import java.util.Scanner;

public class count {

	String local = "";
	String str = "";
	int chars = 0;
	int vow = 0;
    int digits = 0;

	public static void main(String[] args){
		count c = new count();
		c.countAndPrint();
	}  

	public int getChars(){
		return chars;
	}
	public int getVowels(){
		return vow;
	}
	public int getDigits(){
		return digits;
	}

	public String getInput(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a string: ");

		str = scanner.nextLine();

		scanner.close();
		return str;
	}

	public void counting(String strn) {

		if (strn == null) {
			throw new NullPointerException("Provided string is null.");
		}
		local = strn.toLowerCase();
		chars = local.length();
	
		char [] vowels = new char [] {'a', 'o', 'e', 'i', 'u', 'y'};
		for (int i = 0; i < local.length(); i++){
			for (char v: vowels){
				if (local.charAt(i) == v){
					vow++;
					break;
				}
			}
	
			if (Character.isDigit(local.charAt(i))) digits++;
		}
	
		System.out.printf("The string contains %d characters overall, including %d vowels and %d digits.", chars, vow, digits);
	}

	public void countAndPrint(){
		String Str = getInput();
		counting(Str);
	}
	
	}