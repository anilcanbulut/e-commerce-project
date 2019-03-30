import java.util.Scanner;

public class User {
	private String username;
	private String e_mail;
	private int Coin;
	private String password;
	
	public User(String username, String e_mail, int bonus_Coin, String password) {
		super();
		this.username = username;
		this.e_mail = e_mail;
		Coin = bonus_Coin;
		this.password = password;
	}
	public User() {
		
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getE_mail() {
		return e_mail;
	}
	
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	
	public int get_Coin() {
		return Coin;
	}
	
	public void set_Coin(int bonus_Coin) {
		Coin = bonus_Coin;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
	
}
