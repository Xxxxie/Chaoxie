//2019.2.18
//将中缀表达式转化为后缀表达式

import java.io.*;

import javax.swing.LookAndFeel;

class Parser{
	static int lookahead;
	
	public Parser() throws IOException{
		lookahead = System.in.read();
	}
	
	void expr() throws IOException{
		term();
		while (true){
			if (lookahead == '+') {
				match('+');
				term();
				System.out.print('+');
			}
			
			else if (lookahead == '-') {
				match('-');
				term();
				System.out.print('-');
			}
			else if (lookahead =='<') {
				
				int tmpahead = lookahead;
				lookahead = System.in.read();
				
				if(lookahead == '=') {
					match('=');
					term();
					System.out.print("<=");
				}else {
					//match('<');
					term();
					System.out.print('<');
				}
				
			}
			
			else if (lookahead == '/')    //检测注释 // /**/
			{
				lookahead = System.in.read();
				if(lookahead == '/')
				{
					lookahead =System.in.read();
					while (lookahead !='\n')
					{
						lookahead=System.in.read();
					}
				}
				else if(lookahead =='*') 
				{
					lookahead = System.in.read();
					boolean flag = true;
					while(flag)
					{
						lookahead=System.in.read();
						if(lookahead == '*')
						{
							lookahead = System.in.read();
							if(lookahead == '/')
							{
								flag = false;
							}
						}
					}
					
				}
				
				
				
				
			}
			else {
			
			}
		}
	}
	
	void term() throws IOException{
		if (Character.isDigit((char)lookahead)) {
			System.out.print((char)lookahead);
			match(lookahead);
		}
		else {
			throw new Error("syntax error");
		}
	}
	
	void match(int t) throws IOException{
		if (lookahead == t) lookahead = System.in.read();
		else throw new Error("syntax error");
		
	}
	
}




public class Postfix {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Parser parser = new Parser();
		parser.expr();
		System.out.print('\n');
	}

}
