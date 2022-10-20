package MerhodExample;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.x = 100;
		cal.y = 200;
		cal.sum1();
		System.out.println("************");
		
		int result = cal.sum2();
		System.out.println(result);
		System.out.println(cal.sum2());
		System.out.println("************");
		
		int sum = cal.sum3(10,23);
		System.out.println(sum);
		System.out.println(cal.sum3(10, 23));
		System.out.println("*************");
		
		//overloading
		cal.sum(12.66f, 13);
		cal.sum(10, 34);
		cal.sum(12, 67,90);
		cal.sum(12, 56.98f);

	}

}
