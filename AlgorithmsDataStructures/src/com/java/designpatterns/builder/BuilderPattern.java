package com.java.designpatterns.builder;

class Menu {

}

class Toolbar {

}

class MainWindow {
	Menu menu;
	Toolbar toolbar;

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public Toolbar getToolbar() {
		return toolbar;
	}

	public void setToolbar(Toolbar toolbar) {
		this.toolbar = toolbar;
	}
}

class WindowBuilder {
	public static MainWindow createWindow() {
		MainWindow mainWindow = new MainWindow();
		Menu menu = new Menu();
		Toolbar toolbar = new Toolbar();
		mainWindow.setMenu(menu);
		mainWindow.setToolbar(toolbar);
		return mainWindow;
	}
}

public class BuilderPattern {

	public static void main(String[] args) {
		MainWindow object = WindowBuilder.createWindow();
	}

}
