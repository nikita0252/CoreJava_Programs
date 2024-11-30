package SetGetUsingArray;

public class Test1 
{
	public static void main(String args[])
	{
		Array1 a = new Array1();
		a.setRollno(11);
		a.setName("pqr");
		Array1 a1 = new Array1();
		a1.setRollno(12);
		a1.setName("xyz");
		Array1 a2 = new Array1();
		a2.setRollno(13);
		a2.setName("abc");
		
		Array1 aa []= new Array1[3];
		aa[0]=a;
		aa[1]=a1;
		aa[2]=a2;
		
		for(int i=0;i<aa.length;i++)
		{
			System.out.println(aa[i].getRollno());
			System.out.println(aa[i].getName());
			
		}
		
	}

}
