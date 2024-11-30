package filehandling_ex;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String args[])throws IOException
	{
		File f = new File("A.txt");
		boolean b = f.createNewFile();
		System.out.println("File Created :"+b);
	}

}
