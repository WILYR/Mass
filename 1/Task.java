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
		int sum = 0;
		for(int j = 0; j < mass.length; j++) {
			if(mass[j] % 2 == 0 && mass[j] > 0) {
				sum += mass[j];
			}
		}
		System.out.println("Сумма равна: " + sum);
	}
}