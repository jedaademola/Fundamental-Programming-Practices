package com.fpp;

import java.util.Comparator;

public class PriceComparator implements Comparator<ApplePro>{

	@Override
	public int compare(ApplePro o1, ApplePro o2) {
		
		return Double.compare(o1.price, o2.price);
	}

}
