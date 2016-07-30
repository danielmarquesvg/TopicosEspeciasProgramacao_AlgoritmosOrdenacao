package algoritmosDeOrdenacao;

public class Main {

	public static int[] array20_ordenadoCrescente = new int[20];
	public static int[] array20_ordenadoDecrescente = new int[20];
	public static int[] array20_ordenadoAleatorio = new int[20];

	public static int[] array200_ordenadoCrescente = new int[200];
	public static int[] array200_ordenadoDecrescente = new int[200];
	public static int[] array200_ordenadoAleatorio = new int[200];

	public static int[] array2000_ordenadoCrescente = new int[2000];
	public static int[] array2000_ordenadoDecrescente = new int[2000];
	public static int[] array2000_ordenadoAleatorio = new int[2000];

	public static int[] arrayAuxiliar20 = new int[20];
	public static int[] arrayAuxiliar200 = new int[200];
	public static int[] arrayAuxiliar2000 = new int[2000];

	public static void main(String[] args) {

		/*
		 * 4 Algoritmos 3 tipos de arrays (ordenado crescente, ordenado
		 * decrescente e aleatorio) 3 tamanhos de arrays (20, 200, 2000)
		 */
		long[][][] arrayDeTempos = new long[4][3][3];

		AnalisadorDeAlgoritmos analisador = new AnalisadorDeAlgoritmos();

		preencherArray();

		System.out.print("Algoritmo \t\t\t\tTamanho 20 \t\tTamanho 200 \t\tTamanho 2000\n\n");

		/*
		 * ORDENANDO COM O BUBBLE SORT
		 * ---------------------------------------------------------------------
		 */

		// ARRAY ORDENADO CRESCENTE
		System.out.print("BubbleSort Ordenado Crescente \t\t");
		arrayAuxiliar20 = array20_ordenadoCrescente.clone();
		arrayDeTempos[0][0][0] = analisador.analisarBubbleSort(arrayAuxiliar20);
		System.out.print(arrayDeTempos[0][0][0] + " ns\t\t");

		arrayAuxiliar200 = array200_ordenadoCrescente.clone();
		arrayDeTempos[0][0][1] = analisador.analisarBubbleSort(arrayAuxiliar200);
		System.out.print(arrayDeTempos[0][0][1] + " ns\t\t");

		arrayAuxiliar2000 = array2000_ordenadoCrescente.clone();
		arrayDeTempos[0][0][2] = analisador.analisarBubbleSort(arrayAuxiliar2000);
		System.out.print(arrayDeTempos[0][0][2] + " ns\n");

		// ARRAY ORDENADO DECRESCENTE
		System.out.print("BubbleSort Ordenado Decrescente \t");
		arrayAuxiliar20 = array20_ordenadoDecrescente.clone();
		arrayDeTempos[0][1][0] = analisador.analisarBubbleSort(arrayAuxiliar20);
		System.out.print(arrayDeTempos[0][1][0] + " ns\t\t");

		arrayAuxiliar200 = array200_ordenadoDecrescente.clone();
		arrayDeTempos[0][1][1] = analisador.analisarBubbleSort(arrayAuxiliar200);
		System.out.print(arrayDeTempos[0][1][1] + " ns\t\t");

		arrayAuxiliar2000 = array2000_ordenadoDecrescente.clone();
		arrayDeTempos[0][1][2] = analisador.analisarBubbleSort(arrayAuxiliar2000);
		System.out.print(arrayDeTempos[0][1][2] + " ns\n");

		// ARRAY ORDENADO ALEATORIO
		System.out.print("BubbleSort Aleatório \t\t\t");
		arrayAuxiliar20 = array20_ordenadoAleatorio.clone();
		arrayDeTempos[0][2][0] = analisador.analisarBubbleSort(arrayAuxiliar20);
		System.out.print(arrayDeTempos[0][2][0] + " ns\t\t");

		arrayAuxiliar200 = array200_ordenadoAleatorio.clone();
		arrayDeTempos[0][2][1] = analisador.analisarBubbleSort(arrayAuxiliar200);
		System.out.print(arrayDeTempos[0][2][1] + " ns\t\t");

		arrayAuxiliar2000 = array2000_ordenadoAleatorio.clone();
		arrayDeTempos[0][2][2] = analisador.analisarBubbleSort(arrayAuxiliar2000);
		System.out.print(arrayDeTempos[0][2][2] + " ns\n\n");

		/*
		 * ORDENANDO COM O INSERTION SORT
		 * ---------------------------------------------------------------------
		 */

		// ARRAY ORDENADO CRESCENTE
		System.out.print("InsertionSort Ordenado Crescente \t");
		arrayAuxiliar20 = array20_ordenadoCrescente.clone();
		arrayDeTempos[1][0][0] = analisador.analisarInsertionSort(arrayAuxiliar20);
		System.out.print(arrayDeTempos[1][0][0] + " ns\t\t");

		arrayAuxiliar200 = array200_ordenadoCrescente.clone();
		arrayDeTempos[1][0][1] = analisador.analisarInsertionSort(arrayAuxiliar200);
		System.out.print(arrayDeTempos[1][0][1] + " ns\t\t");

		arrayAuxiliar2000 = array2000_ordenadoCrescente.clone();
		arrayDeTempos[1][0][2] = analisador.analisarInsertionSort(arrayAuxiliar2000);
		System.out.print(arrayDeTempos[1][0][2] + " ns\n");

		// ARRAY ORDENADO DECRESCENTE
		System.out.print("InsertionSort Ordenado Decrescente \t");
		arrayAuxiliar20 = array20_ordenadoDecrescente.clone();
		arrayDeTempos[1][1][0] = analisador.analisarInsertionSort(arrayAuxiliar20);
		System.out.print(arrayDeTempos[1][1][0] + " ns\t\t");

		arrayAuxiliar200 = array200_ordenadoCrescente.clone();
		arrayDeTempos[1][1][1] = analisador.analisarInsertionSort(arrayAuxiliar200);
		System.out.print(arrayDeTempos[1][1][1] + " ns\t\t");

		arrayAuxiliar2000 = array2000_ordenadoCrescente.clone();
		arrayDeTempos[1][1][2] = analisador.analisarInsertionSort(arrayAuxiliar2000);
		System.out.print(arrayDeTempos[1][1][2] + " ns\n");

		// ARRAY ALEATÓRIO
		System.out.print("InsertionSort Aletório \t\t\t");
		arrayAuxiliar20 = array20_ordenadoDecrescente.clone();
		arrayDeTempos[1][2][0] = analisador.analisarInsertionSort(arrayAuxiliar20);
		System.out.print(arrayDeTempos[1][2][0] + " ns\t\t");

		arrayAuxiliar200 = array200_ordenadoCrescente.clone();
		arrayDeTempos[1][2][1] = analisador.analisarInsertionSort(arrayAuxiliar200);
		System.out.print(arrayDeTempos[1][2][1] + " ns\t\t");

		arrayAuxiliar2000 = array2000_ordenadoCrescente.clone();
		arrayDeTempos[1][2][2] = analisador.analisarInsertionSort(arrayAuxiliar2000);
		System.out.print(arrayDeTempos[1][2][2] + " ns\n\n");

		/*
		 * ORDENANDO COM O COUNTING SORT
		 * ---------------------------------------------------------------------
		 */

		// ARRAY ORDENADO CRESCENTE
		System.out.print("CountingSort Ordenado Crescente \t");
		arrayAuxiliar20 = array20_ordenadoCrescente.clone();
		arrayDeTempos[2][0][0] = analisador.analisarCountingSort(arrayAuxiliar20, 19);
		System.out.print(arrayDeTempos[2][0][0] + " ns\t\t");

		arrayAuxiliar200 = array200_ordenadoCrescente.clone();
		arrayDeTempos[2][0][1] = analisador.analisarCountingSort(arrayAuxiliar200, 199);
		System.out.print(arrayDeTempos[2][0][1] + " ns\t\t");

		arrayAuxiliar2000 = array2000_ordenadoCrescente.clone();
		arrayDeTempos[2][0][2] = analisador.analisarCountingSort(arrayAuxiliar2000, 1999);
		System.out.print(arrayDeTempos[2][0][2] + " ns\n");

		// ARRAY ORDENADO DECRESCENTE
		System.out.print("CountingSort Ordenado Decrescente \t");
		arrayAuxiliar20 = array20_ordenadoDecrescente.clone();
		arrayDeTempos[2][1][0] = analisador.analisarCountingSort(arrayAuxiliar20, 19);
		System.out.print(arrayDeTempos[2][1][0] + " ns\t\t");

		arrayAuxiliar200 = array200_ordenadoDecrescente.clone();
		arrayDeTempos[2][1][1] = analisador.analisarCountingSort(arrayAuxiliar200, 199);
		System.out.print(arrayDeTempos[2][1][1] + " ns\t\t");

		arrayAuxiliar2000 = array2000_ordenadoDecrescente.clone();
		arrayDeTempos[2][1][2] = analisador.analisarCountingSort(arrayAuxiliar2000, 1999);
		System.out.print(arrayDeTempos[2][1][2] + " ns\n");

		// ARRAY ALEATORIO
		System.out.print("CountingSort Aleatório \t\t\t");
		arrayAuxiliar20 = array20_ordenadoAleatorio.clone();
		arrayDeTempos[2][2][0] = analisador.analisarCountingSort(arrayAuxiliar20, 19);
		System.out.print(arrayDeTempos[2][2][0] + " ns\t\t");

		arrayAuxiliar200 = array20_ordenadoAleatorio.clone();
		arrayDeTempos[2][2][1] = analisador.analisarCountingSort(arrayAuxiliar200, 199);
		System.out.print(arrayDeTempos[2][2][1] + " ns\t\t");

		arrayAuxiliar2000 = array20_ordenadoAleatorio.clone();
		arrayDeTempos[2][2][2] = analisador.analisarCountingSort(arrayAuxiliar2000, 1999);
		System.out.print(arrayDeTempos[2][2][2] + " ns\n\n");

		/*
		 * ORDENANDO COM O MERGE SORT
		 * ---------------------------------------------------------------------
		 */

		// ARRAY ORDENADO CRESCENTE
		System.out.print("MergeSort Ordenado Crescente \t");
		arrayAuxiliar20 = array20_ordenadoCrescente.clone();
		arrayDeTempos[3][0][0] = analisador.analisarMergeSort(arrayAuxiliar20, 0, 19);
		System.out.print(arrayDeTempos[3][0][0] + " ns\t\t");

		arrayAuxiliar200 = array200_ordenadoCrescente.clone();
		arrayDeTempos[3][0][1] = analisador.analisarMergeSort(arrayAuxiliar200, 0, 199);
		System.out.print(arrayDeTempos[3][0][1] + " ns\t\t");

		arrayAuxiliar2000 = array2000_ordenadoCrescente.clone();
		arrayDeTempos[3][0][2] = analisador.analisarMergeSort(arrayAuxiliar2000, 0, 1999);
		System.out.print(arrayDeTempos[3][0][2] + " ns\n");

		// ARRAY ORDENADO DECRESCENTE
		System.out.print("MergeSort Ordenado Decrescente \t");
		arrayAuxiliar20 = array20_ordenadoDecrescente.clone();
		arrayDeTempos[3][1][0] = analisador.analisarMergeSort(arrayAuxiliar20, 0, 19);
		System.out.print(arrayDeTempos[3][1][0] + " ns\t\t");

		arrayAuxiliar200 = array200_ordenadoDecrescente.clone();
		arrayDeTempos[3][1][1] = analisador.analisarMergeSort(arrayAuxiliar200, 0, 199);
		System.out.print(arrayDeTempos[3][1][1] + " ns\t\t");

		arrayAuxiliar2000 = array2000_ordenadoDecrescente.clone();
		arrayDeTempos[3][1][2] = analisador.analisarMergeSort(arrayAuxiliar2000, 0, 1999);
		System.out.print(arrayDeTempos[3][1][2] + " ns\n");

		// ARRAY ALEATORIO
		System.out.print("MergeSort Aleatório \t\t\t");
		arrayAuxiliar20 = array20_ordenadoAleatorio.clone();
		arrayDeTempos[3][2][0] = analisador.analisarMergeSort(arrayAuxiliar20, 0, 19);
		System.out.print(arrayDeTempos[3][2][0] + " ns\t\t");

		arrayAuxiliar200 = array20_ordenadoAleatorio.clone();
		arrayDeTempos[3][2][1] = analisador.analisarMergeSort(arrayAuxiliar200, 0, 199);
		System.out.print(arrayDeTempos[3][2][1] + " ns\t\t");

		arrayAuxiliar2000 = array20_ordenadoAleatorio.clone();
		arrayDeTempos[3][2][2] = analisador.analisarMergeSort(arrayAuxiliar2000, 0, 1999);
		System.out.print(arrayDeTempos[3][2][2] + " ns\n");

	}

