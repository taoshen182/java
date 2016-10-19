package com.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compare {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
		//lambda表示方式1
		Collections.sort(names, (String a, String b) -> {
		    return b.compareTo(a);
		});
		//lambda表示方式2
		Collections.sort(names, (String c, String d) -> c.compareTo(d));
		
		//lambda表示方式3
		Collections.sort(names, (m, n) -> m.compareTo(n));
		
		//传统表达
		Collections.sort(names, new Comparator<String>() {
		    @Override
		    public int compare(String q, String w) {
		        return q.compareTo(w);
		    }
		});

		
		
		
		
	}
	
	public void ptA(){
		System.out.println("asas");
	}

}
