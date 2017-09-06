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

		/*
		 * 23 +33 36 +90 78 +61 23 +91 2 +40 91 +75 57 +53 73 +20
		 */
/*
		elementarySchoolData[0][0] = 23;
		elementarySchoolData[0][1] = 33;
		elementarySchoolData[0][2] = 36;
		elementarySchoolData[0][3] = 90;

		elementarySchoolData[1][0] = 78;
		elementarySchoolData[1][1] = 61;
		elementarySchoolData[1][2] = 23;
		elementarySchoolData[1][3] = 91;

		elementarySchoolData[2][0] = 2;
		elementarySchoolData[2][1] = 40;
		elementarySchoolData[2][2] = 91;
		elementarySchoolData[2][3] = 75;

		elementarySchoolData[3][0] = 57;
		elementarySchoolData[3][1] = 53;
		elementarySchoolData[3][2] = 73;
		elementarySchoolData[3][3] = 20;
*/
		for (int a = 0; a < len; ++a) {
			for (int b = 0; b < len; ++b) {

				if (a % 2 == 1 && a > 0) {

					 System.out.printf("+ %d \t ", elementarySchoolData[a][b] );
					
					//System.out.print("+" + elementarySchoolData[a][b] + "\t");

				} else

					System.out.printf(" %d \t", elementarySchoolData[a][b]);
				
				//  System.out.print("____");

			}

			System.out.println();
			// if (a%2 == 1 && a > 0) System.out.println( "___" + "\t");
			// System.out.println();

		}

	}

}
