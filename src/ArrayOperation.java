
public class ArrayOperation {

	public static int Delete(int a[],int n,int p)
	{
		for(int i=p-1;i<n-1;i++)
		{
			a[i]=a[i+1];
			
		}
		int y=a[p-1];
		return n=n-1;
	}
	
	public static void Display(int a[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public static boolean Search(int a[],int n,int ele)
	{
		boolean b=false;
		for(int i=0;i<n;i++)
		{
			if(a[i]==ele)
				b=true;
			
		}
		return b;
	}
	
	public static int Insert(int a[],int n,int ele,int pos)
	{
		for(int i=n-1;i>=pos-1;i--)
		{
			a[i+1]=a[i];
		
		}
		a[pos-1]=ele;
		return n=n+1;
	}
}
