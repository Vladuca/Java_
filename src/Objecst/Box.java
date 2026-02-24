package Objecst;

import java.lang.runtime.SwitchBootstraps;
import java.nio.file.attribute.AclEntry;

public class Box {
	private double length;
	private double width;
	private double height;

	public Box(double length, double width, double height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	
	public double getVolume() {
		return length * width * height;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Box [length=" + length + ", width=" + width + ", height=" + height + "]";
	}

}

/*
 * В классе Box создать метод, который принимает в качестве параметра объект
 * box, и возвращает новую коробку, у которой все размеры равны: размеры
 * вызывающего объекта + размеры переданого объекта.
 * 
 * Создать конструктор, который принимает 2 коробки. С помощью этого
 * конструктора можно будет создать объект, который по объему больше, чем 2
 * переданные коробки вместе взятые
 * 
 * Продемонстрировать работу метода и конструктора в классе Main в методе
 * main();
 * 
 */

/*
 * Установить у всех конструкторов, полей и методов класса Box правильные
 * модификаторы доступа, если необходимо создайте геттеры и сеттеры.
 */