package algoritmosDeOrdenacao;

public class AlgoritmosDeOrdenacao {
	
	private static int getDigit(int value, int digitPlace) {
		return ((value / digitPlace) % 10);
	}

	// MÉTODO BUBBLE SORT
	public int[] bubbleSort(int[] lista, int place) {

		boolean houveTroca = true;

		while (houveTroca == true) {
			houveTroca = false;
			for (int i = 0; i < (lista.length) - 1; i++) {
				int digito1 = getDigit(lista[i], place);
				int digito2 = getDigit(lista[i+1], place);
				
				if (digito1 > digito2) {
					int variavelAuxiliar = lista[i + 1];
					lista[i + 1] = lista[i];
					lista[i] = variavelAuxiliar;
					houveTroca = true;
				}
			}
		}

		return lista;
	}

	// MÉTODO INSERTION SORT
	public static int[] insertionSort(int[] lista, int place) {

		for (int i = 1; i < lista.length; i++) {
			int variavelAuxiliar = lista[i];
			int j = i;
			while (j > 0 && getDigit(lista[j - 1], place) > getDigit(variavelAuxiliar, place)) {
				lista[j] = lista[j - 1];
				j = j - 1;
			}
			lista[j] = variavelAuxiliar;
		}

		return lista;

	}

	// MÉTODO MERGE SORT
	public int[] mergeSort(int[] arrayEntrada, int p, int r) {

		int q;
		if (p < r) {
			q = (int) Math.floor((p + r) / 2);
			mergeSort(arrayEntrada, p, q);
			mergeSort(arrayEntrada, q + 1, r);
			megeSortIntercala(arrayEntrada, p, q, r);
		}
		return arrayEntrada;

	}
	

	public int[] megeSortIntercala(int[] arrayEntrada, int p, int q, int r) {

		int n = q - p + 1;
		int m = r - q;

		int L[] = new int[n + 1];
		int R[] = new int[m + 1];
		int i, j, k;

		for (i = 0; i < n; i++) {
			L[i] = arrayEntrada[p + i];
		}

		for (j = 0; j < m; j++) {
			R[j] = arrayEntrada[q + j + 1];
		}

		L[n] = Integer.MAX_VALUE;
		R[m] = Integer.MAX_VALUE;

		i = 0;
		j = 0;
		for (k = p; k <= r; k++) {

			if (L[i] <= R[j]) {
				arrayEntrada[k] = L[i];
				i = i + 1;
			} else {
				arrayEntrada[k] = R[j];
				j = j + 1;
			}
		}

		return arrayEntrada;
	}

	// MÉTODO COUNTING SORT
	public int[] countingSort(int[] arrayA, int k) {

		int[] arrayB = new int[arrayA.length];
		int[] arrayC = new int[k + 1];

		for (int i = 1; i <= k; i++) {
			arrayC[i] = 0;
		}

		for (int j = 0; j < arrayA.length; j++) {
			arrayC[arrayA[j]] = arrayC[arrayA[j]] + 1;
		}

		for (int i = 1; i < k + 1; i++) {
			arrayC[i] = arrayC[i] + arrayC[i - 1];
		}

		for (int j = (arrayA.length - 1); j >= 0; j--) {
			arrayB[arrayC[arrayA[j]] - 1] = arrayA[j];
			arrayC[arrayA[j]] = arrayC[arrayA[j]] - 1;
		}
		return arrayB;

	}

}
