package firstThreadpkg;

public class ThreadSleepDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new ThreadSleep()).start();
		//or
		/*Thread t = new Thread(new ThreadSleep());
		t.start();*/
	}

}

class ThreadSleep implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(2000); //sleep for 2 sec
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			System.out.println("hello by thread class : "+i);
		}
		
	}
	
}
