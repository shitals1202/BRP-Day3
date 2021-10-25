package classwork.Day3;

import java.util.Scanner;
public class LargestandSmallest{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("how much elements you want to :");
		int num = sc.nextInt();
		isOperation(num);
		sc.close();
	}

	private static void isOperation(int num) {
		int temp;
		Scanner sc = new Scanner(System.in);
		int []array = new int[num];
		System.out.println("Enter the elements: ");
		for(int i = 0; i<num;i++) {
			array[i]=sc.nextInt();
		}
		for(int i =0; i<num;i++) {
			for(int j = i+1;j<num;j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i]= array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Second largest number: "+array[num-2]);
		System.out.println("Second smallest number: "+array[1]);
		sc.close();
	}
}