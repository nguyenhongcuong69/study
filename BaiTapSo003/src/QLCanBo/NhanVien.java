package QLCanBo;

import java.util.Scanner;

public class NhanVien extends CanBo{
	private String congViec;

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}
	
	public NhanVien()
	{
		super();
		this.congViec="";
	}

	public NhanVien(String hoTen, int namSinh, String gioiTinh, String diaChi, String congViec)
	{
		super(hoTen, namSinh, gioiTinh, diaChi);
	}

	public void Nhap()
	{
		Scanner sc=new Scanner(System.in);
		super.Nhap(sc);
		System.out.println("Cong viec: ");
		this.congViec=sc.nextLine();
	}
	
	public void Xuat()
	{
		super.Xuat();
		System.out.print("Cong viec: " + this.congViec);
	}
	
	
	
	
	
	
	
	
	
	
}
