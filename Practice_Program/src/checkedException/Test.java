package checkedException;

public class Test {
      public static void main(String args[])
      {
    	  try {
    	  System.out.println("Start Searching");
    	  Class.forName("checkedException.ABC");
    	  System.out.println("class loaded");
      }
      catch(ClassNotFoundException e)
      {
    	  System.out.println(e);
      }
}
}
