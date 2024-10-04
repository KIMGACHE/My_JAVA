package C35;

@CustomAnnotation(value="HELLOWORLD",number=5)
class Simple {
	String value;
	int number;
	
	Simple() {
		CustomAnnotation ref = this.getClass().getAnnotation(CustomAnnotation.class);
		System.out.println("value : " + ref.value());
		System.out.println("number : " + ref.number());
		this.value = ref.value();
		this.number = ref.number();
	}
	
	@Override
	public String toString() {
		return "Simple [value=" + value + ", num=" + number + "]";
	}
	
}

public class ImplementMain {
	public static void main(String[] args) {
		Simple obj = new Simple();
		System.out.println(obj);
	}
}
