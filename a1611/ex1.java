package a1611;

import java.util.Random;

public class ex1 {
	public static void main(String[] args) {
		Random rn = new Random();
		int[][] arr = new int[20][10];
		int[][] arr2 = new int[20][10];
		int[] totalC = new int[10];
		int soma=0;
		
		for(int i=0; i<20; i++) {
			soma = 0;
			for(int j=0; j<10; j++) {
				arr[i][j] = rn.nextInt(10);
				totalC[j] +=arr[i][j];
			}
		}
		
		for(int n=0; n<20; n++) {
			System.out.printf("\n");
			for(int g=0; g<10; g++) {
				System.out.printf(arr[n][g] +"  ");
			}
		}
		System.out.printf("\n------------ SOMA ------------\n");
		for(int m=0; m<10; m++) {
			System.out.printf(totalC[m] +" ");
		}
		System.out.printf("\n-------- MULTIPLICAÇÃO --------\n");
		for(int i=0; i<20; i++) {
			soma = 0;
			for(int j=0; j<10; j++) {
				arr2[i][j] =arr[i][j]*totalC[j];
			}
		}
		for(int n=0; n<20; n++) {
			System.out.printf("\n");
			for(int g=0; g<10; g++) {
				System.out.printf(arr2[n][g] +"  ");
				}
			}
		}

	}
