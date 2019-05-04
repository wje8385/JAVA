class Phone1{
	void call(){
		System.out.println("CALL");
	}
}
class SmartPhone2 extends Phone1{
	void  mms(){
		System.out.println("Internet");
	}
}

class Mp3Phone3 extends Phone1{
	void mp3Play(){
		System.out.println("Mp3Player");
	}
}

public class PhoneTest2 {
	public static void main(String[] args){
		Phone1[]p = new Phone1[3];
		p[0] = new Phone1();
		p[1] = new SmartPhone2();
		
		p[2] = new Mp3Phone3();
		
		for(int i=0; i<p.length; i++){
			p[i].call();
			if(p[i] instanceof SmartPhone2)System.out.println("스마트폰");
			else if(p[i] instanceof Mp3Phone3)System.out.println("MP폰");
		}
		
		((SmartPhone2)(p[1])).mms();
		
		Mp3Phone3 tmp = (Mp3Phone3)p[2];
		tmp.mp3Play();
		
	}
}


