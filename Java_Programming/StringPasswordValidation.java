
// codde checks if the given string has one Upper and one lower case and one digit

class StringPasswordValidation{

	public static boolean isPasswordValid(String str){
		return str.chars().anyMatch(Character::isUpperCase) &&
				str.chars().anyMatch(Character::isLowerCase) && str.chars().anyMatch(Character::isDigit);

	}	
	public static void main(String[] args){
		System.out.println(isPasswordValid("Hell0"));
		System.out.println(isPasswordValid("HEllo"));
	
	}
}