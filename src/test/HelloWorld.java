package test;

import java.util.ArrayList;

public class HelloWorld {

	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		String s = "De locos es muy poco";
		String locurita = "Dab bois";
		ArrayList<String> ls = new ArrayList<>();
		ls.add(s);
		ls.add(locurita);
		
		System.out.println(ls);
	}

}
