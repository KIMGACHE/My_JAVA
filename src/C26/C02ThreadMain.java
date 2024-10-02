package C26;

public class C02ThreadMain {

	public static void main(String[] args) throws InterruptedException {
		/////////////////////////////////////
		// Runnable Interface를 이용한 스레드 분할
		/////////////////////////////////////
		// 01 작업스레드 객체 생성
		C02Worker1 w1 = new C02Worker1();
		C02Worker2 w2 = new C02Worker2();
		
		// 02 스레드별 분리
		Thread th1 = new Thread(w1);
		Thread th2 = new Thread(w2);
		
		// 03 스레드 실행
		th1.start();
		th2.start();
		
		////////////////////////////////////
		// Thread를 이용한 스레드 분할
		////////////////////////////////////
		new Thread() {

			@Override
			public void run() {
				for(int i=0; i<5; i++) {
					System.out.println("Task03..");
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
			
		}.start(); // 생성한 익명객체에 start()함수를 실행
		
		// 04 Main Thread 작업
		for(int i=0; i<10; i++) {
			System.out.println("Main Thread...");
			Thread.sleep(500);
		}
	}

}
