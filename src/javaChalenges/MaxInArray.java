package javaChalenges;

import java.util.Scanner;

public class MaxInArray {

	public static void main(String[] args) {
		int n, max;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Please defien the size of the array");
			n = scanner.nextInt();
			int a[] = new int[n];
			System.out.println("please enter some nomber followed by the enter key");

//	To find the max number in a array
			
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
			}
			max = a[0];
			
			for (int i=0; i<n; i++) {
				
				if (max < a[i]) {
					max = a[i];
				}
			}
		}
		System.out.println("The Biggest number in this array is " + max);

//	To find the min number in a array
//		int min = a[0];
//		for (int i = 0; i < a.length; i++) {
//			if (min > a[i]) {
//				min = a[i];
//			}
//		}
//		System.out.println("The smallest number in this array is " + min);
	}
}
