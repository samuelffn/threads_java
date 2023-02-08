package dev.samuel.ThreadSimples;

public class Teste {

	public static void main(String[] args) {
		
		MinhaThreadSimples thread = new MinhaThreadSimples("Thread #1", 600);
		//thread.start();
		
		MinhaThreadSimples thread2 = new MinhaThreadSimples("Thread #2", 100);
		
		MinhaThreadSimples thread3 = new MinhaThreadSimples("Thread #3", 500);
	}

}
