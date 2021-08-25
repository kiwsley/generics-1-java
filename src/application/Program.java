package application;

import java.util.Scanner;

import services.printService;

/* Alterado no dia 24/08/2021, Esse programa foi copiado do nelio para estudo do assunto generics, com o objetivo 
 * de trazer beneficio como Reuso, Type Safety e Peformace*/

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		printService<Integer> ps = new printService<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		
		
		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}

		ps.print();
		Integer x = ps.first();
		System.out.println("First: " + x);
		
		sc.close();
	}

	}


