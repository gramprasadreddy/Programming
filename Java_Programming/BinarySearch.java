import java.util.Arrays;
class BinarySearch{


	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(binarySearch(arr,8));
		System.out.println(binarySearchUsingRecursion(arr, 0, arr.length-1, 8));
		Arrays.stream(arr).filter(x-> x == 8).findFirst().ifPresent(System.out::println);

	}

	public static int binarySearch(int[] arr,int item){
		int low = 0;
		int high = arr.length-1;
	
		while(low<=high){
			int mid = (low+high)/2;
			if(item == arr[mid]){
			return mid;
			}
			else if(item < arr[mid]){
				high = mid-1;
			
				
			}
			else{
				low =mid+1;
			
			}
		}
	return -1;
		
	}

	public static int binarySearchUsingRecursion(int[] arr, int low , int high, int item){

	if(low > high){
		return -1;
	}
	int mid = low + (high - low)/2;
	if(item == arr[mid]){
		return mid;
	}
	else if(item > arr[mid]){
		low = mid+1;
		return binarySearchUsingRecursion(arr, low, high, item);
	}else{
		high = mid-1;
		return binarySearchUsingRecursion(arr, low, high, item);
	}
		
	
	}


}