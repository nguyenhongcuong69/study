package QLNhanVienCoBan;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DSNV ds=new DSNV();
		ds.nhap();
		ds.xuat();

		NhanVien2 nv=ds.TimNhanVienSXLuongCaoNhat();
		System.out.println("Nhan vien san xuat co luong cao nhat la: ");
		nv.xuat();
	}

}
