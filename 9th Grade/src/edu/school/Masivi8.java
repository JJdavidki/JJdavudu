package edu.school;

import java.util.Scanner;

public class Masivi8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner jjdavidki = new Scanner(System.in);
		int n = jjdavidki.nextInt();
		int [] arr = new int[n];
		for(int i =0; i<arr.length; i++){
			arr[i] = jjdavidki.nextInt();
		}
	    int [] arr0 = new int[n];
	    for(int i =0; i<arr0.length; i++){
			arr0[i] = arr[i];
		}
	    int [] arrbig = new int[n];
	    int [] arrfinal = new int[n];
	    int biggest = arr[0];
		for(int j=0;j<arr.length;j++) {
			if(arr[j]>biggest) {
				biggest = arr[j];
			}
		}
			int smallest = arr[0];
			int zapazeno = 0;
			for(int g=0;g<arrbig.length;g++) {
				for(int k=0;k<arr.length;k++) {
					if(arr[k]<=smallest) {
					smallest = arr[k];
					zapazeno = k;
					}
				}
				arrbig[g] = smallest;
				arr[zapazeno] = biggest;
				smallest = arr[0]+1;
			}
			int br = 0;
			 for(int f=0;f<arrbig.length;f++) {
				 for(int d=0;d<arrbig.length;d++) {
					 if(arr[f] == arr[d]) {
						 br++;
					 }
				 }
				 if(br-1>arr0.length+1/2) {
					 break;
				 }
				 br=0;
			 }
			 if(br!=0) {
				 System.out.println("Cant do");
			 }
			 else {
				 int golqmo = arrbig.length - 1;
				 int malko = 0;
				 for(int v=0;v<arrbig.length;v++) {
					 if(v%2==0) {
						 arrfinal[v] = arrbig[golqmo];
						 golqmo = golqmo-1;
					 }
					 else {
						 arrfinal[v] = arrbig[malko];
						 malko++; 
					 }
				 }
			 }
			 System.out.println("Can do");
			for(int u=0;u<arrfinal.length;u++) {
				System.out.println(arrfinal[u]);
			}
		}
	}


