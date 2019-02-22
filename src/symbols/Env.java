package symbols;

import java.security.cert.PKIXRevocationChecker;
import java.util.*;
import lexer.*;
import inter.*;

//将字符串词法单元映射为类ID的对象  将同一环境中的变量放在一个栈中
public class Env {
	private Hashtable table;
	protected Env prev;
	public Env(Env n) {
		table = new Hashtable();
		prev = n;
	}
	
	public void put(Token w ,Id i) {
		table.put(w, i);
	}
	
	public Id get(Token w) {
		for(Env e = this; e!=null; e = e.prev) {
			Id found = (Id)(e.table.get(w));
			if(found != null) return found;
		}
		
		return null;
	}
}
