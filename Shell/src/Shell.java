
public class Shell {

	@SuppressWarnings("rawtypes")
	public static void sort(Comparable[] a)
	{
		//将a[]按升序排列
		int N = a.length;
		int h = 1;
		while (h < N/3) {
			h = 3 * h + 1;
		}
		while (h >= 1) {
			//将数组变为h有序
			for (int i = h; i < N; i++) {
				//将a[i]插入到a[i-h],a[i-2*h],a[i-3*h]...之中
				for (int j = i; j >= h && less(a[j], a[j-h]); j-=h) {
					exch(a, j, j-h);
				}
				h = h/3;
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
