package main;

import lexer.*;
import java.io.*;
import parser.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Lexer lex = new Lexer();
		Parser parse = new Parser(lex);
		parse.program();
		System.out.println();
	}

}


/*
test code:
{int i;int j;float x;float v;float[100] a;while(true){do i=i+1;while(a[j]<v);do j=j-1;while(a[j]>v);if(i>=j)break;x=a[i];a[i]=a[j];a[j]=x;}}
{
int i;
i=2;
}
*/
 

 