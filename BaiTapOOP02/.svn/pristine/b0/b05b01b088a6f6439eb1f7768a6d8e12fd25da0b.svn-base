package QLNhanKhau;

import java.util.Scanner;

public class HoKhau extends NhanKhau {
	private String diaChi;
	private String noiCongTac;
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getNoiCongTac() {
		return noiCongTac;
	}
	public void setNoiCongTac(String noiCongTac) {
		this.noiCongTac = noiCongTac;
	}

	public HoKhau(){
		super();
		this.diaChi="";
		this.noiCongTac="";
	}
	
	public HoKhau(String hoTen, Ngay ngaySinh, String gioiTinh, String diaChi, String noiCongTac)
	{
		super(hoTen, ngaySinh, gioiTinh);
		this.diaChi=diaChi;
		this.noiCongTac=noiCongTac;
	}
	
	public void Nhap(Scanner sc)
	{
		super.Nhap(sc);
		System.out.print("Dia chi: ");
		this.diaChi=sc.nextLine();
		System.out.print("Noi cong tac: ");
		this.noiCongTac=sc.nextLine();
	}
	
	public void Xuat()
	{
		super.Xuat();
		System.out.print("Dia chi: "+ this.diaChi);
		System.out.print("Noi cong tac: "+ this.noiCongTac);
	}
	







}