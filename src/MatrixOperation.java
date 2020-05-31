import java.util.Scanner;

public class MatrixOperation {
	static Scanner sc=new Scanner(System.in);
	 public static int[][] create(int arr[][])
	 {	 System.out.println("-----------------------------------------------");
		 System.out.println("How many rows do u want:");
		 int r=sc.nextInt();
		 arr=new int[r][];
		 for(int i=0;i<arr.length;i++)
		 {
			System.out.println("How many columns do u want for "+(i+1)+" Row");
			arr[i]=new int[sc.nextInt()];
			
		 }
		 return arr;
	 }
	
	 public static int[][] accept(int arr[][])
	 {
		 	System.out.println("Insert values for matrix...");
		 	for(int i=0;i<arr.length;i++)
		 	{
		 			for(int j=0;j<arr[i].length;j++)
		 			{
		 				arr[i][j]=sc.nextInt();
		 			}
		 	}
		 	return arr;
	 }
	 
	 public static void display(int arr[][])
	 {
		 for(int i=0;i<arr.length;i++)
		 	{
		 			for(int j=0;j<arr[i].length;j++)
		 			{
		 				System.out.print(arr[i][j]+"\t");
		 			}
		 			System.out.println();
		 	}
		 System.out.println("----------------------------------------------");
	 
	 }
	 
	 public static int[][] addition(int arr[][],int arr2[][],int arr3[][])
	 {
		 for(int i=0;i<arr.length;i++)
		 {
			 
				 arr3=new int[arr.length][arr[i].length] ;
		 }
		
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=0;j<arr[i].length;j++)
			 {
				 arr3[i][j]=arr[i][j]+arr2[i][j];
			 }
		 }
		 return arr3;
	 }
	 
	 public static int[][] multiplication(int arr[][],int arr2[][],int arr3[][])
	 {
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=0;j<arr[i].length;j++)
			 {
				 arr3[i][j]=0;
			 for(int k=0;k<arr[i].length;k++)
			 {
				 arr3[i][j]=arr3[i][j]+arr[i][k]*arr2[k][j];
				 
			 }
		 }
	 }
	return arr3; 
	}
	 
	 public static int[][]  transpose(int arr[][],int arr2[][],int arr3[][])
	 {
		 	System.out.println("Transpose of matrix 1");
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=0;j<arr[i].length;j++)
			 {
				 
				arr3[j][i]=arr[i][j];
				
			}
			
		}
		return arr3;
	 }
}
