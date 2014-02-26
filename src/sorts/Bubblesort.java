package sorts;

public class Bubblesort {
	
	public static void bubble_srt(int array[]){
		int n = array.length;
		int k;
		
		for(int m = n; m >= 0; m--){
			for (int i = 0; i< n-1;i++ ){
				k = i + 1;
				if(array[i] > array[k]){
					swapnumbers(i,k,array);
					
				}else{
					
				}
			}
					
			printnumbers(array);
		}
	}
	
	
	private static void swapnumbers(int i , int j , int[] array){
		
		int temp;
		temp = array[i];
		array[i] = array[j];
		array[j]= temp;	
		
	}
	
	private static void printnumbers(int[] input){
		for(int i = 0 ; i<input.length; i++ ){
			System.out.println(input[i] + ",");
		}
		System.out.println("\n");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {5,3,4,7,11,17,10,14,12};
		bubble_srt(input);
		
		

	}

}
