import java.security.SecureRandom;

public class RandomInt {
	public static void main(String[] args) {
		SecureRandom sr = new SecureRandom();
		int i = sr.nextInt(1000);
		System.out.println(i);
	}
}
