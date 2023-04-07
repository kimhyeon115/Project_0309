package Package_2;
class AAA2 {
	int i=100;
	BBB2 b= new BBB2();
	private int t1;
	
	public int getT1() {
		return t1;
	}

	public void setT1(int t1) {
		this.t1 = t1;
	}

	class BBB2 {					//BBB2는 AAA2의 내부 클래스
		void method() {
			System.out.println(i);	//객체 생성 없이 사용가능
		}
	}
}
public class InnerTest2 {

	public static void main(String[] args) {
		AAA2 a = new AAA2();
		a.b.method();
		a.setT1(256);
		System.out.println(a.getT1());
	}
}

