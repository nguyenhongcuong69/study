package QLCanBo;

import java.util.Scanner;

public class CongNhan extends CanBo {
	private byte Bac;

	public byte getBac() {
		return Bac;
	}
	public void setBac(byte bac) {
		Bac = bac;
	}

	public CongNhan()
	{
		super();
		this.Bac=0;
	}

	public CongNhan(String hoTen, int namSinh, String gioiTinh, String diaChi, byte Bac)
	{
		super(hoTen, namSinh, gioiTinh, diaChi);
		this.Bac=Bac;
		
	}

	@Override
	public void Nhap(Scanner sc)
	{
		super.Nhap(sc);
		System.out.print("Bac: ");
		this.Bac=sc.nextByte();
		sc.nextLine();
	}

	@Override
	public void Xuat()
	{
		super.Xuat();
		System.out.println("Bac: " + getBac());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
