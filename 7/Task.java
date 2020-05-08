import java.util.Scanner;
import java.util.Arrays;

public class Task {
	public static void main(String[] args) {
		int[] mass;
		int count = 0;
		for(int i = 0, a = 0; i < 100; i++) {
			if(i % 2 != 0) {
				count++;
			}
		}
		mass = new int[count];
		for(int i = 0, a = 0; i < 100; i++) {
			if(i % 2 != 0) {
				mass[a] = i;
				a++;
			}
		}
		System.out.println(Arrays.toString(mass));
		for(int j = 0;j < mass.length/2;j++) {
			int tmp = mass[mass.length - j - 1];
			mass[mass.length - j - 1] = mass[j];
			mass[j] = tmp;
		}
		System.out.println(Arrays.toString(mass));
	}
}