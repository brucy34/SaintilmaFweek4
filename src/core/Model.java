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
		int result=Controller.PGCD(tab);
		if(result==-1)
			System.out.println("On ne peut calculer ce pgcd");
		else
			System.out.println("Le pgcd de ces nombres est "+result);
	}
	
	public static void response3()
	{
		int result=Controller.PPMC(tab);
		if(result==-1)
			System.out.println("On ne peut calculer ce ppmc");
		else
			System.out.println("Le ppmc de ces nombres est "+result);
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
				 System.out.println("Entrez la quantite de nombre");
				 tab=new int [View.scan().nextInt()];
			     System.out.println("Veuillez entrez les nombres");
			     for(int i=0;i<tab.length;i++)
			     {
			    	 tab[i]=View.scan().nextInt();
			     }
			     Controller.PGCD(tab);
			     response2();
			   }break;
		case 4:{
			     System.out.println("Entrez la quantite de nombre");
			     tab=new int [View.scan().nextInt()];
		         System.out.println("Veuillez entrez les nombres");
		         for(int i=0;i<tab.length;i++)
		         {
		    	    tab[i]=View.scan().nextInt();
		         }
		         Controller.PPMC(tab);
		         response3();
			   }break;
		}
	}
}
