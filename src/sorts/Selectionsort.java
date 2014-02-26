package sorts;

public class Selectionsort {
	
	public static int[] selections_sort( int [ ] num ){

	int i,j,first, temp;
	
	 for (i = num.length-1;i>0;i--){
		 first = 0;
		 for( j = 1 ;j<=i;j++){
			 
			 if(num[j]<num[first])
				 first = j;
		 }
		 temp = num[first];
		 num[first] = num[i];
         num[ i ] = temp; 
		 
	 }
	 
	 return num;
	 
	 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input1 = {5,3,4,7,11,17,10,14,12};
		int[] input2 = selections_sort(input1);
		
		for(int i:input2){
            System.out.print(i);
            System.out.print(", ");
        }

	}

}
