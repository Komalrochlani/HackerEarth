package com.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DomainName2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 3m-.com
		// hero.app.hackerearth.com

		//russia.ru
		//spain.in
		String x = "App.Hackerearth.com";
		int lengthStr = x.length();
		//boolean flag = false;
					
		 String result = "true";

		 	
		 //String regex1 = "^(?!-){\\w.}{1,63}(?<!-)\\.+[A-Za-z]{2,}+$";
			String regex = "^((?!-)[\\w.]{1,63}(?<!-)\\.)+[A-Za-z]{2,}+$";
			Pattern pattern = Pattern.compile(regex);
			Matcher match = pattern.matcher(x);
			boolean matchResult = match.find();
			if(matchResult)
			{
				System.out.println("true");
			}
				
			else 
			{
				System.out.println("false");

			}
//				return result;
				
		}
}
		
	 
//		if(x == null)
//		{
//			System.out.println("false");
//		}
//		Matcher m = p.matcher(x);
//		if(m.matches())
//			System.out.println("true");
//		else
//			System.out.println("false");
//	}
//}

//		String hostName = x.substring(index);
//		lengthS = hostName.length();
//		for(int i=index;i<=lengthS;i++) 
//		{			
//			index = hostName.indexOf(".");	
//			label = hostName.substring(i, index);
//			lengthS = label.length();
//			
//			if(lengthS<=63)
//			{
//				
//				for(int j=0;j<lengthS;j++)
//				{
//					if(!label.startsWith("-") && !label.endsWith("-"))
//					{
//						int asciiV = label.charAt(j);
//						if((asciiV>65 && asciiV<90) || (asciiV>97 && asciiV<122) ||(asciiV >=48 &&asciiV<=57))
//						{
//							flag=true;
//						}else {
//							flag=false;
//						}
//						
//					}else {
//						flag=false;
//					}
//						
//				}
//			}else {
//				flag=false;
//			}
//			
//		}
//	
//	
//		}else
//		{
//			flag=false;
//		}
//			if(flag)
//				System.out.println("true");
//			else
//				System.out.println("false");
//

//String[] label =x.split(".");