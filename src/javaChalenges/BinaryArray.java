package javaChalenges;

public class BinaryArray {
	/*
	Given an array of binary integers, find the maximum consecutive 1's in the array.

	[1,1,1,1,0,1,1,1,0,1,0,1,1,1,1,1]
	*/ 

	/*
	 * Click `Run` to execute the snippet below!
	 */

	  public static void main(String[] args) {
	    
	    //Solution solution = new Solution();
	    
	    int[] arr = {1,1,1,1,1,1,1,0,1,1,1,0,1,0,1,1,1,1,1,1,1,1,1};
	    int count =0;
	    int max=0;
	    
	    for(int i = 0; i < arr.length; i++){
	      if(arr[i] == 1)
	        count++;
	      else {
	    	 max = Math.max(max, count);
	         count = 0;
	      }   
	    }
	    System.out.println(count);
	    
	      System.out.println(max);
	    
	  
	  }

}
