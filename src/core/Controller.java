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
	
	public static int PGCD(int aNumber,int bNumber)
	{
		int pgcd,res;
		while(aNumber==0 || bNumber==0)
		{
			return -1;
		}
		if(aNumber<bNumber)
		{
			int temp=aNumber;
			aNumber=bNumber;
			bNumber=temp;
		}
		else if(aNumber==bNumber)
		{
			pgcd=aNumber;
			return pgcd;
		}
		res=aNumber%bNumber;
			while(res!=0)
			{
				aNumber=bNumber;
				bNumber=res;
				res=aNumber%bNumber;
			}
			if (res==0)
			{
				pgcd=bNumber;
				return pgcd;
			}
		return -1;
	}
	
	public static int PGCD(int[] tab)
	{
		int pgcd=PGCD(tab[0],tab[1]);
		for(int i=2;i<tab.length;i++)
		{
			pgcd=PGCD(pgcd,tab[i]);
		}
		return pgcd;
	}
	
	public static int PPMC(int aNumber,int bNumber)
	{
		int ppmc;
		if(aNumber==bNumber)
		{
			ppmc=0;
			return ppmc;
		}
		else
		{
			ppmc=(aNumber*bNumber)/PGCD(aNumber,bNumber);
			return ppmc;
		}
		
		
	}
	
	public static int PPMC(int[] tab)
	{
		int ppmc=PPMC(tab[0],tab[1]);
		for(int i=2;i<tab.length;i++)
		{
			ppmc=PPMC(ppmc,tab[i]);
		}
		return ppmc;
	}
	

}
