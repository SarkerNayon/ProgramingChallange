package javaChalenges;

public class CommonNumberInArray {

	public static void main(String[] args) {
		int ar1[] = { 12, 52, 02, 75, 5, 9 };
		int ar2[] = { 12, 65, 98, 43, 9, 35 };
		int cMon = 0;

		for (int i = 0; i < ar1.length; i++) {
			for (int j = 0; j < ar2.length; j++) {
				if (ar1[i] == ar2[j]) {
					cMon++;
				}
			}

		}
		System.out.println(cMon);

	}

}
