package Package_3;

public class Ex8_3 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);			//실행 되지 않음
		} catch (Exception e) {				//ArithemticException대신 Exception을 사용
			System.out.println(5);
		}									//try-catch의 끝
		System.out.println(6);
	}										//main메소드의 끝

}
