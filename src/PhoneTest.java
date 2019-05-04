import java.util.Calendar;

class Phone { // 생성자가 private일 경우 getInstance 메서드이용 (싱글톤 : 생성자에 private걸렸을 때 스태틱메서드이용해서 사용)
	String color;
	static Phone p = new Phone(); // 스태틱을 줌

	private Phone() {
		this.color = "black";
	}

	static Phone getInstance() { // 스태틱을 줌
		return p;
	}
}

public class PhoneTest {

	public static void main(String[] args) {
		Phone p = Phone.getInstance();
		System.out.println(p.color);
		Calendar a =  Calendar.getInstance(); //private로 걸려있어서 getInstance 메서드이용하여 사용(접근제어자에 대한 이용법)
	}
}
