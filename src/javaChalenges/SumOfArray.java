package javaChalenges;

public class SumOfArray {

	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 5 };
		int sum = 0;

		for (int i = 0; i < ar.length+1; i++) {
			sum = i + sum;
			
		}
		System.out.println(sum);

	}

}
