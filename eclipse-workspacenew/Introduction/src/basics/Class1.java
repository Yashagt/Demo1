package basics;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {-5,8,-3,2,10,3,4};
		int sum=0;
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				sum1=a[i]+a[j];
				if(sum>sum1)//3
				{
					sum=sum1;
				}
			}
		}
System.out.println(sum);

	}

}
