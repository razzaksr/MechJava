package santhosh.mech.venkat.SanthoshJava;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String dept="",batchOne="";double ctc=0.0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Tell us ur department: ");
        dept=scan.next();
        switch(dept)
        {
        case "mech":case "eee":System.out.println("Learn Embedded/ C/ Java");
        System.out.println("Tell us technology: ");
        batchOne=scan.next();
        switch(batchOne)
        {
        case "C":System.out.println("Product based companies, starts with 3.3LPA");break;
        case "Embedded":System.out.println("Product / service sectors offers from 2.8LPA");break;
        case "Java":System.out.println("Tell us desired salary range: ");
        ctc=scan.nextDouble();
        if(ctc>=2.5 && ctc<4.5) {System.out.println("Core @ Mindtree, TCS");}
        else if(ctc>=4.5 && ctc<7.5) {System.out.println("Advance,ERP @ CTS, InfoView");}
        else if(ctc>=7.5 && ctc<10.5) {System.out.println("Angular, MVC @ ZOHO, Amazon");}
        else if(ctc>=10.5) {System.out.println("FullStack @ Flipkart, Google");}
        else {System.out.println("No jobs are available");}
        }
        break;
        case "ece":case "eie":System.out.println("Learn Python/C");break;
        case "cse":case "it":case "ise":System.out.println("Learn Python/Java");break;
        default:System.out.println(dept+" is not available");
        }
    }
}
