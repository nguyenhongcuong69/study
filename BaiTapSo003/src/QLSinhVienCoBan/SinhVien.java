package QLSinhVienCoBan;

import java.util.Scanner;

public class SinhVien {

	Scanner sc=new Scanner(System.in);
	private int maSV;
	private String hoTen;
	private DSMonHoc dsMH;
	
	public SinhVien(){
		maSV=0;
		hoTen="";
		dsMH=new DSMonHoc();
	}
	
	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public void nhap()
	{
		System.out.print("Ma sinh vien: ");
		maSV=Integer.parseInt(sc.nextLine());
		System.out.print("Ho ten: ");
		hoTen=sc.nextLine();
		System.out.println("Nhap cac mon hoc dang ky: ");
		dsMH.nhap();
	}
	
	public void xuat()
	{
		System.out.println("Ma sinh vien: "+ maSV);
		System.out.println("Ho ten: "+hoTen);
		System.out.println("Dang sach mon hoc dang ky: ");
		dsMH.xuat();
		System.out.println("Diem trung binh la: "+ dsMH.tinhDiemTBQuyDoi());
	
	}


	





}
