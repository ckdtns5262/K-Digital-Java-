package com.ruby.java.test1;

public class Gugudan {
	
	public void printGugudan (int col) {
		
		if(col<1|9 <=col) {
			System.out.println("col is not valid!");
			return;
		}
		
		for(int i=2; i<=9; i+=col) {
			for(int j=1; j<=9; j++) {
				for(int k=0; k<col; k++) {
					
					if(i+k>=10) {
						System.out.print("\n");
						break;	
					}
						System.out.printf("%d*%d=%d", (i+k),j,(i+k)*j);
						
						if(k<col-1) 
							System.out.print("\t");
						else
							System.out.print("\n");
				}
			}
			System.out.println();
		}
	}





}