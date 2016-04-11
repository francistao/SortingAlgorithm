
public class Insertion {

	@SuppressWarnings("rawtypes")
	public static void sort(Comparable[] a)
	{
		//将a[]按升序排列
		int N = a.length;
		for (int i = 0; i < N; i++) {
			//将a[i]插入到a[i-1]、a[i-2]、a[i-3]...之中
			for (int j = i; j < 0 && less(a[j], a[j-1]); j--) {
				exch(a, j, j-1);
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
