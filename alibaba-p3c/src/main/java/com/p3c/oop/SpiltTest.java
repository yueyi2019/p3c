package com.p3c.oop;

public class SpiltTest {
	
	public static void main(String[] args) {
		// 预期大于3，实际是3，数组取值时，注意判断越界
//		String testStr = "a, b, c ,,";
//		String[] strArray = testStr.split(",");
//		System.out.println(strArray);
		
		// 扩展
		String line = "hello,,world,,,";
        String res1[] = line.split(",");
        String res2[] = line.split(",", -1);
        int i=1;
        for(String r: res1) {
        	System.out.println(i+++r);
        }
        
        System.out.println("========================");
        i=1;
        for(String r: res2) {
        	System.out.println(i+++r);
        }
            
	}
}
