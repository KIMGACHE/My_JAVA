package C34;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface Func1 {
	void say(String message);
}
@FunctionalInterface
interface Func2 {
	int sum(Integer ...args);
}
@FunctionalInterface
interface Func3 {
	List<Integer> createListDesc(int ...args);
}


// 함수형 인터페이스를 사용할거면 인터페이스에 추상메서드를 하나만 만들어둔다. @FunctionalInterface 을 붙여줌으로써 컴파일러가 해당 interface가 함수형인지 알 수 있다.
public class C01FunctionalInterfaceMain {
	public static void main(String[] args) {
		// 01
		Func1 func1 = (message)->{System.out.println(message);};
		
		func1.say("HelloWorld");
		
		// 01_1
		Func1 func1_1 = System.out::println;
		func1_1.say("HELLOWORLD2");
		
		// 02
		Func2 func2 = (arg)->{
			int sum=0;
			for(int el:arg) {
				sum+=el;
			}
			return sum;
		};
		System.out.println(func2.sum(10,20,30,40,50,060,70,60));
		
		// 02_2
		Func2 func2_2 = (arg)->{
			return Arrays.stream(arg)
						.reduce(0,(sum,b)->sum+b);
		};
		System.out.println(func2_2.sum(1,2,3,4,5,6,7,8,11,22,66));
		
		// 03
		Func3 func3 = (arg)->{
			return Arrays.stream(arg)
						.boxed()	// sorted가 원시타입 int를 지원하지않아 Integer로 매핑했음
						.sorted((a,b)->{return b-a;})
						.collect(Collectors.toList());
		};
		
		List<Integer> li = func3.createListDesc(6,55,4,22,88,999,1,23,333,3125);
		System.out.println(li);
	}
}
