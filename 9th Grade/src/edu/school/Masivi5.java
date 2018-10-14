package edu.school;

import java.util.Scanner;

public class Masivi5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner jjdavidki = new Scanner(System.in);
		int n = jjdavidki.nextInt();
		int [] arr = new int[n];
		for(int i =0; i<arr.length; i++){
			arr[i] = jjdavidki.nextInt();
		}
		int [] arr11 = new int[n];
		for(int i =0; i<arr11.length; i++){
			arr11[i] = arr[i];
		}
		int [] arr2 = new int[n];
		int smallest = arr[0];
		for(int j=0;j<arr.length;j++) {
			if(arr[j]<smallest) {
				smallest = arr[j];
			}
		}
		int biggest = arr[0];
		int zapazeno = 0;
		for(int k=0;k<arr.length/2;k++) {
			for(int l=0;l<arr.length;l++) {
				if(arr[l]>=biggest) {
					biggest = arr[l];
					zapazeno = l;
				}
			}
			arr2[k] = biggest;
			arr[zapazeno] = smallest;
			biggest = arr[0];
		}
		int biggest2 = arr11[0];
		for(int j=0;j<arr11.length;j++) {
			if(arr11[j]>biggest2) {
				biggest2 = arr11[j];
			}
		}
		int smallest2 = arr11[0];
		for(int k=arr11.length/2;k<arr11.length;k++) {
			for(int l=0;l<arr11.length;l++) {
				if(arr11[l]<=smallest2) {
					smallest2 = arr11[l];
					zapazeno = l;
				}
			}
			arr2[k] = smallest2;
			arr11[zapazeno] = biggest2;
			smallest2 = arr11[0];
		}
		for(int g=0;g<arr2.length;g++) {
			System.out.println(arr2[g]);
		}
		
	}

}
