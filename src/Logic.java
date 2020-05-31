
public class Logic {
	//System.out.println("1-Factor \n2-Factorial \n3-Prime \n4Reverse number "
//		+ "\n5Armstrong number \n6Magic number \n7base and power")
	public static void Factor(int n)
	{
		System.out.println("Factors of given number:");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
		
	}
	
	public static int Factorial(int n)
	{
		 int fact=1;
		while(n>1)
		{
			fact=fact*n;
			n=n-1;
		}
		return fact;
	}
	
	public static boolean Prime(int n)
	{
		boolean flag=false;
		for(int i=2;i<=n/2;++i)
		{	
			
			if(n%i==0)
			flag=true;
			
		}
		return flag;
	}
	
	public static int Reverse(int n)
	{
		int a=0,b=0,rn=0;
		while(n>0)
		{
			a=n/10;
			b=n%10;
			
		}
		rn=(b*10)+a;
		return rn;
	}
	
	public static void Armstrong(int n)
	{
			int c=0,a,temp=n;
			while(n>0)
			{
				a=n%10;
				n=n/10;
				c=c+(a*a*a);
			}
			if(temp==c)
				System.out.println("Armstrong number");
				else
					System.out.println("Not a Armstrong number");			
			
	}
	
	public static void Magic(int n)
	{
		int sum=0,num=n;
		 while(num>9)
		 {
		 sum=num;int s=0;
		 while(sum!=0)
		 {
		 s=s+(sum%10);
		 sum=sum/10;
		 }
		 num=s;
		 }
		 if(num==1)
		 {
		 System.out.println(n+" is a Magic Number.");
		 }
		 else
		 {
		 System.out.println(n+" is not a Magic Number.");
		 }
	}
	
	public static void Base(int b,int p)
	{
		int ans=0;
		for(int i=0;i<p;i++)
		{
			ans=b^p;
		}
		System.out.println("Answer is:"+ans);
	}
	}

