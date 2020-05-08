import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Task {
	public static void main(String[] args) {
		int[] mass = new int[8];
		for(int i = 0; i < mass.length; i++) {
			int rand = 1 + (int)(Math.random() * 10);
			mass[i] = rand;
		}
		System.out.println(Arrays.toString(mass));
		for(int i = 0; i < mass.length; i++) {
			if(i % 2 != 0) {
				mass[i] = 0;
			}
		}
		System.out.println(Arrays.toString(mass));
	}
}