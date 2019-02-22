package inter;

public class Stmt extends Node{
	public Stmt() {}
	
	public static Stmt Null = new Stmt();
	public void gen(int b,int a) {}  //调用时的参数是语句开始出的标号和语句的下一条指令的标号
	int after =0;  //保运语句的下一条指令的标点
	public static Stmt Enclosing = Stmt.Null; // 拥有break语句

}
