package dev.samuel.ThreadRunnablePriority;

import dev.samuel.ThreadRunnableWithJoin.MinhaThreadRunnableWithoutStart;

/**
 * 
 * Faremos reuso da classe MinhaThreadRunnableWithoutStart pra testar as prioridades usando threads.
 * 	- A Thread ter prioridade maior não significa que é uma garantia de que será executada antes das demais,
 * 	  pois dependendo do SO e de outros fatores, essa prioridade não pode ser garantida, mas ela terá uma 
 * 	  atenção a mais sim e na medida do possivel terá a prioridade.
 * - Podemos utilizar qualquer valor para a prioridade
 * - O java tem algumas constantes que podemos utilizar tb para usarmos nas prioridades (Eu acho melhor)
 * 
*/
public class TesteThreadPriority {

	public static void main(String[] args) {
		
		MinhaThreadRunnableWithoutStart thred1 = new MinhaThreadRunnableWithoutStart("#Thread1", 500);
		MinhaThreadRunnableWithoutStart thred2 = new MinhaThreadRunnableWithoutStart("#Thread2", 500);
		MinhaThreadRunnableWithoutStart thred3 = new MinhaThreadRunnableWithoutStart("#Thread3", 500);

		Thread t1 = new Thread(thred1);
		Thread t2 = new Thread(thred2);
		Thread t3 = new Thread(thred3);
		
		//t2.setPriority(3);
		//t3.setPriority(1);
		//t1.setPriority(5);
		
		t1.setPriority(Thread.NORM_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
