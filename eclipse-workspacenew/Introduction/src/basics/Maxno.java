package basics;

public class Maxno {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] a= {-12,7,90,-40,9,50};

		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int temp=0;
				if(a[i]<a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;

				}

			}
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
		System.out.println(a[2]);
		

	}
}
