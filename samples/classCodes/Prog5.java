package com.fpp;

public class Prog5 {

	public static void main(String[] args) {
		int[][] elementarySchoolData = new int[4][4];
		int len = elementarySchoolData.length;

		for (int i = 0; i < len; ++i) {
			for (int k = 0; k < len; ++k) {
				 elementarySchoolData[i][k] = RandomNumbers.getRandomInt(1, 99);
			}
		}

				for (int a = 0; a < len; ++a) {
			
			for (int b = 0; b < len; ++b) {

				if (a % 2 == 1 ) {

					 System.out.printf("+ %d \t ", elementarySchoolData[a][b] );
					 
					 if(b == len -1)
					 {
						 int k= 0;
						 System.out.println();
						 while( k < len)
						 {
						 //System.out.print("____\t  ____\t ____\t ____");
							 System.out.print("____\t ");
							 ++k;
						 }
						 System.out.println();
						
					 }


				} else

					System.out.printf("  %d \t ", elementarySchoolData[a][b]);
				
				
			}

			System.out.println();
			

		}

	}

}
/*
   34 	   70 	   73 	   72 	 
+ 54 	 + 39 	 + 69 	 + 71 	 
____	 ____	 ____	 ____	 

  31 	   15 	   52 	   39 	 
+ 9 	 + 63 	 + 37 	 + 44 	 
____	 ____	 ____	 ____	 


 */ 
