package dev.samuel.ThreadSimples;

/**
 * Uma classe de thread simples, que herda da classe principal Thread do Java.
 * Essa classe recebe o nome da Thread e o tempo de execução dela.
*/
public class MinhaThreadSimples extends Thread {

	private String nome;
	private int tempo;

	public MinhaThreadSimples(String nome, int tempo){
		this.nome = nome;
		this.tempo = tempo;
		start();
	}

	public void run(){
		this.execute();
	}

	private void execute(){
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
