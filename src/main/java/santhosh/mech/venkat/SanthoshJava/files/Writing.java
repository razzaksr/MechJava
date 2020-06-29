package santhosh.mech.venkat.SanthoshJava.files;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writing 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("C:\\Users\\DOLL\\Desktop\\Java\\SonaMechJava\\Santhosh.doc");
		FileOutputStream fos=new FileOutputStream(file);
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Tell us something to write: ");
		String hai=dis.readLine();
		//double yet=dis.readDouble();
		fos.write(hai.getBytes());
		System.out.println("Writing on file is done");
		dis.close();
		fos.close();
	}
}
