package stacks;
 
public class MyWordReverse {
 
    public String reverseWord(String word){
    	
    	//String word1 = word;
    	
    	//char[] array1 = word1.toCharArray();
         
        StringBuilder sb = new StringBuilder();
        int size = word.length();
        MyStackImpl stack = new MyStackImpl(word.length());
        for(int i=0;i<word.length();i++){
            stack.push(word.charAt(i));
        }
        while(!stack.isStackempty()==true        		){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
     
    public static void main(String args[]){
        MyWordReverse mwr = new MyWordReverse();
        
        System.out.println("Java == "+mwr.reverseWord("Java"));
       
    }
}