package edu.school;

import java.util.Scanner;

public class Masivi6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner jjdavidki = new Scanner(System.in);
		int [] arr = new int[10];
		for(int i =0; i<arr.length; i++){
			arr[i] = jjdavidki.nextInt();
		}
		int worst = arr[0];
		int best = arr[0];
		System.out.println("Най-силни:");
		for(int j=0;j<arr.length;j++){
			if(arr[j]>=best) {
			best = arr[j];
			}
		}
			for(int k=0;k<arr.length;k++){
				if(arr[k] == best) {
					System.out.println(k);
				}
			}
			System.out.println("Най-слаби:");
			for(int j=0;j<arr.length;j++){
				if(arr[j]<=worst) {
				worst = arr[j];
				}
			}
				for(int k=0;k<arr.length;k++){
					if(arr[k] == worst) {
						System.out.println(k);
					}
				}
			
	}

}
