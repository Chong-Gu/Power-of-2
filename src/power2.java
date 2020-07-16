
public class power2 {
	public static void main(String[] args) {
		pow2(99, 1);
	}
	
	private static void pow2(int n, int x) {
		if (n <= 0) {
			System.out.println("No powers!");
			return;
		}
		
		System.out.println(x);
		if (x*2 <= n)
			pow2(n, x*2);
	}
}
