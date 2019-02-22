package inter;

import lexer.Token;
import lexer.*;
import symbols.*;


public class And extends Logical{

	public And(Token tok,Expr p1,Expr p2) {
		super(tok,p1,p2);
	}
	
	public void jumping(int t,int f) {
		int label = t != 0 ? t:newlabel();
		
		expr1.jumping(label,0);
		expr2.jumping(t, f);
		if (t == 0 )emitlabel(label);
	}
}
