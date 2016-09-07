package QLNhanVienCoBan;

import java.util.Scanner;

public class Ngay {

	Scanner sc=new Scanner(System.in);
	private int ngay;
	private int thang;
	private int nam;
	
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
	
	public Ngay()
	{
		ngay=thang=nam=1;
	}
	
	public Ngay(int ngay, int thang, int nam)
	{
		this.ngay=ngay;
		this.thang=thang;
		this.nam=nam;
	}
	
	public void nhap()
	{
		ngay=sc.nextInt();
		thang=sc.nextInt();
		nam=sc.nextInt();
		sc.nextLine();
	}
	
	public String toString()
	{
		return String.format("%d/%d/%d", ngay, thang, nam);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
