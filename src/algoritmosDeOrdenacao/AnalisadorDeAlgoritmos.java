package algoritmosDeOrdenacao;

public class AnalisadorDeAlgoritmos {

	static AlgoritmosDeOrdenacao algoritmo = new AlgoritmosDeOrdenacao();

	public static long analisarBubbleSort(int[] array) {

		long somaDosTempos = 0;

		// repeticao de 100 vezes do algoritmo
		for (int i = 0; i < 100; i++) {

			long tempoAntesDeExecutar = System.nanoTime();

			for (int place = 1; place <= 1000000000; place *= 10) {
				array = algoritmo.bubbleSort(array, place);
			}

			long tempoDepoisDeExecutar = System.nanoTime();
			long tempoDeExecucao = tempoDepoisDeExecutar - tempoAntesDeExecutar;
			somaDosTempos = somaDosTempos + tempoDeExecucao;
		}

		long mediaDoTempoDeExecucao = somaDosTempos / 100;

		return mediaDoTempoDeExecucao;

	}

	public static long analisarInsertionSort(int[] array) {

		long somaDosTempos = 0;

		// repeticao de 100 vezes do algoritmo
		for (int i = 0; i < 100; i++) {

			long tempoAntesDeExecutar = System.nanoTime();

			for (int place = 1; place <= 1000000000; place *= 10) {
				array = algoritmo.insertionSort(array, place);
			}

			long tempoDepoisDeExecutar = System.nanoTime();
			long tempoDeExecucao = tempoDepoisDeExecutar - tempoAntesDeExecutar;
			somaDosTempos = somaDosTempos + tempoDeExecucao;
		}

		long mediaDoTempoDeExecucao = somaDosTempos / 100;

		return mediaDoTempoDeExecucao;

	}
	
	public static long analisarCountingSort(int[] array, int k) {

		long somaDosTempos = 0;

		// repeticao de 100 vezes do algoritmo
		for (int i = 0; i < 100; i++) {

			long tempoAntesDeExecutar = System.nanoTime();

			for (int place = 1; place <= 1000000000; place *= 10) {
				array = algoritmo.countingSort(array, k, place);
			}

			long tempoDepoisDeExecutar = System.nanoTime();
			long tempoDeExecucao = tempoDepoisDeExecutar - tempoAntesDeExecutar;
			somaDosTempos = somaDosTempos + tempoDeExecucao;
		}

		long mediaDoTempoDeExecucao = somaDosTempos / 100;

		return mediaDoTempoDeExecucao;

	}

}
