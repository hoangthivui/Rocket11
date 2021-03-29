package com.vti.Question02.entity.ex5_q4;

public class TapChi extends  TaiLieu{
	private int soPhatHanh;
	private int thangPhatHanh;
	
	public TapChi() {	
	}
	
	public TapChi(int soPhatHanh, int thangPhatHanh) {
		super();
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}

	public int getSoPhatHanh() {
		return soPhatHanh;
	}
	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}
	public int getThangPhatHanh() {
		return thangPhatHanh;
	}
	public void setThangPhatHanh(int thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}
	
	
}
