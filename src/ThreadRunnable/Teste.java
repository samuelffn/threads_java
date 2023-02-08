package dev.samuel.ThreadRunnable;

public class Teste {

	public static void main(String[] args) {
		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#Thread1", 900);
		//Thread t1 = new Thread(thread1);
		//t1.start();
		
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#Thread2", 150);
		
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#Thread3", 1100);
	}

}
