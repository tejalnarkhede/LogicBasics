import java.util.*;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a=new Area();
		Logic b=new Logic();
		Scanner sc=new Scanner(System.in);
		int ch;
		String str=null;
		
		do
		{
				System.out.println("**** Main Menu ****");
				System.out.println("1- AREA");
				System.out.println("2- LOGICS");
				System.out.println("3- ARRAY OPERATIONS");
				System.out.println("Enter your choice:");
				ch=sc.nextInt();
				switch(ch)
				{
				case 1:
					do
					{
					System.out.println("1- Area of circle \n2- Area of Triangle \n3- Area of Rectangle");
					System.out.println("Enter your choice:");
					ch=sc.nextInt();
					switch(ch)
					{
					case 1:
						System.out.println("Enter radius for circle:");
						System.out.println("Area of circle is:"+a.circleArea(sc.nextFloat()));
						break;
					case 2:
						System.out.println("Enter base and height for triangle:");
						System.out.println("Area of Triangle is:"+a.triangleArea(sc.nextFloat(),sc.nextFloat()));
						break;
					case 3:
						System.out.println("Enter length and breadth for rectangle:");
						System.out.println("Area of rectangle is:"+a.rectangleArea(sc.nextFloat(),sc.nextFloat()));
						break;
					}
					System.out.println("Do you want to continue in Area menu:");
					str=sc.next();
				}while(str.equals("yes"));
				break;
					
				case 2:
					do
					{
					System.out.println("1-Factor \n2-Factorial \n3-Prime \n4Reverse number \n5Armstrong number \n6Magic number \n7base and power");
					System.out.println("Enter your choice:");
					int ch1=sc.nextInt();
					
					switch(ch1)
					{
					case 1:
						System.out.println("Enter number for finding its factors:");
						b.Factor(sc.nextInt());
						break;
					case 2:
						System.out.println("Enter number for finding its factorial:");
						System.out.println("Factorial is:"+b.Factorial(sc.nextInt()));
						break;
					case 3:
						System.out.println("Enter number to determine it is prime or not:");
						int c=sc.nextInt();
						boolean flag=b.Prime(c);
						if(flag)
						{
							System.out.println("Number is Not Prime");
						}
						else
						{
							System.out.println("Number is prime");
						}
						break;
					case 4:
						System.out.println("Enter number to print its reverse:");
						System.out.println("Reverse number is:"+b.Reverse(sc.nextInt()));
						break;
					case 5:
						System.out.println("Enter number to determine it is Armstrong or not:");
						b.Armstrong(sc.nextInt());
						break;
					case 6:
						System.out.println("Enter number to determine it is magic number or not:");
						b.Magic(sc.nextInt());
						break;
					case 7:
						System.out.println("Enter base and power to find its answer:");
						b.Base(sc.nextInt(),sc.nextInt());
						break;
					}
					System.out.println("Do you want to continue in logic menu:");
					str=sc.next();
					}while(str.equals("yes"));
					break;
				
				case 3:
					
					System.out.println("1-1D Array operations \n2-2D Array operations");
					System.out.println("Enter your choice:");
					int ch1=sc.nextInt();
					switch(ch1)
					{
					case 1:
						int n=0,s=0;
						int arr[]=new int[20];
						do
						{
						System.out.println("\n1-Create \n2-Display \n3-Search \n4-Insert \n5-Delete");
						ch=sc.nextInt();
						switch(ch)
						{
						case 1:System.out.println("Enter how many elements do you want:");
								n=sc.nextInt();
								System.out.println("Enter the +n numbers in array:");
								for(int i=0;i<n;i++)
								{
									arr[i]=sc.nextInt();
								}
								break;
						
						case 2:ArrayOperation.Display(arr,n);
								break;
							
						case 3:System.out.println("Enter element to search :");
								s=sc.nextInt();
								boolean d=ArrayOperation.Search(arr,n,s);
								if(d)
								{
									System.out.println("Element is found");
								}
								else
								{
									System.out.println("Element is Not found");
								}
								break;
								
						case 4:System.out.println("Enter element and position to insert:");
								int ele=sc.nextInt();
								int pos=sc.nextInt();
								n=ArrayOperation.Insert(arr,n,ele,pos);
								break;
								
						case 5:System.out.println("Enter position to delete number from array:");
								int p=sc.nextInt();
								n=ArrayOperation.Delete(arr,n,p);
								break;
								
						}
						System.out.println("Do you want to continue in array 1d operations:");
						str=sc.next();
						}while(str.equals("yes"));
						System.out.println("Thanks for visiting 1D operations");
						break;
						
					case 2:
					//MatrixOperation m=new MatrixOperation(); 
					do
					{
					System.out.println("\n1-Create \n2-Display \n3-Addition of matrices \n4-Multiplication of matrices \n5-Transpose of matrix");
					System.out.println("Enter Your choice:");
					ch1=sc.nextInt();
					switch(ch1)
					{
					case 1:
						int [][]arr1=null,arr2=null,arr3=null;
						System.out.println("*********  Create matrix...  ***********");
						arr1=MatrixOperation.create(arr1);
						arr2=MatrixOperation.create(arr2);
						
						System.out.println("********* Accept values in matrix *********");
						arr1=MatrixOperation.accept(arr1);
						arr2=MatrixOperation.accept(arr2);
						
						System.out.println("********* Display matrix ********** ");
						MatrixOperation.display(arr1);
						MatrixOperation.display(arr2);
						
						arr3=MatrixOperation.addition(arr1,arr2,arr3);
						System.out.println("********* Addition of matrices *********");
						MatrixOperation.display(arr3);
						
						arr3=MatrixOperation.multiplication(arr1,arr2,arr3);
						System.out.println("********* Multiplication of matrices *********");
						MatrixOperation.display(arr3);
						
						arr3=MatrixOperation.transpose(arr1,arr2,arr3);
						System.out.println("********* Transpose of matrices *********");
						MatrixOperation.display(arr3);
											
					}
					System.out.println("Do you want to continue 2d operations:");
					str=sc.next();
					}while(str.equals("yes"));
					System.out.println("Thanks for visiting 2D operations");
				}	
			}//main switch
		System.out.println("Do you want to continue in Main Menu:");
		str=sc.next();
		}while(str.equals("yes"));
		System.out.println("Thank You visit again");
	}
}




	
