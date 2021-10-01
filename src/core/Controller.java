package core;

public class Controller {
	
	
	public static int primeNumber(int number)
	{
		int flag=1,i=2;
		
		if(number<=1)
			return -1;
		else 
		{

			while(i<number/2)
			{
				if((number % i)==0)
						flag=0;
				i++;
			}
			if(flag==0)
				return -1;
			else
				return 1;
		}
    
		
	}
	
	public static int factorial(int number)
	{
		if(number==0)
			return 1;
		else
			return number*factorial(number-1);
	}
	
//	public static int PGCD(int[]arNumber)
//	{
//		
//	}

}
