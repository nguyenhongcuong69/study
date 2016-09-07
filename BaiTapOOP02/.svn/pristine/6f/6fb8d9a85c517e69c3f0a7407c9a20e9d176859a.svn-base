package QLNhanKhau;

import java.util.Scanner;

public class SoHoKhau {
	private HoKhau[] lstHoKhau;
	private int soTV;
	public int getSoTV() {
		return soTV;
	}
	public void setSoTV(int soTV) {
		this.soTV = soTV;
	}
	
	public SoHoKhau()
	{
		lstHoKhau=new HoKhau[10];
	}
	
	public void Nhap(Scanner sc)
	{
		System.out.println("Nhap so thanh vien: ");
		this.soTV=sc.nextInt();
		sc.nextLine();
		lstHoKhau=new HoKhau[soTV];
		for (int i = 0; i < this.soTV; i++) {
			System.out.println("Nhap thong tin cho thanh vien thu "+ (i + 1));
			lstHoKhau[i]=new HoKhau();
			lstHoKhau[i].Nhap(sc);
		}
	}
	
	public void Xuat()
	{
		for (int i = 0; i < this.soTV; i++) {
			System.out.println("Thong tin Ho khau nha: "+ (i+1));
			System.out.println("Thong tin thanh vien thu: "+ (i + 1));
			lstHoKhau[i].Xuat();
			System.out.println("============================");
		}
	}
	
	
	
	
	
	
}
