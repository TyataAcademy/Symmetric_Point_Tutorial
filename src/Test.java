
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "carsrac";
		System.out.println("Input String = "+s);
		Test t = new Test();		
		System.out.println("Symmetric Piont : "+t.symmetryPoint(s));
	}
	
	public int symmetryPoint(String s){
		//returns the symmetry point in string S about which the substring before the point is 
		//the reverse of that after the point; returns -1 if there is no such point"""
		if(s==null){
			return 0;
		}               
		else if(s.length()%2 != 0){
			int pivot = s.length()/2;
			if(isReverse(s.substring(0,pivot), s.substring(pivot+1))){
				return pivot;	    						
			}
		}
		return -1;	
	}
	
	public boolean isReverse(String left_str,String right_str){
		//returns true if left_str is reverse of right_str
		if(left_str==null && right_str==null)
			return true;
		else{
			int len_substr = left_str.length();
			for(int index= 0;index<len_substr;index++){
				if(left_str.charAt(index)!=right_str.charAt(len_substr-1-index)){
					return false;
				}					
			}//end of for
			return true;
		}
	}//end of isReverse method
	
}


//public class Test{
//	public static void main(String[] args){
//		System.out.println("hello world");
//	}
//}