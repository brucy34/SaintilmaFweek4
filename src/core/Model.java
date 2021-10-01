package core;

public class Model {
	
	private static int number;
	private static int number1;
	private static int tab[];
	
	public static int getNumber1() {
		return number1;
	}
	public static void setNumber1(int number1) {
		Model.number1 = number1;
	}
	public static int getNumber() {
		return number;
	}
	public static void setNumber(int number) {
		Model.number = number;
	}
	
	
	
	public static void response()
	{
		int result = Controller.primeNumber(number);
		
		if(result==-1)
			System.out.println("Ce nombre n'est pas premier");
		else
			System.out.println("Ce nombre est premier");
	}
	
	public static void response1()
	{
		int result=Controller.factorial(number);
		System.out.println("Le factorielle de ce nombre est"+result);
	}
	
	public static void response2()
	{
		int result=Controller.PGCD(number, number1);
		if(result==-1)
			System.out.println("On ne peut calculer ce pgcd");
		else
			System.out.println("Le pgcd de ces nombres est "+result);
	}
	
	public static void choiceOfFonc()
	{
		switch(View.choice())
		{
		case 1:{
				 System.out.println("Entrez le nombre");
				 number=View.scan().nextInt();
				 Controller.primeNumber(number);
				 response();
			   }break;
		case 2:{
			     System.out.println("Entrez le nombre");
			     number=View.scan().nextInt();
			     Controller.primeNumber(number);
			     response1();
		       }break;
		case 3:{
			     System.out.println("Veuillez entrez les nombres");
			     number=View.scan().nextInt();
			     number1=View.scan().nextInt();
			     Controller.PGCD(number, number1);
			     response2();
			   }break;
		}
	}
}
