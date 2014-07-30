public class MergeSort {

	public static void main(String[] args) {

		int A[] = new int[] {6,   4,  2, 11, 22, 67, 54,32, 21, 11,  1,  2,  5,  9};
		MergeSorts(A, 0, A.length - 1);
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		// 
		// 
	}

	public static void MergeSorts(int[] a, int p, int q) {

		if (p < q) {
			int r = (p + q) / 2;
			MergeSorts(a, p, r);
			MergeSorts(a, r + 1, q);
			Merge(a, p, r, q);
		}

	}

	public static void Merge(int a[], int p, int q, int r) {

		int n1 = q - p + 1;
		int n2 = r - q;

		int L[] = new int[n1 + 1];
		int R[] = new int[n2 + 1];

		for (int i = 0; i < n1; i++) {
			L[i] = a[i + p];
		}
		L[n1] = Integer.MAX_VALUE;

		for (int i = 0; i < n2; i++) {
			R[i] = a[q + i + 1];
		}
		R[n2] = Integer.MAX_VALUE;

		int i = 0;
		int j = 0;
		for (int k = p; k <= r; k++) {
			if (L[i] < R[j]) {
				a[k] = L[i];
				i++;
			} else{
				a[k] = R[j];
				j++;
			}
		}
	}

}
