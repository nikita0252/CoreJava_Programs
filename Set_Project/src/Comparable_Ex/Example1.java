package Comparable_Ex;


public class Example1 implements Comparable<Example1>
{
		private int rollno;
		private String name;
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public int compareTo(Example1 e)
		{
			
		 return this.rollno-e.rollno;
		 //return this.name.comapreTo(e.name);t
		}
		
		
	}