	public static void preencherArray() {

		/*
		 * O acumulador é uma variável para ir somando para cada tamanho de
		 * entrada O acumulador do array de tamanho 20 é feito pela divisão de
		 * 8000 por 20 O mesmo serve para os outros tamanhos de array, 8000 /
		 * 200 e 8000/2000
		 */
		int acumulador20 = 0;
		int acumulador200 = 0;
		int acumulador2000 = 0;

		int tamanhoInicial = 1000000000;
		int tamanhoFinal = 1999999999;

		// preenchendo os arrays de tamanho 20
		int j = array20_ordenadoCrescente.length - 1;
		for (int i = 0; i < array20_ordenadoCrescente.length; i++) {
			array20_ordenadoCrescente[i] = tamanhoInicial + acumulador20;
			array20_ordenadoDecrescente[i] = tamanhoFinal - acumulador20;
			if (i % 2 == 0) {
				array20_ordenadoAleatorio[i] = array20_ordenadoCrescente[i];
			} else {
				array20_ordenadoAleatorio[i] = array20_ordenadoDecrescente[i];
			}
			acumulador20 = acumulador20 + 400;
			j = j - 1;
		}

		// preenchendo os arrays de tamanho 200
		j = array200_ordenadoCrescente.length - 1;
		for (int i = 0; i < array200_ordenadoCrescente.length; i++) {
			array200_ordenadoCrescente[i] = tamanhoInicial + acumulador200;
			array200_ordenadoDecrescente[i] = tamanhoFinal - acumulador200;
			if (i % 2 == 0) {
				array200_ordenadoAleatorio[i] = array200_ordenadoCrescente[i];
			} else {
				array200_ordenadoAleatorio[i] = array200_ordenadoDecrescente[i];
			}
			acumulador200 = acumulador200 + 40;
			j = j - 1;
		}

		// preenchendo os arrays de tamanho 200
		j = array2000_ordenadoCrescente.length - 1;
		for (int i = 0; i < array2000_ordenadoCrescente.length; i++) {
			array2000_ordenadoCrescente[i] = tamanhoInicial + acumulador2000;
			array2000_ordenadoDecrescente[i] = tamanhoFinal - acumulador2000;
			if (i % 2 == 0) {
				array2000_ordenadoAleatorio[i] = array2000_ordenadoCrescente[i];
			} else {
				array2000_ordenadoAleatorio[i] = array2000_ordenadoDecrescente[i];
			}
			acumulador2000 = acumulador2000 + 40;
			j = j - 1;
		}

	}

}
