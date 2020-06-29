package santhosh.mech.venkat.SanthoshJava.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Reading 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("C:\\Users\\DOLL\\Desktop\\Java\\SonaMechJava\\Convertor.java");
		FileInputStream fis=new FileInputStream(file);
		/*byte[] temp=new byte[fis.available()];
		fis.read(temp);
		System.out.println(new String(temp));*/
		int temp=0;
		while((temp=fis.read())!=-1)
		{
			System.out.print((char)temp);
		}
		fis.close();
	}
}
