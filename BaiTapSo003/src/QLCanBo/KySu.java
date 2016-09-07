package QLCanBo;

import java.util.Scanner;

public class KySu extends CanBo {
	private String nganhDaoTao;

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	
	public KySu()
	{
		super();
		this.nganhDaoTao="";
	}
	
	public KySu(String hoTen, int namSinh, String gioiTinh, String diaChi,String nganhDaoTao)
	{
		super(hoTen, namSinh, gioiTinh, diaChi);
		this.nganhDaoTao=nganhDaoTao;
	}
	
	public void Nhap(Scanner sc)
	{
		super.Nhap(sc);
		System.out.print("Nganh dao tao: ");
		this.nganhDaoTao=sc.nextLine();
	}
	
	public void Xuat()
	{
		super.Xuat();
		System.out.println("Nganh dao tao: " + getNganhDaoTao());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
