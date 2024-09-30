package C16;
class iTV{
	private int size;
	public iTV(int size) { this.size = size; }
	protected int getSize() { return size; }
}

class ColorTV extends iTV{
	private int color;
	ColorTV(int size, int color){
		super(size);
		this.color = color;
	}
	protected int getColor() {return color;}
	public void printProperty() {
		System.out.println(getSize()+"인치, "+getColor()+"컬러");
	}
}
class IPTV extends ColorTV {
	private String ip;
	IPTV(String ip, int size, int color) {
		super(size,color);
		this.ip = ip;
	}
	protected String getIP() {return ip;}
	public void printProperty() {
		System.out.println(getIP()+"주소에 "+getSize()+"인치, "+getColor()+"컬러");
	}
}

public class C05EX {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); //"192.1.1.2" 주소에 32인치, 2048컬러
		iptv.printProperty();
	}
}
