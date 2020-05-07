import java.util.Scanner;

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
		float sr = 0;
		for(int j = 0; j < mass.length; j++) {
			sr += mass[j];
		}
		sr = sr/mass.length;
		System.out.println("Среднее арифметическое: " + sr);
		for(int k = 0; k < mass.length; k++) {
			if(mass[k] < sr) {
				System.out.println("Элемент меньше среднего арифметического: " + mass[k]);
			}
		}
	}
}