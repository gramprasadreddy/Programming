class StringNormalisationAndSearch{

	public static void normaliseString(String str){
		String strOuput = str.toLowerCase();
		strOuput = strOuput.trim();
		strOuput = strOuput.replace(",","");
		System.out.println(strOuput);

	
	}
	
	public static void main(String[]args){
		normaliseString("Hello, World");

		// find out "LL" is present in string

		String str = "heLLo";

		System.out.println(str.contains("LL"));
	}	
}