package Objecst;

public class Rect {
double width;
double length;

void setDimes(double width, double length) {
	this.width = width;
	this.length = length;}
	
double perimeter() {
	return 2*(width+length);
	
}

double squar() {
	return width*length;
}
}
