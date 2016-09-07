package QLNhanKhau;

import java.util.Scanner;

public class NhanKhau {
	protected String hoTen;
	protected Ngay ngaySinh;
	protected String gioiTinh;
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public Ngay getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Ngay ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	
	public NhanKhau()
	{
		this.hoTen="";
		this.ngaySinh=new Ngay();
		this.gioiTinh=""; 
	}
	
	public NhanKhau(String hoTen, Ngay ngaySinh, String gioiTinh)
	{
		this.hoTen=hoTen;
		this.ngaySinh=ngaySinh;
		this.gioiTinh=gioiTinh;
	}
	
	public void Nhap(Scanner sc)
	{
		System.out.print("Ho ten: ");
		this.hoTen=sc.nextLine();
		System.out.print("Ngay sinh: ");
		ngaySinh.Nhap(sc);
		System.out.print("Gioi tinh: ");
		this.gioiTinh=sc.nextLine();
	}
	
	public void Xuat()
	{
		System.out.println("Ho ten: " + this.hoTen);
		System.out.println("Ngay sinh: " + this.ngaySinh); 
		System.out.println("Gioi tinh: " + this.gioiTinh);
	}
}
