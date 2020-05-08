import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Task {
	public static void main(String[] args) {
		int[] mass = new int[15];
		for(int i = 0; i < 15; i++) {
			int rand = (int)(Math.random() * 10);
			mass[i] = rand;
		}
		System.out.println(Arrays.toString(mass));
		int count = 0;
		for(int i = 0; i < mass.length; i++) {
			if(mass[i] % 2 == 0) {
				count++;
			}
		}
		System.out.println("В массиве " + count + " четных элементов");
	}
}