package dev.samuel.ThreadRunnableWithJoin;

/**
 * 
 * Tomando como base as classes Teste() e Teste2(), conseguiremos ter o controle da finalização de todas
 * as threads de forma elegante. Para isso, utilizamos o metodo Join().
 * 
*/
public class Test3 {

	public static void main(String[] args) {

		MinhaThreadRunnableWithoutStart thread1 = new MinhaThreadRunnableWithoutStart("#1", 500); //500
		MinhaThreadRunnableWithoutStart thread2 = new MinhaThreadRunnableWithoutStart("#2", 700); //500
		MinhaThreadRunnableWithoutStart thread3 = new MinhaThreadRunnableWithoutStart("#3", 800); //500

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);

		t1.start();
		
		/*try {
			t1.join(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		
		t2.start();
		
		/*try {
			t2.join();
		*/
		
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(">>> Programa finalizado");
	}
}
