
public class Arrays {

	public static void swapLargestAndSmallest(int[] a) {
		int min = 0, max = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > a[min]) {
				min = i;
			}
			if (a[i] < a[max]) {
				max = i;
			}
		}

		int temp = a[min];
		a[min] = a[max];
		a[max] = temp;
	}
}