package edu.school;

import java.util.Scanner;

public class Masivi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner jjdavidki = new Scanner(System.in);
		int n = jjdavidki.nextInt();
		int m = jjdavidki.nextInt();
		int [] arr = new int[n];
		int [] arr2 = new int[m];
		for(int i=0; i<arr.length; i++) {
			arr[i] = jjdavidki.nextInt();
		}
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = jjdavidki.nextInt();
		}
		int j = 0;
		for(int i=0; i<arr.length; i++) {
			for(j=0; j<arr2.length; j++) {
				if(arr[i] == arr2[j]) {
					System.out.println(arr2[j]);
				}
			
			}
			j=0;
		
		}
	}

}
