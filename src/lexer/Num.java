package lexer;


//num 标识为 <num,value> 其中 num为常量
public class Num extends Token{

	public final int value;
	public Num(int v) {
		super(Tag.NUM);
		value = v;
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return ""+ value;
	}
	
}
