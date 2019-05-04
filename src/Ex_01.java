//Object
//instance
class TV{ //설계도
	//외형 : 전원, 채널, 볼륨버튼; 전원, 채널, 볼륨 값;
	private static String brand = "삼성"; //공통의 정보
	boolean power;
	static int channel = 1;
	int volume;
	
	void poweOnOff(){
		power = !power;
	}
	
	void channelUp(){
		channel ++;	
	}
	void channelDown(){
		channel --;
		System.out.println("ddd");
	}
	// 반환값 이름()매개변수{ }
	
	//기능 : 전원조작 
	//기능 : 채널조작
	//기능 : 볼륨조작
}
public class Ex_01 {
	public static void main(String[] args){
		/*System.out.println(args[0]); //run-> rub configuration -> arguments*/
		//TV.brand="lg";
		TV t = new TV();
		TV t1 = new TV();	
		TV t2 = new TV();
		//System.out.println(t1.brand);
		//System.out.println(t.brand);
		t1.channelDown();
		System.out.println(t1.channel);
		System.out.println(t2.channel);
		
		
		
	}
}
