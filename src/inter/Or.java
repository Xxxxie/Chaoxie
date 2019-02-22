package inter;

import lexer.*;
import symbols.*;



public class Or extends Logical{

	public Or(Token tok,Expr p1,Expr p2) {
		super(tok,p1,p2);
	}
	
	public void jumping(int t,int f) {
		int label = f != 0 ? f:newlabel();
		
		expr1.jumping(0, label);
		expr2.jumping(t, f);
		if (f == 0 )emitlabel(label);
	}
	
}
