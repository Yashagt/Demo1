package basics;

public class Pyramid1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		*  *  *  *
//		*  *  *
//		*  *
//		*
		int length=5;
		
		for(int i=1;i<5;i++)//2
		{
			for(int j=1;j<length;j++)//1,2,3,4
			{
				System.out.print("*");
				System.out.print("\t");
			}
			System.out.println("");
			length--;
		}

	}

}
