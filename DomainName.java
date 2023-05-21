package com.string;

public class DomainName {

	public static void main(String[] args) {
		// 3m-.com
		// hero.app.hackerearth.com

		//russia.ru
		//spain.in
		String x = "L9K8.8eMl";
		int lengthStr = x.length();
		boolean flag = false;
		if (lengthStr <= 253) {
			String[] hostNameArray = x.split("\\.");
			int hostLength = hostNameArray.length;
			if(hostNameArray[hostLength-1].length()>=2)
			{
				int lengthHost = hostNameArray[hostLength-1].length();
				for(int i=0;i<lengthHost;i++) {
					int asciiHost = hostNameArray[hostLength-1].charAt(i);
							
						if ((asciiHost >= 65 && asciiHost <= 90) || (asciiHost >= 97 && asciiHost <= 122))
						{
							flag=true;
						}else {
							flag=false;
							break;
						}
							
							
				}
				
			}else {
				flag = false;
			}
			if(flag) {
				for(int h=0;h<hostLength-1;h++) {
					
					if (hostNameArray[h].length() <= 63) {
						for (int j = 0; j < hostNameArray[h].length(); j++) {
							if (!hostNameArray[h].startsWith("-") && !hostNameArray[h].endsWith("-")) {
								int asciiV = hostNameArray[h].charAt(j);
								if ((asciiV >= 65 && asciiV <= 90) || (asciiV >= 97 && asciiV <= 122)
										|| (asciiV >= 48 && asciiV <= 57)) {
									flag = true;
								} else {
									flag = false;
									break;
								}

							} else {
								flag = false;
							}

						}
					} else {
						flag = false;
					}
				}

			}
			
			if (flag)
				System.out.println("true");
			else
				System.out.println("false");

		}

	}
}

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