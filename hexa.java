package hexaDecimal;

import java.util.Scanner;

public class hexa {
	public static int hexadecimal(String hexa)
	{
		String hstring = "0123456789ABCDEF";
		hexa=hexa.toUpperCase();
		int num=0;
		for(int i=0; i<hexa.length();i++)
		{
			char ch=hexa.charAt(i);
			int n = hstring.indexOf(ch);
			num= 16*num+n;		
		}
		return num;
	}
	public static String dechexa(int decimal)
	{
		int rem;
		String h="";
		char hexchr[]= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while(decimal>0)
		{
		rem = decimal%16;
		h = hexchr[rem]+h;
		decimal=decimal/16;
		}
		return h;
	}
	public static void main(String args[])
	{
		String user;
		int dec_num;
		Scanner scan= new  Scanner(System.in);
		//System.out.print("input");
		//user = scan.nextLine();
		//dec_num=hexadecimal(user);
		//System.out.println("output "+dec_num+"\n");
		int calc;
		int num1,num2,result = 0;
		System.out.println("select operator:-\n 1. Addition:-\n 2. Susbtract:-\n 3. Multiplication:-\n 4. Division:-\n ");
		calc = scan.nextInt();
		System.out.println("enter 1st num:-");
		String hex1=scan.next();		
		System.out.println("enter 2nd num:-");
		String hex2=scan.next();
		num1 = hexadecimal(hex1);
		num2 = hexadecimal(hex2);
		//CALCUTATOR
		switch(calc)
		{
		case 1:
			result = num1+num2;
		break;
		
		case 2:
			result = num1-num2;
			break;
			
		case 3:
			result = num1*num2;
			break;
			
		case 4:
			result = num1/num2;
			break;
			
		}
		System.out.println(" Result is = " + dechexa(result));

		}

}
