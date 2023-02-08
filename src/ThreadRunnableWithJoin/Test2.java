package dev.samuel.ThreadRunnableWithJoin;

/**
 * 
 * Tomando como base a classe Teste(), com a utilização do método isAlive() nós conseguiremos fazer com 
 * que a frase seja mostrada após a execução de todas as threads sem precisar se preocupar com o tempo, 
 * mesmo que façamos alterações nos tempo das threads.
 * Porém a forma como foi utilizado o método isAlive() não ficou elegante. O código ficou muito ruim, mas funciona kkk
 * 
*/
public class Test2 {

	public static void main(String[] args) {

		MinhaThreadRunnableWithoutStart thread1 = new MinhaThreadRunnableWithoutStart("#1", 500); //500
		MinhaThreadRunnableWithoutStart thread2 = new MinhaThreadRunnableWithoutStart("#2", 800); //500
		MinhaThreadRunnableWithoutStart thread3 = new MinhaThreadRunnableWithoutStart("#3", 1200); //500

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);

		t1.start();
		t2.start();
		t3.start();

		while(t1.isAlive() || t2.isAlive() || t3.isAlive()){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println(">>> Programa finalizado");
	}
}
