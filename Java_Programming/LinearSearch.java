class LinearSearch{

	public static void main(String[] args){
		int[] arr = {5,7,21,567,90};
		System.out.println("index of item 10 is : (if -1 not 							found)"+linearSearch(arr,10));
		System.out.println("index of item 7 is : (if -1 not 							found)"+linearSearch(arr,7));
	}
	public static int linearSearch(int[]arr, int n){
		if(arr.length == 0){
			return -1;
		}
		for(int i =0;i< arr.length;i++){

			if(n==arr[i]){
				return i;
			}
		}
		return -1;
	}
}