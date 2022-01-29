package basics;

public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2  4  5
		3  4  7
		1  2  9*/
		
		int a[][]= {{2,4,5},{3,4,7},{1,2,9}};
		int temp=a[0][0];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(temp<a[i][j]);
				{
					temp=a[i][j];
				}
			}
		}
		System.out.println(temp);

	}

}
