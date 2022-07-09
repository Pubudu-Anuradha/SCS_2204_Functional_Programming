public class Question3 {
	public static void main(String[] args) {
		int a = 2, b = 3, c = 4, d = 5;
		float k = 4.3f;
		float g = 4.0f;
		System.out.println(--b * a + c * d--);
		System.out.println(a++);
		System.out.println(-2 * (g - k) + c);
		System.out.println(c = c++);
		System.out.println(c = ++c * a++);
	}
}