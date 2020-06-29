package santhosh.mech.venkat.SanthoshJava.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Appendingg 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner scan=new Scanner(System.in);
		File file=new File("C:\\Users\\DOLL\\Desktop\\Java\\SonaMechJava\\Santhosh.doc");
		FileInputStream fis=new FileInputStream(file);
		byte[] temp=new byte[fis.available()];
		fis.read(temp);String exists=new String(temp);
		System.out.println("Tell us something to add: ");
		String data=scan.nextLine();
		exists+=data;
		fis.close();
		FileOutputStream fos=new FileOutputStream(file);
		fos.write(exists.getBytes());
		System.out.println("Appended");
		fos.close();
	}
}
