package QLSinhVienCoBan;

import java.util.ArrayList;
import java.util.Scanner;

public class DSMonHoc {
	
	Scanner sc=new Scanner((System.in));
	ArrayList<MonHoc> lstMH;
	public DSMonHoc()
	{
		lstMH=new ArrayList<MonHoc>();
	}
	
	public void nhap()
	{
		int luaChon;
		do {
			System.out.println("================ Menu mon hoc ================");
			System.out.println("1. Nhap mon hoc");
			System.out.println("2. Thoat nhap mon hoc");
			
			do {
				System.out.println("Nhap lua chon: ");
				luaChon=Integer.parseInt(sc.nextLine());
				if(luaChon<1||luaChon>2)
					System.out.println("Lua chon khong hop le. Nhap lai");
			} while (luaChon<1||luaChon>2);
			switch (luaChon) {
			case 1:
				MonHoc mh=new MonHoc();
				mh.nhap();
				lstMH.add(mh);
				break;

			case 2:
				break;
			}
			
		} while (luaChon!=2);
		
	}

	public void xuat()
	{
		for (int i = 0; i < lstMH.size(); i++) {
			System.out.println("");
			System.out.println("Thong tin mon hoc : " + (i+1));
			System.out.println(lstMH.get(i));
		}
	}

	public double tinhDiemTB()
	{
		double dtb=0;
		double tongSoTin=0;
		for (int i = 0; i < lstMH.size(); i++) {
			dtb+=lstMH.get(i).tinhTongDiemMon();
			tongSoTin+=lstMH.get(i).getSoTinChi();
		}
		return dtb/tongSoTin;

	}

	public double tinhDiemTBQuyDoi()
	{
		double dtb=0;
		double tongSoTin=0;
		for (int i = 0; i < lstMH.size(); i++) {
			dtb+=lstMH.get(i).quyDoiDiem() * lstMH.get(i).getSoTinChi();
			tongSoTin+=lstMH.get(i).getSoTinChi();
		}
		return dtb/tongSoTin;

		
	}






}
