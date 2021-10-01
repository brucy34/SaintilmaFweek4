package core;

public class Model {
	
	private static int number;
	
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
		}
	}
}
