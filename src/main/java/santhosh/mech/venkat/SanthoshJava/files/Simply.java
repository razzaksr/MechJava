package santhosh.mech.venkat.SanthoshJava.files;

import java.io.File;
import java.io.IOException;

public class Simply 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("C:\\Users\\DOLL\\Desktop\\Java\\SonaMechJava\\VenkatTest.xls");
		file.createNewFile();
		System.out.println("File Created @"+file.getAbsolutePath());
		System.out.println(file.getName());
	}
}
