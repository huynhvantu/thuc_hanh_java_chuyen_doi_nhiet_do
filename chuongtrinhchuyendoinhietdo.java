package chuong_trinh_chuyen_doi_nhiet_do;

import java.util.Scanner;

public class chuongtrinhchuyendoinhietdo {	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double doC;
		double doF;
		int choice;
		
		do {
			System.out.println("Menu.");
			System.out.println("1. Do F chuyen sang do C");
			System.out.println("2. Do c chuyen sang do F");
			System.out.println("0. Exit");
			System.out.println("Enter your choice:");
			choice = input.nextInt();
			
			
			switch(choice) {
			case 1:
				System.out.println("Nhap vao do F can chuyen sang do C");
				doF = input.nextDouble();
				System.out.println(doF+" Do F doi sang do C la: "+chuyendoFsangdoC(doF));
				break;
			case 2:
				System.out.println("Nhap vao do C can chuyen sang do F");
				doC = input.nextDouble();
				System.out.println(doC+ " Do C doi sang do F la: "+chuyendoCsangdoF(doC));
				break;
			case 0:
				System.exit(0);
			}
		
		}while(choice != 0);

	}
	
	public static double chuyendoCsangdoF(double doC) {
		double doF = (9.0/5) * doC +32;
		return doF;
	}
	public static double chuyendoFsangdoC(double doF) {
		double doC = (5.0/9) * (doF -32);
		return doC;
	}

}
