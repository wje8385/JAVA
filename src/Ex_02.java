
class Add{
	
	int add(int a, int b){
		return a+b;
	}
	
	float add(float a, float b){
		return a+b;
	}
	
	void add(int[]a){
		int sum=0;
		for(int i=0; i<a.length; i++)sum+=a[i];
		System.out.println(sum);
	}
}


public class Ex_02 {

	public static void main(String[] args) {
		Add a= new Add();
		System.out.println(a.add(1, 2));
		System.out.println(a.add(4.2f, 6.7f));
		a.add(new int[]{1,2,3,4,5});
	}
}

