package basics;

public class NoOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I am Java";
		char[] ch=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(str.contains("\s"))
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
