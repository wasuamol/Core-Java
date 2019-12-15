package firstThreadpkg;

public class ThreadClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class TClass extends Thread {
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("hello by thread class : "+i);
		}
	}
	
}
