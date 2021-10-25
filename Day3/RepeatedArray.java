package classwork.Day3;

import java.util.Scanner;

public class RepeatedArray{
	public static void main(String[] args) {
		//int[] numArray = {2, 6, 7, 6, 2, 19, 1, 19};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements u want:");
		int n = sc.nextInt();
		int [] numArray= new int [10];
		System.out.println("Enter the number of elements:");
		for(int i = 0;i<n;i++) {
			numArray[i] = sc.nextInt();
		}
	    isDuplicate(numArray);
	    sc.close();
	}

	private static void isDuplicate(int[] numArray) {
		for(int i = 0; i < numArray.length; i++){
		      for(int j = i + 1; j < numArray.length; j++){
		        if(numArray[i] == numArray[j]){
		          System.out.println("Duplicate element found " + numArray[j]);
		        }		
	}
}
}
}