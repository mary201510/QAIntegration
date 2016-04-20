package test;

public class Practice implements Runnable{


	   private static int a = 0;
	   
	   private synchronized void inc(){
	      a++;
	}

	public void run(){

	 for(int i =0;i<5;i++){
	    inc();
	}
	}

	public static void main(String []agrs) throws Exception{
	   Runnable t = new Practice();
	   Thread t1 = new Thread(t);

	   t1.start();

	System.out.println(a);
	}

	}