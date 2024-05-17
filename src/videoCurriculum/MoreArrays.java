package videoCurriculum;

import java.util.Scanner;

public class MoreArrays {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		
		String[] products = new String [4];
		 
		for (int i = 0;i<products.length;i++) {
			System.out.print("Enter product name: ");   
			 products[i] = sc.nextLine();  
		}
		
		
		System.out.println("\n");
		System.out.println("Productos disponibles: ");
		int o=1;
		for(String product : products) {
			
			System.out.print(o +" - "+product+"\n");
			o++;
		}

	}

}
