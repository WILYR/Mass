import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Task {
	public static void main(String[] args) {
		int n = 5;
		int[] mass = new int[n];
		int[] mass2 = new int[n];
		for(int i = 0; i < mass.length; i++) {
			int rand = (int)(Math.random() * 6);
			mass[i] = rand;
		}
		for(int i = 0; i < mass2.length; i++) {
			int rand = (int)(Math.random() * 6);
			mass2[i] = rand;
		}

		System.out.println(Arrays.toString(mass));
		System.out.println(Arrays.toString(mass2));

		int count = 0;
		double sr1;
		for(int i = 0; i < mass.length; i++) {
			count += mass[i];
		}
		sr1 = (double)count / mass.length;
		System.out.println(sr1);
		int count2 = 0;
		double sr2;
		for(int i = 0; i < mass2.length; i++) {
			count2 += mass2[i];
		}
		sr2 = (double)count2 / mass2.length;
		System.out.println(sr2);
		if(sr1 == sr2) {
			System.out.println("Средние арифметические равны");
		} else if(sr1 > sr2) {
			System.out.println("Среднее арифметическое первого больше второго");
		} else if(sr1 < sr2) {
			System.out.println("Среднее арифметическое второго больше первого");
		}
	}
}
