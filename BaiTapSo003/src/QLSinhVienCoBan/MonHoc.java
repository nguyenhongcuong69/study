package QLSinhVienCoBan;

import java.util.Scanner;

public class MonHoc {
	Scanner sc=new Scanner(System.in);
	private int maMH;
	private String tenMH;
	private int soTinChi;
	private double diemThi;
	public int getMaMH() {
		return maMH;
	}
	public void setMaMH(int maMH) {
		this.maMH = maMH;
	}
	public String getTenMH() {
		return tenMH;
	}
	public void setTenMH(String tenMH) {
		this.tenMH = tenMH;
	}
	public int getSoTinChi() {
		return soTinChi;
	}
	public void setSoTinChi(int soTinChi) {
		this.soTinChi = soTinChi;
	}
	public double getDiemThi() {
		return diemThi;
	}
	public void setDiemThi(double diemThi) {
		this.diemThi = diemThi;
	}
	
	public MonHoc() {
		// TODO Auto-generated constructor stub
		maMH=0;
		tenMH="";
		soTinChi=0;
		diemThi=0;
	}

	public MonHoc(int maMH, String tenMH, int soTinChi, double diemThi){
		this.maMH=maMH;
		this.tenMH=tenMH;
		this.soTinChi=soTinChi;
		this.diemThi=diemThi;
	}
	
	public void nhap() {
		System.out.print("Ma mon hoc: ");
		maMH=Integer.parseInt(sc.nextLine());
		
		System.out.print("Ten mon hoc: ");
		tenMH=sc.nextLine();
		
		System.out.print("So tin chi: ");
		soTinChi=Integer.parseInt(sc.nextLine());
		
		System.out.print("Diem thi: ");
		diemThi=Double.parseDouble(sc.nextLine());
	}
	
	public double tinhTongDiemMon()
	{
		return getSoTinChi()*getDiemThi();
	}
	public String toString()
	{
		return String.format("Ma mon hoc: %d\t\t Ten mon hoc: %s\t\t So tin chi: %d\t\t Diem thi: %.2f", getMaMH(), getTenMH(), getSoTinChi(), getDiemThi());
	}
	
	
	public double quyDoiDiem() {
		
		if(diemThi>=8.5&&diemThi<=10)
			return 4;
		if (diemThi>=7.7&&diemThi<8.5) 
			return 3.5;
		if (diemThi>=7.0&&diemThi<7.7) 
			return 3;
		if (diemThi>=6.2&&diemThi<7) 
			return 2.5;
		if (diemThi>=5.5&&diemThi<6.2) 
			return 2;
		if (diemThi>=4.7&&diemThi<5.5) 
			return 1.5;
		if (diemThi>=4.0&&diemThi<4.7) 
			return 1;
		else 
			return 0;
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
