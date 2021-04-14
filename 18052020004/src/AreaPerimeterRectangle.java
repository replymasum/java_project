import java.util.Scanner;
public class AreaPerimeterRectangle {
	
public static void main(String[] args) {

	class Square {

	private double side;

	Square() {    
	this.side = 0;
	}

    public Square(double side) { 
		if (side < 0)
	   this.side = 0;
    else
	this.side = side;
	}

   public void setSide(double side) {
	if (side < 0)
	this.side = 0;
	else
	this.side = side;
}

    public double getSide() {
	return this.side;
}

    public double calculateArea() {
		return this.side * this.side;
		}

    public double calculatePerimeter() {
	return 4 * this.side;
	}

	public void display() {
    System.out.println("\nArea of the Square of side " + this.side
		+ " is = " + this.calculateArea());

   System.out.println("It's perimeter is = " + this.calculatePerimeter()
				+ "\n");
		}
		}

	class Rectangle {
	private double length;
	private double breadth;

	public Rectangle() {

	}

    public Rectangle(double length, double breadth) {
	if (length < 0)
	this.length = 0;
		else
	this.length = length;

	if (breadth < 0)
		this.breadth = 0;
		else
		this.breadth = breadth;
		}

	public double calcArea() {
	return this.length * this.breadth;
	}

    public double calcPerimeter() {
 	return 2 * (this.length + this.breadth);
		}

    public double getLength() {
	return this.length;
	}

    public double getBreadth() {
	return this.breadth;
}

    public void setLength(double length) {
   if (length < 0)
	this.length = 0;
		else
		this.length = length;
}

    public void setBreadth(double breadth) {
	if (breadth < 0)
	this.breadth = 0;
	else
	this.breadth = breadth;
}

   public void display() {
   System.out.println("Area of the Rectangle of length " 
				+ this.getLength() + " and Breadth " 
			+ this.getBreadth() + " is = " + this.calcArea());

   System.out.println("It's perimeter is = " + this.calcPerimeter());
	}
}

	Scanner scan = new Scanner(System.in);

	Square sq1 = new Square();
 	System.out.print("Enter the side of the Square : ");
		double si = scan.nextDouble();
		   sq1.setSide(si); 
				
		Rectangle re1 = new Rectangle();
		System.out.print("Enter the length of the Rectangle : ");
	    double le = scan.nextDouble();
			     re1.setLength(le); 
	System.out.print("Enter the breadth of the Rectangle : ");
		double br = scan.nextDouble();
		         re1.setBreadth(br); 

				 sq1.display();
				 re1.display();
	}
	 
	}



