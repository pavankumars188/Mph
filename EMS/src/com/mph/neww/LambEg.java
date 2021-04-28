package com.mph.neww;

public class LambEg {public static void main(String[] args) {
	// Java 7 syntax-1
/*	MyTaskThread mtt = new MyTaskThread();
	Thread t = new Thread(mtt);
	t.start();*/

	// Java 7 syntax-2
/*	Runnable mtt1 = new MyTaskThread();
	Thread t1 = new Thread(mtt1);
	t1.start();*/
	
	// Java 7 syntax-3
/*	Runnable mtt2 = new Runnable(){ 			

		@Override
		public void run() {
			Task t = new Task(); //created run for this purpose
			t.print();				
		}			
	};
	Thread t2 = new Thread(mtt2);
	t2.start();
*/
	
	//Java 8 -1
	Runnable r1=()->{     //runnable is FI
		Task t = new Task();
		t.print();				
	};	
	Thread t3 = new Thread(r1);
	t3.start();
	//Java 8 -2
	Thread t4 = new Thread(()->{
		Task t = new Task();
		t.print();			
	});
	t4.start();
	//Java 8 -3
	new Thread(()->{
		Task t = new Task();
		t.print();			
	}).start();
	//Java 8-4
	new Thread(()->{
		new Task().print();			
	}).start();
	//Java 8-4
	new Thread(()->new Task().print()).start();
	
	//Method Reference
	new Thread(new Task()::print).start();
}
	
}


