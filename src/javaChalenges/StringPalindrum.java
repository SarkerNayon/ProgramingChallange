package javaChalenges;

public class StringPalindrum {

	public static void main(String[] args) {
		String aString= "AYAK";
		String tem=aString;
	    String actual="";
	int len	=aString.length();
	// System.out.println(len);
	
	for(int i=len-1;i>=0;i--) {
		 actual=actual+aString.charAt(i);
	}
       if(actual.equals(tem)) {
    	   System.out.println(actual+" is palindrome");
       }else {
    	   System.out.println(actual+" is not palindrome"); 
       }
	}

}
