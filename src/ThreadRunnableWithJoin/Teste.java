package dev.samuel.ThreadRunnableWithJoin;

/**
 * 
 * Aqui vamos simplemente chamar as trheads com o mesmo tempo de execução e no final 
 * deverá imprimir a frase de que o programa foi finalizado.
 * Observe que:
 * 	- Não foi possível deixar fazer com que a frase fosse mostrada após a finalização da execução 
 * 	  de todas as threads;
 * 	- Não é possível controla isso, mesmo colocando o delay de 2 milisegundos;
 * 	- Talvez tivessemos colocado mais tempo, só que isso não é legal, pois não garante que vai dar tempo.
 * 
*/
public class Teste {

	public static void main(String[] args) {
		
		MinhaThreadRunnableWithoutStart thread1 = new MinhaThreadRunnableWithoutStart("#1", 500);
		MinhaThreadRunnableWithoutStart thread2 = new MinhaThreadRunnableWithoutStart("#2", 500);
		MinhaThreadRunnableWithoutStart thread3 = new MinhaThreadRunnableWithoutStart("#3", 500);

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		
		t1.start();
		t2.start();
		t3.start();
		
		for (int i=0; i<7; i++){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(">>> Programa finalizado");
	}

}
