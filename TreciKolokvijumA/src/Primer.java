
public class Primer {
	public int findFirst(int[] x, int y) {
		for (int i=x.length; i>0; i--) {
			if (x[i-1] == y) {
				return i+1;
			}
		}
		return -1;
	}
	// test: x = [2, 3, 5]; y = 2; Expected = 0

}
