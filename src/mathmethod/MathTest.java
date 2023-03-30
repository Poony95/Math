package mathmethod;

public class MathTest {
	public static void main(String[] args) {
		System.out.println(Math.PI);
		int a = -5;
		int b = 5;
		System.out.println(Math.abs(a));
		System.out.println(Math.abs(b));
		
		double c = 32.2;
		double d = Math.ceil(c);  //무조건 올림수
		System.out.println(c);
		System.out.println(d);
		
		double e = 32.9;
		double f = Math.floor(e); //무조건 버림수
		System.out.println(e);
		System.out.println(f);
		double g = Math.round(e); //반올림
		System.out.println(g);
		
		int h = (int)Math.pow(2,3);
		System.out.println(h);
		
		int i = Math.max(20, 30);
		System.out.println(i);
	}
}
