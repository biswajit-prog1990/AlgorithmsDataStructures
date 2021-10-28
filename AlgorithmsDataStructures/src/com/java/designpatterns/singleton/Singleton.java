package com.java.designpatterns.singleton;

class SingletonMain {
	private static SingletonMain instance = null;

	private SingletonMain() {
	}

	public static SingletonMain getInstance() {
		if (instance == null)
			instance = new SingletonMain();
		return instance;
	}

	void showMessage() {
		System.out.println("Singleton invoked");
	}
}

public class Singleton {

	public static void main(String[] args) {
		SingletonMain instance = SingletonMain.getInstance();
		instance.showMessage();
	}
}
