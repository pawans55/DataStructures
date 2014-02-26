package stacks;

public class MyStackImpl{
	
	public int stacksize;
	public char[] stackarr;
	public int top;
	
	public MyStackImpl(int size){
		
		this.stacksize = size;
		this.stackarr = new char[stacksize];		
		top = -1;
	}
	
	
	public void push(char b){
		
		if(this.isStackFull()){
			System.out.println("Stack is full");
		}
			System.out.println("Adding: "+b);
			this.stackarr[++top] = b;
			
			
			
	
			
		
		
		
	}
	
public int pop(){
	if(this.isStackempty()){
		System.out.println("Stack is empty");
	}
	
		char c = this.stackarr[top];
		top--;
		System.out.println("Remove entry" + c);
		
			
	return c;
		
	}

public int peek(){ 
	
	int temp = stackarr[top];
	System.out.println("peeked value  " + temp);
	return stackarr[top];	
	
}

public boolean isStackempty(){
	
	return(top == -1);
	
}

public boolean isStackFull(){
	
	return(top == stacksize -1);
	
}

/*
public static void main(String[] args){
	
	MyStackImpl mystack = new MyStackImpl(3);
	
	mystack.push(3);
	mystack.push(4);
	mystack.push(3);

	mystack.pop();
	mystack.pop();
}
	*/
	
}