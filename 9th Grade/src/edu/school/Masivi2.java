package edu.school;

import java.util.Scanner;

public class Masivi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner jjdavidki = new Scanner(System.in);
		int n = jjdavidki.nextInt();
		int [] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = jjdavidki.nextInt();
		}
		int smallestsum = arr[0] + arr[1];
		int j = 0;
		for(int i=0; i<arr.length; i++) {
			for(j=1; j<arr.length; j++) {
				if(arr[i] + arr[j] < smallestsum) {
					smallestsum = arr[i] + arr[j];
				}
			
			}
			j=0;
		
		}
		System.out.println(smallestsum);
	}

}
