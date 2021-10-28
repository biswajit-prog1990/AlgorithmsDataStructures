package com.java.designpatterns.abstractfactorypattern;

interface Shape {
	void draw();
}

class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method");
	}

}

class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method");
	}

}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method");
	}

}

interface Printer {
	void print();
}

class PaperPrinter implements Printer {

	@Override
	public void print() {
		System.out.println("paper");
	}
}

class WebPrinter implements Printer {

	@Override
	public void print() {
		System.out.println("web");
	}
}

class ScreenPrinter implements Printer {

	@Override
	public void print() {
		System.out.println("screen");
	}
}

abstract class AbstractFactory {
	abstract Printer getPrinter(String type);

	abstract Shape getShape(String shape);
}

class ShapeFactory extends AbstractFactory {

	@Override
	Printer getPrinter(String type) {
		return null;
	}

	@Override
	Shape getShape(String shape) {
		if (shape == null)
			return null;
		if (shape.equalsIgnoreCase("CIRCLE"))
			return new Circle();
		else if (shape.equalsIgnoreCase("SQUARE"))
			return new Square();
		else if (shape.equalsIgnoreCase("RECTANGLE"))
			return new Rectangle();
		return null;
	}

}

class PrinterFactory extends AbstractFactory {

	@Override
	Printer getPrinter(String type) {
		if (type == null)
			return null;
		if (type.equalsIgnoreCase("PAPER"))
			return new PaperPrinter();
		else if (type.equalsIgnoreCase("WEB"))
			return new WebPrinter();
		else if (type.equalsIgnoreCase("SCREEN"))
			return new ScreenPrinter();
		return null;
	}

	@Override
	Shape getShape(String shape) {
		return null;
	}

}

class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("SHAPE"))
			return new ShapeFactory();
		else if (choice.equalsIgnoreCase("PRINTER"))
			return new PrinterFactory();
		return null;
	}
}

public class AbstractFactoryPattern {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();
		Shape shape2 = shapeFactory.getShape("SQUARE");
		shape2.draw();
		Shape shape3 = shapeFactory.getShape("RECTANGLE");
		shape3.draw();
		AbstractFactory printerFactory = FactoryProducer.getFactory("PRINTER");
		Printer printer1 = printerFactory.getPrinter("PAPER");
		printer1.print();
		Printer printer2 = printerFactory.getPrinter("WEB");
		printer2.print();
		Printer printer3 = printerFactory.getPrinter("SCREEN");
		printer3.print();
	}

}
