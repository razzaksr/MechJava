package santhosh.mech.venkat.SanthoshJava.oop;

import java.util.Arrays;

// bean/ entity/ business/ pojo/ encapsulated
public class Account 
{
	private String username,password;
	private String[] kart,orders;private int pin;
	public Account() {}
	
	public Account(String username, String password, String[] kart, String[] orders, int pin) {
		super();
		this.username = username;
		this.password = password;
		this.kart = kart;
		this.orders = orders;
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Account [username=" + username + ", password=" + password + ", kart=" + Arrays.toString(kart)
				+ ", orders=" + Arrays.toString(orders) + ", pin=" + pin + "]";
	}

	public void setUsername(String username)
	{
		this.username=username;
	}
	public String getUsername()
	{
		return username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String[] getKart() {
		return kart;
	}
	public void setKart(String[] kart) {
		this.kart = kart;
	}
	public String[] getOrders() {
		return orders;
	}
	public void setOrders(String[] orders) {
		this.orders = orders;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
}
