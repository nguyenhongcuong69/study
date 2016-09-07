package QLNhanKhau;

import java.util.Scanner;

public class Ngay {
	private int ngay, thang, nam;

	public int getNgay() {
		return ngay;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}
	
	public Ngay(){
		this.ngay=1;
		this.thang=1;
		this.nam=1950;
	}

	public Ngay(int ngay, int thang, int nam)
	{
		this.ngay=ngay;
		this.thang=thang;
		this.nam=nam;
	}

	public void Nhap(Scanner sc)
	{
		this.ngay=sc.nextInt();
		this.thang=sc.nextInt();
		this.nam=sc.nextInt();
		sc.nextLine();
	}
	
	@Override
	public String toString()
	{
		return String.format("%d/%d/%d",this.ngay, this.thang, this.nam);
	}
	
	
	
	
}
