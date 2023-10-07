package com.caller.main;

import com.backslash.noop.Noop;

public class Main {
    static public void main(String[] args) {
	System.out.println("Hi there ");

	Noop x = null;
	System.out.println(x);
	x = new Noop();
	String s = Noop.noop();
	System.out.println("caller: received '" + s + "' from noop");
    }
}
