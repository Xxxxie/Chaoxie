package lexer;

//�������֡���ʶ�����ͷ��ϴʷ���Ԫ
//word ��ʶΪ <id,s> ����idΪ��ʶ���ı�ʶ 
public class Word extends Token{
	
	public final String lexeme;
	
	public Word(String s,int t) {
		super(t);
		lexeme = new String (s);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return lexeme;
	}
	
	public static final Word and = new Word("&&", Tag.AND),
			or = new Word("||",Tag.OR),
			eq = new Word("==", Tag.EQ),
			ne = new Word("!=", Tag.NE),
			le = new Word("<=", Tag.LE),
			ge = new Word(">=", Tag.GE),
			minus = new Word("-", Tag.MINUS),
			True = new Word("true", Tag.TRUE),
			False = new Word("false", Tag.FALSE),
			temp = new Word("t", Tag.TEMP);

	

}
