package socket_classinfo;

import java.io.Serializable;

public class ClassInfo implements Serializable { // serializable 자바 개념의 직렬화이다.
	private static final long serialVersionUID = 1L;
	String id, name = null;
	int kor = 0, eng = 0, math = 0;
	
	public ClassInfo() {}
	public ClassInfo(String id, String name, int kor, int eng, int math) {this.id = id;this.name = name;this.kor = kor;this.eng = eng;this.math = math;}
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getKor() {return kor;}
	public void setKor(int kor) {this.kor = kor;}
	public int getEng() {return eng;}
	public void setEng(int eng) {this.eng = eng;}
	public int getMath() {return math;}
	public void setMath(int math) {this.math = math;}
	@Override
	public String toString() {return "ClassInfo [id=" + id + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";}
	
}
