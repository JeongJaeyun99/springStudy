package com.multi.mvc05;

public class FruitDTO {
	private String fruit1;
	private String fruit2;
	private String fruit3;
	private String fruit4;
	private String fruit5;
	
	public String getFruit1() {
		return fruit1;
	}
	public void setFruit1(String fruit1) {
		this.fruit1 = fruit1;
	}
	public String getFruit2() {
		return fruit2;
	}
	public void setFruit2(String fruit2) {
		this.fruit2 = fruit2;
	}
	public String getFruit3() {
		return fruit3;
	}
	public void setFruit3(String fruit3) {
		this.fruit3 = fruit3;
	}
	public String getFruit4() {
		return fruit4;
	}
	public void setFruit4(String fruit4) {
		this.fruit4 = fruit4;
	}
	public String getFruit5() {
		return fruit5;
	}
	public void setFruit5(String fruit5) {
		this.fruit5 = fruit5;
	}
	@Override
	public String toString() {
		return "FruitDTO [fruit1=" + fruit1 + ", fruit2=" + fruit2 + ", fruit3=" + fruit3 + ", fruit4=" + fruit4
				+ ", fruit5=" + fruit5 + "]";
	}
	
}
