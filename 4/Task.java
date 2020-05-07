import java.util.Scanner;
import java.util.Arrays;

public class Task {
	public static void main(String[] args) {
		int[] mass;
		Scanner in = new Scanner(System.in);
		System.out.print("Введите количество элементов массива: ");
		int n = in.nextInt();
		mass = new int[n];
		for(int i = 0; i < mass.length; i++) {
			System.out.print("Введите " + i + "-ый элемент массива: ");
			mass[i] = in.nextInt();
		}
		int min = mass[0];
		int count = 0;
		for(int i = 0; i < mass.length; i++) {
			if(mass[i] < min) {
				min = mass[i];
				count = i;
			}
		}
		System.out.println("Первое минимальное число: " + min);
		int mass2[] = new int[mass.length - 1];
		for(int i = 0, k = 0; i < mass.length; i++) {
			if(i == count) {
				continue;
			}
			mass2[k++] = mass[i];
		}
		min = mass2[0];
		for(int j = 0; j < mass2.length; j++) {
			if(mass2[j] < min) {
				min = mass2[j];
			}
		}
		System.out.println("Второе минимальное число: " + min);
	}
}