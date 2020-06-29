package santhosh.mech.venkat.SanthoshJava.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writers 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File("C:\\Users\\DOLL\\Desktop\\Java\\SonaMechJava\\Spring.txt");
		FileWriter writer=new FileWriter(file);
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us something? ");
		String data=scan.nextLine();
		writer.write(data);
		writer.flush();
		writer.close();
		scan.close();
	}
}
