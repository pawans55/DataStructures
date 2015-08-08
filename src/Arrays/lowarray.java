package Arrays;

public class lowarray {
	
	int[] a;
	
	lowarray(int size){
		a = new int[size];
	}
	
	public void setelemement(int index, int value){
		
		a[index] = value;
				
	}

	public int getelement(int index) {
		return a[index];
	}
	

}


