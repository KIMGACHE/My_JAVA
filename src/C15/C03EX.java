package C15;

abstract class Shape{
	 abstract void 넓이();
}
class Rectangle extends Shape{
	int width;
	int height;
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	void 넓이() {
		System.out.println(width*height);
	}

}
class Triangle extends Shape{
	int height;
	int bottomLine;
	
	public Triangle(int height, int bottomLine) {
		super();
		this.height = height;
		this.bottomLine = bottomLine;
	}

	void 넓이() {
		System.out.println((height*bottomLine)/2);
	}
}
class Circle extends Shape{
	int radius;
	static final double PI=3.14;
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	void 넓이() {
		System.out.println((int)(radius*radius*PI)); 
	}


}
public class C03EX {
	public static void 전체넓이확인(Shape shape) 
	{
		shape.넓이();
	}
	
	public static void main(String[] args) {
		전체넓이확인(new Rectangle(45,45));
		전체넓이확인(new Triangle(100,20));
		전체넓이확인(new Circle(5));
	}
}