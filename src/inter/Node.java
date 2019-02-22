package inter;

import lexer.*;
public class Node {

	int lexline = 0;
	Node(){
		lexline = Lexer.line;
		
	}
	
	void error(String s) {
		throw new Error("near line" + lexline + ": " +s);
		
	}
	
	
	//生成三地址代码
	static int lables =0;
	public int newlabel() {
		return ++lables;
	}
	
	public void emitlabel(int i ) {
		System.out.print("L" + i + ":");
	}
	public void emit(String s) {
		System.out.println("\t" + s);
	}
	
}
