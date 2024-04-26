class StringReverse{
	
	public static String reverse(String str){
		
		if(str == null || str.isEmpty()){
			return str;
		}
		StringBuilder strBuilder = new StringBuilder();
		for(int i = str.length()-1;i>=0;i--){
			
			strBuilder.append(str.charAt(i));
			
		}
	return strBuilder.toString();
	}

	public static void main(String[] args){
		
		System.out.println(reverse("Hello"));
		System.out.println(reverse("SAS"));
	}
}