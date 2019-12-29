package blockingQueuesPkg;

import java.util.concurrent.ArrayBlockingQueue;

public class ArraBlockingQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<Integer>(5); 
		
		Thread t1 = new Thread() {

			@Override
			public void run() {
				
				for (int i = 1; i <= 5; i++) {
					System.out.println("t1 adding : "+i);
					try {
						abq.put(i);
						System.out.println("t1 added : "+i);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
			
		};
		
		Thread t2 = new Thread() {

			@Override
			public void run() {
				
				for (int i = 6; i <= 10; i++) {
					System.out.println("t2 adding : "+i);
					try {
						abq.put(i);
						System.out.println("t2 added : "+i);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
			
		};
		
		t1.start();
		t2.start();
		
	}

}
