package main;

import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner sc= new Scanner(System.in);
		String line = sc.nextLine();
		
		String[] parts = line.split("\\+");
		
		int []operandos= new int [parts.length];
		for (int i=0; i<parts.length;i++) {
			operandos[i]= Integer.parseInt(parts[i]);
			
		}
		for(int i=0; i<operandos.length-1;i++ ) {
			for (int j=1; j<operandos.length; j++) {
				int actual = operandos[j];
				int anterior = operandos[j-1];
				
				if(actual< anterior) {
					operandos[j]= anterior;
					operandos[j-1]= actual; 
					
				}
				
				
			}
			
		}
		
		String output= "";
		for(int num : operandos ) {
			output += num +"+";
		}
		
		output= output.substring(0, output.length()-1);
		System.out.print(output);
	}

}
