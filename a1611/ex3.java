package a1611;

import java.util.Random;
import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Random rn = new Random();
		int arr[][] = new int[5][5];
		int busca, contador=0;
		
		for(int i=0; i<5; i++) {
			System.out.printf("\n");
			for(int j=0; j<5; j++) {
				arr[i][j] = rn.nextInt(50);
				System.out.printf(arr[i][j] +" ");
			}
		}
		
		System.out.println("\n\nDigite o número que deseja buscar: ");
		busca = ler.nextInt();
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(busca==arr[i][j]) {
					System.out.println("O número está na linha " +(i+1) +" x coluna " +(j+1));
				}else {
					contador++;
				}
			}
		}
		
		if(contador>=25) {
			System.out.println("O número não está na matriz!");
		}	
	}
}
