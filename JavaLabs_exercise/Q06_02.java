package JavaLabs_exercise;

/**
 * <pre>
 * 2. 撰寫一個方法: long factorial(int n)，它可傳回n的階乘。 
 * 
 * &#64;author SisolShie
 * </pre>
 */
public class Q06_02 {

	public static void main(String[] args) {

		Q06_02 step = new Q06_02();
		System.out.println(step.factorial(5));
	}

	long factorial(int n) {

		long ans = 1;
		for (var i = 1; i <= n; i++) {
			System.out.println(i + " " + ans);
			ans *= i;
		}
		return ans;

	}

}
