package dev.samuel.ThreadRunnableWithJoin;

/**
 * 
 * Essa classe faz é praticamente a mesma classe MinhaThreadRunnable, só que sem estar startando
 * a thread dentro do construtor. Quem vai startar é quem chamar.
 * Foi feito assim para demostrar exemplos usando os métodos Join() e isAlive() nas classes de teste.
 * 
*/
public class MinhaThreadRunnableWithoutStart implements Runnable {

	private String nome;
	private int tempo;

	public MinhaThreadRunnableWithoutStart(String nome, int tempo){
		this.nome = nome;
		this.tempo = tempo;
		//Thread t = new Thread(this);
		//t.start();
	}

	@Override
	public void run() {
		this.execute();
	}

	private void execute() {
		try {
			for (int i=0; i<6; i++){
				System.out.println(nome + " contador " + i);
				Thread.sleep(tempo);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Terminou a execução de " + nome);
	}

}
