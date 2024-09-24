//package C14;
//// 상위 클래스
//class Point2D {
//	int x;
//	int y;
//	Point2D(){
//		System.out.println("Point 2D 생성자 호출");
//	}
//	//
//	@Override
//	public String toString() {
//		return "Point2D [x=" + x + ", y=" + y + "]";
//	}
//}
//// 하위 클래스
//class Point3D extends Point2D{
//	int z;
//
//	Point3D(){
//		super(); // 상속관계에 있는 상위 클래스의 생성자를 호출한다. 안보여도 항상 있음
//		System.out.println("Point 3D 생성자 호출");
//	}
//	// 상위클래스의 생성자를 먼저 호출하고 이후 하위 클래스의 생성자를 호출한다.
//	@Override
//	public String toString() {
//		return "Point3D [z=" + z + ", x=" + x + ", y=" + y + "]";
//	}
//
//}
//
//public class C01InheritanceMain {
//	public static void main(String[] args) {
//		// 물려주는 클래스 - 상위 클래스(부모클래스,슈퍼클래스)
//		// 물림받는 클래스 - 하위 클래스(자식클래스,서브클래스)
//		// 상속 : 상위클래스의 속성과 기능을 하위클래스가 그대로 받아서 사용할 수 있도록 허용된 문법
//		
//		// 상속을 사용하는 이유
//		// 1. 코드 중복방지(가독성)
//		// 2. 유지보수 용이
//		// 3. 확장성
//		
//		Point3D obj = new Point3D();
//		obj.x =10;
//		obj.y =20;
//		obj.z =30;
//		System.out.println(obj);
//	}
//}
