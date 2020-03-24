package com.jk.beans;

public class AA {

	private int a;
	private String aa;

	public AA() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AA(int a, String aa) {
		super();
		this.a = a;
		this.aa = aa;
	}

	@Override
	public String toString() {
		return "AA [a=" + a + ", aa=" + aa + "]";
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getAa() {
		return aa;
	}

	public void setAa(String aa) {
		this.aa = aa;
	}

}
