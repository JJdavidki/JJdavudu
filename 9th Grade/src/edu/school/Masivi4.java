package edu.school;

import java.util.Scanner;

public class Masivi4 {

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
		int [] arr3 = new int[n+m];
		int br = 1;
		if(arr.length > arr2.length) {
			for(int j=0;j<arr2.length;j++) {
				arr3[br] = arr2[j];
				br = br+2;
			}
			br = 0;
			for(int i=0;i<arr2.length;i++) {
				arr3[br] = arr[i];
				br = br+2;
			}
			for(int k=arr2.length;k<arr.length;k++) {
				arr3[br] = arr[k];
				br++;
			}	
		}
		else {
			br=0;
			for(int i=0;i<arr.length;i++) {
				arr3[br] = arr[i];
				br = br+2;
			}
			br = 1;
			for(int j=0;j<arr.length;j++) {
				arr3[br] = arr2[j];
				br = br+2;
			}
			br=br-1;
			for(int k=arr.length;k<arr2.length;k++) {
				arr3[br] = arr2[k];
				br++;
			}
		}
		for(int r = 0;r<arr3.length;r++) {
			System.out.println(arr3[r]);
		}
		
	}

}
