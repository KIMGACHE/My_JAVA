package C17;

import java.util.Objects;

class C03Simple {
	private int id;
	C03Simple(int id) {
		this.id = id;
	}
	@Override
	public int hashCode() {

		return Objects.hash(id);
	}
	// 보통 equals를 재정의하면 hashCode도 재정의한다.
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof C03Simple) {
			C03Simple down = (C03Simple) obj;
			return this.id == down.id;
		}
		return false;
	}
	
}

public class C03ObjectHashCode {
	public static void main(String[] args) {
		C03Simple ob1 = new C03Simple(1);
		C03Simple ob2 = new C03Simple(2);
		C03Simple ob3 = new C03Simple(3);
		System.out.println(ob1);
		System.out.printf("%x\n", ob1.hashCode());
		System.out.printf("%d\n", ob1.hashCode()); // hashCode()함수의 결과값은 원래 16진수이다
		System.out.println(ob2);
		System.out.printf("%x\n", ob2.hashCode());
		System.out.println(ob3);
		System.out.printf("%x\n", ob3.hashCode());
		
		System.out.printf("%x\n",System.identityHashCode(ob1));
		System.out.printf("%x\n",System.identityHashCode(ob2));
		System.out.printf("%x\n",System.identityHashCode(ob3));
	}
}
