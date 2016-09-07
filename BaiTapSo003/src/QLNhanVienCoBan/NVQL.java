package QLNhanVienCoBan;

import java.util.Scanner;

public class NVQL extends  NhanVien2{

	Scanner sc=new Scanner(System.in);
	private double luongCB,heSo;

	public double getLuongCB() {
		return luongCB;
	}

	public void setLuongCB(double luongCB) {
		this.luongCB = luongCB;
	}

	public double getHeSo() {
		return heSo;
	}

	public void setHeSo(double heSo) {
		this.heSo = heSo;
	}
	
	public NVQL()
	{
		super();
		luongCB=heSo=0;
	}

	public NVQL(String hoTen,Ngay ngaySinh, String diaChi,double luongCB, double heSo)
	{
		super(hoTen, ngaySinh, diaChi);
		this.luongCB=luongCB;
		this.heSo=heSo;
	}

	public void nhap() {
		super.nhap();
		System.out.print("Luong co ban: ");
		luongCB=Double.parseDouble(sc.nextLine());
		
		System.out.print("He so: ");
		heSo=Double.parseDouble(sc.nextLine());
	}
	
	public void xuat() {
		super.xuat();
		System.out.println("Luong co ban: "+luongCB);
		System.out.println("He so: "+heSo);
	}

	@Override
	public double tinhLuong() {
		// TODO Auto-generated method stub
		return luongCB*heSo;
	}
















}
