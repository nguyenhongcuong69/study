package QLNhanVienCoBan;

import java.util.Scanner;


public class NVCN extends  NhanVien2 {
	Scanner sc=new Scanner(System.in);
	private int soNgayCong;
	public int getSoNgayCong() {
		return soNgayCong;
	}
	public void setSoNgayCong(int soNgayCong) {
		this.soNgayCong = soNgayCong;
	}
	
	public NVCN(){
		super();
		soNgayCong=0;
	}
	
	public NVCN(String hoTen,Ngay ngaySinh, String diaChi, int soNgayCong){
		super(hoTen, ngaySinh, diaChi);
		this.soNgayCong=soNgayCong;
	}

	public void nhap()
	{
		super.nhap();
		System.out.print("So ngay cong: ");
		soNgayCong=Integer.parseInt(sc.nextLine());
	}
	
	@Override
	public double tinhLuong() {
		// TODO Auto-generated method stub
		return soNgayCong*120000;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
