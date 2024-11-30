package filehandling_ex;

import java.io.File;
import java.io.IOException;

public class LocationFile 
{
	public static void main(String args[]) throws IOException
	{
		File f =  new File("C:\\Users\\nikit_zyhz9dx\\OneDrive\\Desktop\\PracticeProgram","Z.txt");
		boolean b =f.createNewFile();
		System.out.println("File Created :"+b);
	}

}
