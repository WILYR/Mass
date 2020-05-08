import java.util.Scanner;
import java.util.Arrays;

public class Task {
	public static void main(String[] args) {
		int[] mass = new int[] { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		System.out.println(Arrays.toString(mass));
		for(int i = 0; i < mass.length; i++) {
			System.out.println(mass[i]);
		}
	}
}