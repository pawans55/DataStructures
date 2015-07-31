package Arrays;

public class basicarrayimplementation {
	

	
	

	public static void main(String[] args) {
		long[] arr = new long[5];
		int elem ;
		int j;
		
		//inserting elements in array
		
	arr[0] = 12;
	arr[1] = 13;
	arr[2] = 14;
	arr[3] = 15;
	arr[4] = 16;
	
	elem = 5;
	
	//display
	
	for(j=0; j< arr.length;j++){
	System.out.println(arr[j] + " ");
	}
	
	//search 15
	
	for(j=0; j< arr.length;j++){
		if(arr[j]==15){
			System.out.println("element found " + j);
			break;
		}
	}
	
	
	//delete 14
	for(j=0; j< arr.length-1;j++){
		if(arr[j]==14){
		break;
			}
	}
	for(int k =j;k< arr.length-1;k++){
		arr[k] = arr[k+1];
		elem--;
	}
	
	System.out.println(arr[3]);
	
	
	}
	
	
	
	
	
	
	}


