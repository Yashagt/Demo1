package basics;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int num=sc.nextInt();
		//should be divisible by itself and 1
		for(int i=2;i<num;i++)
		{
		
		if(!((num%i)==0))
		{
			System.out.println("Prime");
		}
		

	}

}
}
