class StringIsAtEvenIndex{

	public static boolean isAtEvenIndex(String str, char item){

		if(str ==null || str.isEmpty()){
			return false;
		}

		for(int i =0;i<str.length()/2 +1;i=i+2){
			if(str.charAt(i)==item){
				return true;
			}
		}
	return false;
	}	

	public static void main(String[] args){
		String str = "Hello".toLowerCase();
		System.out.println(isAtEvenIndex(str,'h'));
		System.out.println(isAtEvenIndex(str,'e'));
		System.out.println(isAtEvenIndex(str,'l'));
		System.out.println(isAtEvenIndex(str,'o'));
	}
}