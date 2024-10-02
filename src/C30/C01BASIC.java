package C30;

import java.lang.reflect.Method;


public class C01BASIC {
	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("java.lang.String");
		
		// 모든 Field 확인
//		Field[] fields = clazz.getDeclaredFields(); // field정보만 가져온 것
//		
//		for(Field field : fields) {
//			System.out.println(field);
//		}
		
		// 모든 생성자 확인
//		Constructor[] constructor = clazz.getDeclaredConstructors();
//		for(Constructor con : constructor) {
//			System.out.println(con);
//		}
		
		// 모든 메서드 확인
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println(method);
		}
		
		
	}
}
