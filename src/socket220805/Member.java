package socket220805;
import java.io.Serializable;

public class Member implements Serializable { // serializable 자바 개념의 직렬화이다.
	private static final long serialVersionUID = 1L;
	private String id;
	private String password;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}