package C16;

interface Remocon {
	int MAXVOL = 100;
	int MINVOL = 0;
	
	void on();
	void off();
	void setVol(int vol);
}

class Tv implements Remocon {
	int vol;
	@Override
	public void on() { System.out.println("TV를 켭니다."); }
	
	@Override
	public void off() { System.out.println("TV를 끕니다."); }
	
	@Override
	public void setVol(int vol) {
		if(MAXVOL <= vol) {
			this.vol = MAXVOL;
		} else if(MINVOL >= vol) {
			this.vol = MINVOL;
		} else {
			this.vol = vol;
		}
		System.out.println("TV 볼륨 : " + this.vol);
	}
}
interface Browser {
	void SearchURL(String url);
}
class SmartTv extends Tv implements Browser{
	
	
	public void SearchURL(String url) {
		System.out.println(url + "로 이동합니다.");
	}
}

class Radio implements Remocon {
	int vol;
	@Override
	public void on() { System.out.println("Radio를 켭니다."); }
	
	@Override
	public void off() { System.out.println("Radio를 끕니다."); }
	
	@Override
	public void setVol(int vol) {
		if(MAXVOL <= vol) {
			this.vol = MAXVOL;
		} else if(MINVOL >= vol) {
			this.vol = MINVOL;
		} else {
			this.vol = vol;
		}
		System.out.println("Radio 볼륨 : " + this.vol);
	}
}

public class C01InterfaceMain {

	public static void TurnOn(Remocon controller) {
		controller.on();
	}
	public static void TurnOff(Remocon controller) {
		controller.off();
	}
	public static void setVolume(Remocon controller, int vol) {
		controller.setVol(vol);
	}
	public static void SearchWeb(Browser browser, String url) {
		browser.SearchURL(url);
	}
	public static void main(String[] args) {
		Tv tv = new Tv();
		Radio radio = new Radio();
		SmartTv smartTv = new SmartTv();
		
		TurnOn(tv);
		TurnOn(radio);
		TurnOn(smartTv);		
		
		TurnOff(tv);
		TurnOff(radio);
		TurnOff(smartTv);
		
		setVolume(tv,2222);
		setVolume(radio,-32);
		SearchWeb(smartTv,"www.google.com");
	}

}
