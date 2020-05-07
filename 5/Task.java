import java.util.Scanner;
import java.util.Arrays;

public class Task {
	public static void main(String[] args) {
		int[] mass;
		int a = 2;
		int b = 5;
		Scanner in = new Scanner(System.in);
		System.out.print("Введите количество элементов массива: ");
		int n = in.nextInt();
		mass = new int[n];
		for(int i = 0; i < mass.length; i++) {
			System.out.print("Введите " + i + "-ый элемент массива: ");
			mass[i] = in.nextInt();
		}
		for(int i = mass.length - 1 ; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(mass[j] > a && mass[j] < b) {
					int tmp = mass[j];
					mass[j] = mass[j+1];
					mass[j+1] = tmp;
				}
			}
		}
		for(int i = 0; i< mass.length; i++) {
			if(mass[i] > a && mass[i] < b) {
				mass[i] = 0;
			}
		}
		System.out.println(Arrays.toString(mass));
	}
}