package a1611;

import java.util.Random;

public class ex2 {
	public static void main(String[] args) {
		Random rn = new Random();
		int arr[][] = new int[4][4];
		int arr2[][] = new int[4][4];
		
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				arr[i][j] = rn.nextInt(10);
				arr2[i][j] = rn.nextInt(10);
			}
		}
		System.out.println("\n\n\nMATRIZ 1:");
		for(int i=0; i<4; i++) {
			System.out.printf("\n");
			for(int j=0; j<4; j++) {
					System.out.printf(arr[i][j] +" ");
				}
			}
		System.out.println("\n\n\nMATRIZ 2:");
		for(int i=0; i<4; i++) {
			System.out.printf("\n");
			for(int j=0; j<4; j++) {
				System.out.printf(arr2[i][j] +" ");
			}
		}
		
		System.out.println("\n\n\nMATRIZ FINAL:");
		for(int i=0; i<4; i++) {
			System.out.printf("\n");
			for(int j=0; j<4; j++) {
				if(arr[i][j]>arr2[i][j]) {
					System.out.printf(arr[i][j] +" ");
				}else {
					System.out.printf(arr2[i][j] +" ");
					
				}
			}
		}
		
		
	}

}
