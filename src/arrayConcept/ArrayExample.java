package arrayConcept;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class ArrayExample {

	public static void main(String[] args) {
		
		ArrayExample obj = new ArrayExample();
		obj.arrayPrintExample();
		obj.loopArray();
		obj.forEachLoop();
		obj.printArray();
		obj.containsArray();
		obj.concatenateArrays();
		obj.reverseArray();
		obj.removeArray();
		obj.sortArray();
		obj.arrayEqual();
		obj.twoDimensioanlArry();
		

	}
	public void arrayPrintExample() {
		/*Array is an object. Arrays are used to store multiple values in a single variable,
		Insted of declaring separate variables for each value*/
		
		//print aray by index number
		int a[]= {1,2,3,4,5};
		System.out.println(a[4]);
		
		// Another way to store array with new keyword sepcified the storage
		String[] aArray = new String[5];
		aArray[0]="hello";
		aArray[1]="hello";
		aArray[2]="hello";
		aArray[3]="hello";
		aArray[4]="hello";
		System.out.println(aArray[3]);
		
		//Another way of declaring string array
		String[] bArray = {"a","b","c","d","e"};
		String[] cArray = {"a","b","c","d","e"};
		
		System.out.println(bArray[3]);
		System.out.println(cArray[4]);
	}
	//we can use loop for printing an array
	public void loopArray() {
		
		int a[]= {1,2,3,4,5};
		System.out.println(a.length);
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
	//for each loop for with array
	public void forEachLoop() {
		int a[] = {10,20,30,40,50,60,70,80,90,100};
		//datatype should be match
		for(int num:a) {
			System.out.println(num);
		}
	}
	//print an array method
	public void printArray() {
		
		int a[] = {10,20,30,40,50,60,70,80,90,100};// we converting int to string and now it is singe value
		
		//System.out.println(a); it will give memory location thats why we need to convert it to sting.
		
		String num = Arrays.toString(a);//tostring is static method we are calling by class array
		
		System.out.println(num);
		
	}
	//containsArry method with string
	public void containsArray() {
		
		String a[] = {"a","b","c","d","e"};
		boolean result = Arrays.asList(a).contains("d");
		System.out.println(result);
		
	}
	//contains array with wrapper class
	public void containsArrayWrapper() {
		//obj work only with object thats why we need to use primitive data wrapper calss type otherwise it will give false.
		Integer a[] = new Integer[]{10,20,30,40,50,60,70,80,90,100};
		boolean result = Arrays.asList(a).contains(90);
		System.out.println(result);
	}
	//concatenate two arrays
	public void concatenateArrays() {
		
		int[] intArry = {1,2,3,4,5};
		int[] intArray2 = {6,7,8,9,10};
		int[] combinedIntArray = ArrayUtils.addAll(intArry, intArray2);
		//int a = combinedIntArray.length;
		
		for(int a:combinedIntArray) {
			System.out.println(a);
		}
		/* for loop
		for(int i=0; i<a; i++) {
			System.out.println(i);
		}*/
		
	}
	//reverse an Array
	public void reverseArray() {
		
		int[] intArray = {1,2,3,4,5,6,7,8,9,10};
		
		ArrayUtils.reverse(intArray);
		System.out.println(Arrays.toString(intArray));
		
	}
	//remove element of an Array
	public void removeArray() {
		
		int[] intArray = {1,2,3,4,5,6,7,8,9,10};
		
		int[]remove = ArrayUtils.removeElement(intArray, 3);
		
		String rem = Arrays.toString(remove);
		
		System.out.println(rem);
		
	}
	//Array sort method
	public void sortArray() {
		
		int a[] = {100,2,400,5,50};
		
		Arrays.sort(a);
		
		for(int x:a) {
			System.out.println(x);
		}
		
	}
	// Arrays equal method
	public void arrayEqual() {
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5};
		
		System.out.println(Arrays.equals(a, b));
		
	}
	//Multidimensioanal array
	public void twoDimensioanlArry() {
		
		int[][] number = {{1,2,3,4,},{5,6,7,8},{9,10,11,13}};
		
		int size = number.length;
		
		for(int row=0; row<size; row++) {
			
			for(int col=0; col<number[row].length; col++) {
				
				System.out.print(number[row][col]);
			}		}	
		
		}
	
}
