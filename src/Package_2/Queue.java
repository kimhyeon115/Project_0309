package Package_2;

public interface Queue {
	void enQueue(String title);		//넣을 역할
	String deQueue();				//반화 역할
	int getSize();					//크기
}