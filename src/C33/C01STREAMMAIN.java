package C33;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {
	String name;
	Integer age;
	public Person() {}
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}

public class C01STREAMMAIN {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		System.out.println(list);
		
		// filter
		List<Integer> list2 = list.stream()
								.filter(n-> n%2==0) // 반환타입이 Stream이다.
								.collect(Collectors.toList()); // 리스트 형태로 다시 변환하여 저장
		System.out.println(list2);
		
		// map
		List<Integer> list3 = list.stream()
									.filter(n->n%2==1)
									.map(n->n*n)
									.collect(Collectors.toList());
		System.out.println(list3);
		
		List<Person> list4 = Arrays.asList(
				new Person("박효신추억은사랑을닮아",40),
				new Person("김범수끝사랑",45),
				new Person("자이언티",30)
				);
		System.out.println(list4);
		
		List<Integer> list5 = list4.stream()
//									.map(ob->{return ob.getAge();})
									.map(Person::getAge)
									.sorted((a,b)->{return b-a;})
									.collect(Collectors.toList());
		System.out.println(list5);
		
		List<Integer> list6 = list4.stream()
										.map(Person::getName)
										.map(String::length)
										.sorted((a,b)->{return b-a;})
										.collect(Collectors.toList());
		System.out.println(list6);
		
		List<String> names = Arrays.asList("렝가","티모","카르마","다리우스","김기현");
		List<Integer> ages = Arrays.asList(10,20,30,40,50);
		
		List<Person> list7 = names.stream()
//									.map(Person::new) //비어있는 객체를 Person객체를 만든다
									.map(el->{
										return new Person(el,ages.get(names.indexOf(el)));
									}).collect(Collectors.toList());
		
		System.out.println(list7);
		
	}
}
