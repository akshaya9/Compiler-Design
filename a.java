package labsheet1;

import java.util.Scanner;

public class a {
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] a = input.split(" ");
		
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			if(a[i].equals("+") || a[i].equals("-") || a[i].equals("*") || a[i].equals("/") || a[i].equals("%"))
				System.out.println("Arithmetic operators");
			else if(a[i].equals("||") || a[i].equals("&&") || a[i].equals("!=="))
				System.out.println("Logical operators");
			else if(a[i].equals("="))
				System.out.println("Assignment operators");
			else if(a[i].equals("("))
				System.out.println("Left paranthesis");
			else if(a[i].equals(")"))
				System.out.println("Right paranthesis");
			else if(a[i].equals("{")) 
				System.out.println("Left curly braces");
			else if(a[i].equals("}"))
				System.out.println("Right curly braces");
			else if(a[i].equals("integer") || a[i].equals("char") || a[i].equals("string") || a[i] .equals("float"))
				System.out.println("datatypes");
			else if(a[i].equals("var") || a[i].equals("main"))
				System.out.println("keywords");
			else if(a[i].equals("input"))
				System.out.println("input function");
			else if(a[i].equals("output"))
				System.out.println("Output function");
			else {
				
				for(int j=0;j<a[i].length();j++) {
					int t= (int) a[i].charAt(j);
					if((t>=65&&t<=90)||(t>=97&&t<=122)&&j==0)
						c++;
					else if((t>=65&&t<=90)||(t>=97||t<=122)&&j>0&&(t>=48||t<=57))
						c++;
						
				}
					
				if(c==a[i].length()) {
					System.out.println("Identifiers");
				}
			}
		}
	}
}
		
	

