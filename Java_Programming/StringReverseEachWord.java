class StringReverseEachWord{
	
	public static String reverseWord(String str){
		
		String[] stringArray = str.split(" ");
		StringBuilder strBuilder = new StringBuilder();

	for(int i =0;i<stringArray.length;i++){
		strBuilder.append(reverse(stringArray[i])+" ");
		
	}
	return (strBuilder.toString()).trim();
	
	}
	public static String reverse(String s){
		if(s ==null || s.isEmpty()){
			return s;
		}
		return new StringBuilder(s).reverse().toString();
	}
	
	public static void main(String[] args){

		System.out.println(reverseWord("sally is a great worker"));
	
	}

}