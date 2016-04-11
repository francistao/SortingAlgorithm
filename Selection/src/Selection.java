
public class Selection {

	@SuppressWarnings("rawtypes")
	public static void sort(Comparable[] a)
	{
		//将a[]按升序排列
		int N = a.length;
		for (int i = 0; i < N; i++) {
			int min = i;
			//将a[i]和a[i+1...N]中的最小的元素交换
			for (int j = i+1; j < N; j++) {
				if(less(a[j], a[min])) min = j;
				exch(a, i, min);
			}
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static boolean less(Comparable v, Comparable w) {
        return (v.compareTo(w) < 0);
    }
	
	private static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

}
