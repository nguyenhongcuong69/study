package QLNhanVienCoBan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class DSNV {

	Scanner sc=new Scanner(System.in);
	private ArrayList<NhanVien2> dsNhanVien;

	public DSNV()
	{
		dsNhanVien=new ArrayList<NhanVien2>();
	}
	
	public void nhap()
	{
		int luaChon;
		do {
			System.out.println("============== Menu nhap ==============");
			System.out.println("1. Nhap thong tin cho Nhan vien San Xuat");
			System.out.println("2. Nhap thong tin cho Nhan vien Cong Nhat");
			System.out.println("3. Nhap thong tin cho Nhan Vien Quan Ly");
			System.out.println("4. Thoat chuong trinh nhap.");
			System.out.println();
			
			do {
				System.out.println("Nhap lua chon cua ban: ");
				luaChon=sc.nextInt();
				sc.nextLine();

				
				if(luaChon<1||luaChon>4)
					System.out.println("Lua chon khong hop le. Xin moi nhap lai");
			} while (luaChon<1||luaChon>4);
			
			
			switch (luaChon) {
			case 1:
			{
				System.out.println("1. Nhap thong tin cho Nhan vien San Xuat");
				NhanVien2 sx=new NVSX();
				sx.nhap();
				dsNhanVien.add(sx);
				
			}break;

			case 2:
			{
				System.out.println("Nhap thong tin cho Nhan vien Cong Nhat");
				NhanVien2 cn=new NVCN();
				cn.nhap();
				dsNhanVien.add(cn);
			}break;
				
			case 3:
			{
				System.out.println("Nhap thong tin cho Nhan Vien");
				NhanVien2 ql=new NVQL();
				ql.nhap();
				dsNhanVien.add(ql);
			}break;
			case 4:
				break;
			}
		} while (luaChon!=4);
	}
	
	public void xuat() {
		System.out.println("============= Danh Sach Nhan Vien =============");
		for (int i = 0; i < dsNhanVien.size(); i++) {
			dsNhanVien.get(i).xuat();
			System.out.println();
		}
	}
	
	public double tinhTongLuong() {
		double tongLuong=0;
		for (NhanVien2 nhanVien2 : dsNhanVien) {
			tongLuong+=nhanVien2.tinhLuong();
		}
		return tongLuong;
	}
	
	public boolean timKhiemNV() {
		String tenCB=sc.nextLine();
		for (NhanVien2 nhanVien2 : dsNhanVien) {
			if(nhanVien2.getHoTen().equalsIgnoreCase(tenCB)) return true;
		}
		return false;
	}
	
	public void sapXepTheoLuong()
	{
		Collections.sort(dsNhanVien,new Comparator<NhanVien2>(){
			@Override
			public int compare(NhanVien2 nv1, NhanVien2 nv2)
			{
				if(nv1.tinhLuong()<nv2.tinhLuong())
					return 1;
				else {
					if(nv1.tinhLuong()==nv2.tinhLuong()) return 0;
					else return -1;
				}
			}
		});
		
	}
	
	public NhanVien2 TimNhanVienSXLuongCaoNhat()
	{
		NhanVien2 nv=new NVSX();
		for (NhanVien2 nhanVien2 : dsNhanVien) {
			if(nhanVien2 instanceof NVSX)
			{
				if(nhanVien2.tinhLuong()>nv.tinhLuong())
					nv=nhanVien2;
			}
		}
		
		return nv;
	}
	
	
	
	
	
	
	
	
	
	
}
