package santhosh.mech.venkat.SanthoshJava.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class Socket 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("C:\\Users\\DOLL\\Desktop\\Java\\SonaMechJava\\Santhosh.zip");
		FileOutputStream fos=new FileOutputStream(file);
		DeflaterOutputStream dos=new DeflaterOutputStream(fos);
		String hai="Venkat and santhosh gonna learn zip file concapts";
		dos.write(hai.getBytes());
		dos.close();
		fos.close();
		System.out.println("Zip done");
		FileInputStream fis=new FileInputStream(file);
		InflaterInputStream iis=new InflaterInputStream(fis);
		byte[] temp=new byte[fis.available()];
		iis.read(temp);System.out.println("Unzipped:\n"+new String(temp));
		iis.close();fis.close();
	}
}
