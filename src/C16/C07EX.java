package C16;

class Point {
   private int x, y;
   public Point(int x, int y) { this.x = x; this.y = y; }
   public int getX() { return x; }
   public int getY() { return y; }
   protected void move(int x, int y) { this.x =x; this.y = y; }
}

class ColorPoint extends Point {
	private String color;
	ColorPoint() {
		super(0,0);
		this.color = "BLACK";
	}
	ColorPoint(int x, int y) {
		super(x,y);
		this.color = "BLACK";
	}
	ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	public void setXY(int x, int y) {move(x,y);}
	public void setColor(String color) {this.color = color;}
	@Override
	public String toString() {
		return color+"색의 ("+getX()+","+getY()+")의 점";
	}
	
}

class Point3D extends Point {
	private int z;
	Point3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	public int getZ() {return z;}
	protected void move(int x, int y, int z) { move(x,y); this.z=z; }
	protected void moveUp() { this.z=z+1; }
	protected void moveDown() { this.z=z-1; }
	@Override
	public String toString() {
		return "("+getX()+","+getY()+","+getZ()+")의 점";
	}
}

class PositivePoint extends Point {
	PositivePoint(){
		super(0,0);
	}
//	PositivePoint(int x, int y) {
//		super(x,y);
//		if(x<0) {x=0;}
//		if(y<0) {y=0;}
//		super(x,y);
//	}
}

public class C07EX{
	public static void main(String[] args) {
	   ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
	   cp.setXY(10, 20);
	   cp.setColor("RED");
	   String str = cp.toString();
	   System.out.println(str+"입니다. ");
	   //
	   ColorPoint zeroPoint = new ColorPoint(); // (0,0) 위치의 BLACK 색 점
	   System.out.println(zeroPoint.toString() + "입니다.");
	   ColorPoint cp2 = new ColorPoint(10, 10); // (10,10) 위치의 BLACK 색 점
	   cp2.setXY(5,5);
	   cp2.setColor("RED");
	   System.out.println(cp.toString()+"입니다.");
	   //
	   Point3D p = new Point3D(1,2,3); // 1,2,3은 각각 x, y, z축의 값.
	   System.out.println(p.toString()+"입니다.");
	   p.moveUp(); // z 축으로 위쪽 이동
	   System.out.println(p.toString()+"입니다.");
	   p.moveDown(); // z 축으로 아래쪽 이동
	   p.move(10, 10); // x, y 축으로 이동
	   System.out.println(p.toString()+"입니다.");
	   p.move(100,  200, 300); // x, y, z축으로 이동
	   System.out.println(p.toString()+"입니다.");
	   //
	   PositivePoint p2 = new PositivePoint();
	   p2.move(10, 10);
	   System.out.println(p.toString()+"입니다.");
	   p2.move(-5,5); // 객체 p는 음수 공간으로 이동되지 않음
	   System.out.println(p2.toStrgin()+"입니다.");
	   PositivePoint p3 = new PositivePoint(-10, -10);
	   System.out.println(p3.toString()+"입니다.");
	}
}
//RED색의 (10,20)의 점입니다. 

//BLACK색의 (0,0) 점입니다.
//RED색의 (5,5) 점입니다.

//(1,2,3) 의 점입니다.
//(1,2,4) 의 점입니다.
//(10,10,3) 의 점입니다.
//(100,200,300) 의 점입니다.

//(10,10)의 점입니다.
//(10,10)의 점입니다.
//(0,0)의 점입니다.
