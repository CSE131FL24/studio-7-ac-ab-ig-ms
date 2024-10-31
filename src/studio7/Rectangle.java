package studio7;

import java.util.Scanner;

public class Rectangle {
	
	private Double length;
	private Double width; 
	
	public Rectangle (double length, double width) {
		this.length = length;
		this.width = width;	
	}

public double Area (){
	double Area = length * width;
	return Area; 
	}

public double Perimeter() {
	double Perimeter = (length * 2) + (width * 2);
	return Perimeter;	
}
public boolean compare (Rectangle other) {
	if (this.Area() > other.Area()) {
		return true;
	}
	else {
		return false;
	}
}
public boolean square() {
	if (this.length == this.width) {
		return true;
	}
	else {
		return false;
	}
	
}
}


