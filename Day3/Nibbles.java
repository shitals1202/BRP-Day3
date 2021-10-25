package classwork.Day3;

import java.util.Scanner;

public class Nibbles{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Decimal Value");
		int decimal = sc.nextInt();
		toBinary(decimal);
		   swapNibbles(decimal);
		sc.close();
	}

	private static void swapNibbles(int decimal) {
	  int nibble =((decimal & 0x0F) << 4 | (decimal & 0xF0) >> 4);
	   System.out.println("Value after swap: "+nibble);
	}

	private static void toBinary(int decimal) {
		int binary[] = new int[40];
		int index =0;
		while(decimal>0) {
			binary[index++] =decimal%2;
			decimal = decimal/2;
		}
		System.out.print("Binary value=");
		for(int i =index-1;i>=0;i--) {
			System.out.print(binary[i]);
		}
		System.out.println();

	}

	
}