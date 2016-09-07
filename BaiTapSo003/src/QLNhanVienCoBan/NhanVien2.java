package QLNhanVienCoBan;

import java.util.Scanner;

public abstract class NhanVien2{

	Scanner sc=new Scanner(System.in);
	protected String hoTen;
	protected Ngay ngaySinh;
	protected String diaChi;
	
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public NhanVien2()
	{
		hoTen="";
		ngaySinh=new Ngay();
		diaChi="";
	}
	
	public NhanVien2(String hoTen,Ngay ngaySinh, String diaChi)
	{
		this.hoTen=hoTen;
		this.diaChi=diaChi;
		this.ngaySinh=ngaySinh;
	}
	
	public void nhap()
	{
		System.out.print("Ho ten: ");
		hoTen=sc.nextLine();
//		System.out.print("Ngay sinh: ");
//		ngaySinh.nhap();
		System.out.print("Dia chi: ");
		diaChi=sc.nextLine();
	}

	public void xuat()
	{
		System.out.println("Ho ten: " + hoTen);
//		System.out.println("Ngay sinh: " + ngaySinh); 
		System.out.println("Dia chi: " + diaChi);
		System.out.println("Tong luong: "+ tinhLuong());
	}
	
	public abstract double tinhLuong();
	
	
	
	
	
	
	
	
	
}	
	

	

