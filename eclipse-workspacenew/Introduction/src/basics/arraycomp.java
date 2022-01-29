package basics;

import java.util.ArrayList;

public class arraycomp {

	public static void main(String[] args) {
		int[] a= {1,4,5,7};
		int[] b= {6,4,3,7};
		ArrayList<Integer> k=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
			{
				k.add(a[i]);
			}
		}
		
Object[] k1=k.toArray();//convert arraylist to array
for(int j=0;j<k1.length;j++)
{
	System.out.println(k1[j]);
}
//for(Object obj:k1)
//{
//	System.out.println(obj);
}//
	

}
