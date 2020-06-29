package santhosh.mech.venkat.SanthoshJava.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class Secure 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		File file=new File("C:\\Users\\DOLL\\Desktop\\Java\\SonaMechJava\\Items.txt");
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Murphy mur=new Murphy("Venkat", new int[] {9888,3400,1200,9999,10999});
		oos.writeObject(mur);
		System.out.println("Serialization done");
		oos.close();
		fos.close();
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Murphy m=(Murphy)ois.readObject();
		ois.close();
		fis.close();
		System.out.println("What i got: "+m);
	}
}
class Murphy implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -349093345442742408L;
	String name;
	int[] prices;
	public Murphy(String n,int size) 
	{prices=new int[size];name=n;}
	public Murphy(String n,int[] yet) {name=n;prices=yet;}
	@Override
	public String toString() {
		return "Murphy [name=" + name + ", prices=" + Arrays.toString(prices) + "]";
	}
}
