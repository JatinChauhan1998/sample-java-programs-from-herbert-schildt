import java.util.*;

class Solution {
    public static void main(String args[]) {
        
    	Scanner in = new Scanner(System.in);
        
    	String hourMint=in.next();
        
    	System.out.println(toMins(hourMint));
    }
    
    private static int toMins(String s) {
    
    	String[] hourMin = s.split(":");
    
    	int hour = Integer.parseInt(hourMin[0]);
    	int mins = Integer.parseInt(hourMin[1]);
    	
    	int hoursInMins = hour * 60;
    	return hoursInMins + mins;
    }
 }