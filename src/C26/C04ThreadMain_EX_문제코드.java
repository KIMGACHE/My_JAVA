package C26;

class IncrementThread implements Runnable {
	private static int counter = 0; // 공유영역

	// lock object설정 (임계영역 접근 여부를 판단하는 기준)
	private static final Object lock = new Object();
	
	public int getCounter() {
		return counter;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			// 임계영역 지정 - 하나의 스레드가 들어오면 다른 스레드의 접근이 제한되는 영역
			synchronized(lock) {
				counter++; // 공유변수값증가
				System.out.println(Thread.currentThread().getName() + "s counter : " + counter);		

				if(i<99999) {
					try {
						lock.notifyAll(); // 다른 thread들에게 작업이 끝났다고 알림, 점유 권한 양도
						lock.wait(5); // i가 99999이하(반복문을 벗어나지 않을 때) 또 공유 메모리에 접근해야하기 때문에 잠깐 대기
									 // 다른 스레드가 1증가하고 나올때까지 대기 상태
					} catch (InterruptedException e) {
						e.printStackTrace();
					} 
				}
			}
		}
	}
}

public class C04ThreadMain_EX_문제코드 {

	public static void main(String[] args) throws InterruptedException {

		IncrementThread incrementThread1 = new IncrementThread();
		IncrementThread incrementThread2 = new IncrementThread();

		Thread thread1 = new Thread(incrementThread1);
		Thread thread2 = new Thread(incrementThread2);
		
		thread1.setName("TH1");
		thread2.setName("TH2");		

		thread1.start();
		thread2.start();

		//메인 스레드가 thread1,thread2의 작업이 모두 완료될 때까지 대기하도록 설정
		thread1.join();
		thread2.join();

		System.out.println("Final value: " + incrementThread1.getCounter());

	}
}