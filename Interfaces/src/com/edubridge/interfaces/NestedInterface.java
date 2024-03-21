package com.edubridge.interfaces;

public class NestedInterface implements Books,Books.storyBooks {

	public static void main(String[] args) {
		NestedInterface n=new NestedInterface();
		n.showBooks();
		n.showstoryBooks();
		
	}

	@Override
	public void showstoryBooks() {
		System.out.println("Java Program");
		
	}

	@Override
	public void showBooks() {
		System.out.println("I Am a Student"+"Pooja Naidu");
		
	}

}
