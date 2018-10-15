package edu.school;

import java.util.Scanner;

public class Masivi7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner jjdavidki = new Scanner(System.in);
		int n = jjdavidki.nextInt();
		int [] arr = new int[n];
		for(int i =0; i<arr.length; i++){
			arr[i] = jjdavidki.nextInt();
		}
		int k = jjdavidki.nextInt();
		int [] arr2 = new int[k];
		for(int i =0; i<arr2.length; i++){
			arr2[i] = jjdavidki.nextInt();
		}
		int br = 0;
		for(int j = 0;j<arr2.length;j++) {
			for(int b=0;b<arr.length;b++) {
				if(arr2[j] == arr[b]) {
					br++;
					break;
				}
			}
		}
		if(br == arr2.length) {
			System.out.println("Съдържа го");
		}
		else {
			System.out.println("Не го съдържа");
		}
		
	}

}
