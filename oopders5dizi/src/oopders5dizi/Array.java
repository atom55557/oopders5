package oopders5dizi;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] doubleArray= {8.4,9.3,0.2,7.9,3.4};
		Arrays.sort(doubleArray);
		System.out.printf("%nDouble array");
		for(double value:doubleArray) {
			System.out.printf("%1.f",value);
		}
		int[] filledIntArray=new int[10];
		Arrays.fill(filledIntArray,7);
		displayArray(filledIntArray,"filledIntArray");
		int[] intArray= {1,2,3,4,5,6};
 		int[] intArrayCopy=new int[intArray.length];
 		System.arraycopy(intArray, 0, intArrayCopy, 0,intArray.length);
 		displayArray(intArray,"intArray");
 		displayArray(intArrayCopy,"intArrayCOpy");
 		
 		boolean b=Arrays.equals(intArray,intArrayCopy);
 		System.out.printf("%nIntArray %s intArrayCopy%n",(b?"==":"!="));
 		
 		b=Arrays.equals(intArray,filledIntArray);
 		System.out.printf("%nIntArray %s intArrayCopy%n",(b?"==":"!="));
 		

	}

	private static void displayArray(int[] array, String string) {
		// TODO Auto-generated method stub
		System.out.printf("%n%s",string);
		
		for(int value:array) {
			System.out.printf("%d ",value);
		}
		
	}

}
