package com.pj.nullreference;

public class StaticFieldThruNullRef {
	public static final String message = "Hello world.";

	public StaticFieldThruNullRef getNUll() {
		return null;
	}

	static public void main(String args[]) {
		StaticFieldThruNullRef main = new StaticFieldThruNullRef();
		System.out.println(main.getNUll().message);
		
	}
}
