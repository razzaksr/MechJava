package santhosh.mech.venkat.SanthoshJava.files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Readers 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("C:\\Users\\DOLL\\Desktop\\Java\\SonaMechJava\\Parsing.java");
		FileReader reader=new FileReader(file);
		int temp=0;
		while((temp=reader.read())!=-1)
		{
			System.out.print((char)temp);
		}
		reader.close();
	}
}
