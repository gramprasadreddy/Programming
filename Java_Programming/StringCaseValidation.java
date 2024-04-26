// code to check if the given string contains all UpperCase or all LowerCase

class StringCaseValidation{

public static boolean isUpperCase(String str){
	return	str.chars().allMatch(Character::isUpperCase);
}

public static boolean isLowerCase(String str){
	return str.chars().allMatch(Character::isLowerCase);
}
public static void main(String[] args){
	System.out.println(isUpperCase("HELLO"));
	System.out.println(isUpperCase("hello"));
	System.out.println(isLowerCase("HELLO"));
	System.out.println(isLowerCase("hello"));
}


}