package com.jd.day1;

public class NameOm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstname = "Prakash";
		String lastname = "singh";
		System.out.println(firstname + " " + lastname);
		System.out.println(firstname.concat(" ").concat(lastname));
		System.out.println(firstname.length());
		System.out.println(firstname.charAt(3));
		System.out.println(firstname.toUpperCase());
		System.out.println(firstname.toLowerCase());
		String name1 = "Prakash";
		String name2 = "Singh";
		System.out.println(name1.equals (name2));
		System.out.println(firstname.replace('s', 'Z'));
		String name = "i love mumbai";
		System.out.println(name.substring(2, 6));
		System.out.println(name.split(" ") [2]);
	}

}
