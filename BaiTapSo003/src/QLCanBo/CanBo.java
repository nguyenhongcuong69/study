package QLCanBo;

import java.util.Scanner;

public abstract class CanBo {
	private String hoTen;
	private int namSinh;
	private String gioiTinh;
	private String diaChi;
	
	public String getHoTen()
	{
		return this.hoTen;
	}	
	public void setHoTen(String hoTen)
	{
		this.hoTen=hoTen;
	}	
	public int getNamSinh()
	{
		return this.namSinh;
	}	
	public void setNamSinh(int namSinh)
	{
		this.namSinh=namSinh;
	}	
	public String getGioiTinh()
	{
		return this.gioiTinh;
	}	
	public void setGioiTinh(String gioiTinh)
	{
		this.gioiTinh=gioiTinh;
	}	
	public String getDiaChi()
	{
		return this.diaChi;
	}
	public void setDiaChi(String diaChi)
	{
		this.diaChi=diaChi;
	}

	public CanBo(){
		this.hoTen="";
		this.namSinh=0;
		this.gioiTinh="";
		this.diaChi="";
	}

	public CanBo(String hoTen, int namSinh, String gioiTinh, String diaChi)
	{
		this.hoTen=hoTen;
		this.namSinh=namSinh;
		this.gioiTinh=gioiTinh;
		this.diaChi=diaChi;
	}

	public void Nhap(Scanner sc)
	{
		System.out.print("Ho ten: ");
		this.hoTen=sc.nextLine();
		
		System.out.print("Nam sinh: ");
		this.namSinh=sc.nextInt();
		sc.nextLine();
		
		System.out.print("Gioi tinh: ");
		this.gioiTinh=sc.nextLine();
		
		System.out.print("Dia chi: ");
		this.diaChi=sc.nextLine();
	}

	public void Xuat()
	{
		System.out.println("Ho ten: " + getHoTen());
		System.out.println("Nam sinh: " + getNamSinh());
		System.out.println("Gioi tinh: " + getGioiTinh());
		System.out.println("Dia chi: " + getDiaChi());
	}































}
