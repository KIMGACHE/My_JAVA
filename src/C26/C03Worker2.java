package C26;

public class C03Worker2 implements Runnable {

	C03GUI gui;
	C03Worker2(C03GUI gui) {
		this.gui = gui;
	}
	@Override
	public void run() {
		while(true) {
			try {
				gui.area2.append("Task02...\n");
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break; // interrupt()에 의해 예외가 발생되면 break를 통해 while문을 탈출해야한다.
			}
		}
	}
}
