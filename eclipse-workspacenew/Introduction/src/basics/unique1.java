package basics;

import java.util.ArrayList;

public class unique1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<Integer>();
		int[] a= {4,4,5,6,8,9,8};

		for(int i=0;i<arr.size();i++)
		{
			int k=0;
			if(!arr.contains(a[i]))
			{
				arr.add(a[i]);
				k++;
				for(int j=i+1;j<arr.size();j++)
				{
					if(a[j]==a[i])
					{
						k++;
					}
				}

				if(k==1)
				{
					System.out.println(a[i]);
				}
			}

		}




	}
}
