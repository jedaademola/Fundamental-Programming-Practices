package com.fpp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AppleProTest {

	public static void main(String[] args) {
		ArrayList<ApplePro> list = new ArrayList<>();
	
		
		ApplePro p1 = new ApplePro("Ipad","pad1",15000);
		ApplePro p2 = new ApplePro("IPhone","phone1",25000);
		ApplePro p3 = new ApplePro("IPod","pod1",4000);
		ApplePro p4 = new ApplePro("IMac","mac1",8000);
		ApplePro p5 = new ApplePro("IJob","job1",5000);
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		System.out.println("Before sorting:" + list);
		Collections.sort(list, new NameComparator());
		System.out.println("After sorting:" + list);
		
		Collections.sort(list, new PriceComparator());
		System.out.println("After sorting by Price:" + list);
		ModelComparator model = new ModelComparator();
		Collections.sort(list, model);
		System.out.println("After sorting by model:" + list);

	}
	
	static class ModelComparator implements Comparator<ApplePro>
	{

		@Override
		public int compare(ApplePro o1, ApplePro o2) {
			return o2.model.compareTo(o1.model);
		}
		
	}

}
