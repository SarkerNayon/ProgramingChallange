package javaChalenges;

public class BasicCalculator {
	int num = 100;

	public void calc(int num) {
		this.num = num * 10;
	}

	public void printNum() {
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		BasicCalculator obj = new BasicCalculator();
		obj.calc(2);
		obj.printNum();
	}

}
