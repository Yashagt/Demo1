package basics;

public class SortAscDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,6,1,4,9};
		for(int i=0;i<a.length;i++)//desc
		{
			int temp=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];//swap
					a[j]=temp;
				}
			}
		}
for(int k=0;k<a.length;k++)
{
	System.out.println(a[k]);
}
	}

}
