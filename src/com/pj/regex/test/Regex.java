package com.pj.regex.test;

public class Regex {

	public String reg="^[a-zA-Z0-9\\s]+$";
	public String regCase="aBc 12xYz";
	
	public void check(){
		System.out.println(regCase.matches(reg));
	}
	
	static public void main(String args[]){
		Regex regex = new Regex();
		regex.check();
	}
}
