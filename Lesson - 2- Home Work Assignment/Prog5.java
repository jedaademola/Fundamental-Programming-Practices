package fpp;

public class Prog5 {

	public static void main(String[] args) {
		int[][] elementarySchoolData = new int[4][4]; 
		int len = elementarySchoolData.length;
		
		for(int i=0;i<len;++i)
		{
			for(int k = 0;k<len; ++k)
			{
				elementarySchoolData[i][k] = RandomNumbers.getRandomInt(1, 99);
			}
		}
		
		String stop= "";
		String stop2 = stop;
		String stop3 = stop2;
	}

}
