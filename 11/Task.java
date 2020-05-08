import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Task {
	public static void main(String[] args) {
		int n = 4;
		int[] mass = new int[n];
		for(int i = 0; i < mass.length; i++) {
			int rand = 10 + (int)(Math.random() * 89);
			mass[i] = rand;
		}
		System.out.println(Arrays.toString(mass));
		int count = 0;
		for(int i = 0; i < mass.length - 1; i++) {
			if(mass[i] < mass[i+1]) {
				count++;
			}
		}
		if(count == n-1) {
			System.out.println("Последовательность строго возрастающая");
		} else {
			System.out.println("Последовательность не строго возрастающая");
		}
	}
}