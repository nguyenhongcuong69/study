package QLNhanVienCoBan;

import java.util.Scanner;

public class NVSX extends NhanVien2 {

	Scanner sc=new Scanner(System.in);
	private int soSanPham;

	public int getSoSanPham() {
		return soSanPham;
	}

	public void setSoSanPham(int soSanPham) {
		this.soSanPham = soSanPham;
	}
	
	public NVSX()
	{
		super();
		soSanPham=0;
	}

	public NVSX(String hoTen,Ngay ngaySinh, String diaChi, int soSanPham)
	{
		super(hoTen, ngaySinh, diaChi);
		this.soSanPham=soSanPham;
	}

	public void nhap() {
		super.nhap();
		System.out.print("So san pham: ");
		soSanPham=Integer.parseInt(sc.nextLine());
	}
	
	public void xuat() {
		super.xuat();
		System.out.println("So san pham: " + soSanPham);
	}
	

	@Override
	public double tinhLuong() {
		// TODO Auto-generated method stub
		return soSanPham*50000;
	}





















}
