package lexer;


//num ��ʶΪ <num,value> ���� numΪ����
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
