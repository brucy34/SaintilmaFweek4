package core;

import java.util.*;


public class View {
	
	
	public static Scanner scan()
	{
		Scanner scan=new Scanner(System.in);
		return scan;
	}
	
	
	public static void menu()
	{
		System.out.println("\n=====================================================================================================");
		System.out.println("Soyez le/la bienvenu(e) dans ce petit programme");
		System.out.println("\n Veuillez choisir une fonctionnalite");
		System.out.println("\n1.-Tester la primalite d'un nombre\n"+
							 "2.-Calculer la factorielle d'un nombre\n"+
						     "3.-Calculer le PGCD de n entiers\n"+
							 "4.-Calculer le PPMC de n entiers\n"+
						     "5.-Effectuer la recherche dans une liste\n"+
							 "6.-Empiler et depiler une liste par la methode LIFO");
		System.out.println("=====================================================================================================");
		
	}
	
	public static int choice()
	{
		int choice;
		choice=scan().nextInt();
		return choice;
	}
	
//	public static int number()
//	{
//		
//		
//
//	}
	
	
	
	public static void isPrime(int result)
	{
		if(result==-1)
			System.out.println("Le nombre n'est pas premier");
		else
			System.out.println("Le nombre est premier");
	}

}
