package firstThreadpkg;

public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t = new Thread(new RunnableThread());
		t.start();

	}

}

class RunnableThread implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("hello by thread class : "+i);
		}
		
	}
	
}
