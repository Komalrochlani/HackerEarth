package com.string;

public class Canniable {

	public static void main(String[] args) {

		String s = "zagoiwuwwhfktqtqpmxozrtxrlwgxpmxpsnaqhwmrdxktsckfzbgqwfjhbrfqdegyrioygbpjabesdozfphxlmhvoyaecemcvw";
		System.out.println(Minimum_Operations(s.length(), s));
	}

	
	static int Minimum_Operations(int n, String s){
	    // Write your code here
	     int result = 0;
	     StringBuilder sb = new StringBuilder(s);
	     int index = 1;
	     while(n>1) {
	       char ch = sb.charAt(index);
	       int i=0;
	       boolean flag = false;
	       for(i=0;i<n;i++) {
	         if(sb.charAt(i)==ch) {
	           for(int j=n-1;j>i;j--) {
	             if(sb.charAt(j)==ch) {
	               sb.deleteCharAt(j);
	               n--;
	               flag=true;
	               break;
	             }
	           }
	           
	           sb.deleteCharAt(i);
	           n--;
	           break;
	         }
	       }
	       if(flag) {
	         result++;
	         System.out.println(sb.toString());
	       }
	     }
	     return result;
	 }

}
