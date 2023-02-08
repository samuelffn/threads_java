package dev.samuel.ThreadRunnable;

/**
 * Uma classe de thread simples, que ao invés de herdad da classe principal Thread do Java, ela
 * implementa a interface Rennable:
 * 	- Nesse caso precisamos instaciar a thread dentro do controtor;
 * 	- Não é obrihatório a thread instanciar no construtor, ela poderia ser instanciada por que chamar 
 *    a classe MinhaThreadRunnable (Veja um exemplo comentado na classe Teste)
 * Essa classe faz a mesma coisa que a classe ThreadSimples, só que usando Rannable.
*/
public class MinhaThreadRunnable implements Runnable {

	private String nome;
	private int tempo;

	public MinhaThreadRunnable(String nome, int tempo){
		this.nome = nome;
		this.tempo = tempo;
		Thread t = new Thread(this);
		t.start();
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
