package QLCanBo;

import java.util.ArrayList;
import java.util.Scanner;


public class DSCanBo {
	private ArrayList<CanBo> dsCanBo;
	Scanner sc=new Scanner(System.in);
	public DSCanBo()
	{
		dsCanBo=new ArrayList<CanBo>();
	}
	
	public void nhap() {
		int luaChon2;
		do{
			System.out.println("============== Menu nhap ==============");
			System.out.println("1. Nhap thong tin cho Cong Nhan");
			System.out.println("2. Nhap thong tin cho Ky Su");
			System.out.println("3. Nhap thong tin cho Nhan Vien");
			System.out.println("4. Thoat chuong trinh nhap.");
			System.out.println();
			
			do{

				System.out.println("Nhap lua chon cua ban: ");
				luaChon2=sc.nextInt();
				sc.nextLine();

				
				if(luaChon2<1||luaChon2>4)
					System.out.println("Lua chon khong hop le. Xin moi nhap lai");
				
			}while(luaChon2<1||luaChon2>4);
			
			
			switch (luaChon2) {
			case 1:
			{
				System.out.println("Nhap thong tin cho Cong Nhan");
				CanBo cn=new CongNhan();
				cn.Nhap(sc);
				dsCanBo.add(cn);
				
			}break;

			case 2:
			{
				System.out.println("Nhap thong tin cho Ky Su");
				CanBo ks=new KySu();
				ks.Nhap(sc);
				dsCanBo.add(ks);
			}break;
				
			case 3:
			{
				System.out.println("Nhap thong tin cho Nhan Vien");
				CanBo nv=new NhanVien();
				nv.Nhap(sc);
				dsCanBo.add(nv);
			}break;
			case 4:
				break;
			}
		}while(luaChon2!=4);
	}
	
	public void xuat() {
		System.out.println("============= Danh Sach Can Bo =============");
		for (int i = 0; i < dsCanBo.size(); i++) {
			dsCanBo.get(i).Xuat();
			System.out.println();
		}
		
	}

	public boolean timKiem(String tenCB) {
		for (int i = 0; i < dsCanBo.size(); i++) {
			if(dsCanBo.get(i).getHoTen().equalsIgnoreCase(tenCB))
			return true;
		}
		return false;
	}
	
	public void menu() {
		
		int luaChon;
		do{
			System.out.println();
			System.out.println("============== Menu ==============");
			System.out.println("1. Nhap thong tin ");
			System.out.println("2. Hien thi danh sach.");
			System.out.println("3. Tim kiem can bo");
			System.out.println("4. Thoat chuong trinh.");
			System.out.println();
			
			do{

				System.out.println("Nhap lua chon cua ban: ");
				luaChon=sc.nextInt();
				sc.nextLine();

				
				if(luaChon<1||luaChon>4)
					System.out.println("Lua chon khong hop le. Xin moi nhap lai");
				
			}while(luaChon<1||luaChon>4);
			
			switch (luaChon) {
			case 1:{
				nhap();				
			}break;

			case 2: 
			{
				xuat();
			}break;
			
			case 3:{
				System.out.println("Nhap ten can bo can tim kiem: ");
				String tenCB=sc.nextLine();
				if(timKiem(tenCB))
					System.out.println("Can bo "+tenCB+" co trong danh sach");
				else 
					System.out.println("Can bo "+tenCB+" khong co trong danh sach");
			}break;
			
			case 4: break;
			}
			
			
		}while(luaChon!=4);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
