package com.fpp;

import java.util.Comparator;

public class NameComparator implements Comparator<ApplePro>{

	@Override
	public int compare(ApplePro o1, ApplePro o2) {
		return o1.name.compareTo(o2.name);
	}


}
