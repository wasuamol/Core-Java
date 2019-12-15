package firstThreadpkg;

public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(new ThreadJoin());
		Thread t2 = new Thread(new ThreadJoin());
		
		t1.start();
		
		
		t1.join();
		
		t2.start();
		

	}

}

class ThreadJoin implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(2000); //sleep for 2 sec
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			System.out.println("Current thread is :: "+Thread.currentThread().getName());
			System.out.println("hello by thread class : "+i);
		}
		
	}
	
}
