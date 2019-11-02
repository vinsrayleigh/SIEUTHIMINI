package Packagemain;

import java.util.Date;

public class KhachHang extends Person {
    protected String maKH;
    protected int diemTichLuy;
    protected int tongTieuDung;
    protected String level;

    public KhachHang(String name, Date birthday, String sDT, String iD, String email, String address,
            String gT, String maKH) {
        super(name, birthday, sDT, iD, email, address, gT);
        this.maKH = maKH;
        this.diemTichLuy = 0;
        this.tongTieuDung = 0;
    }
    public KhachHang(){
        
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public int getDiemTichLuy() {
        return diemTichLuy;
    }

    public void setDiemTichLuy(int diemTichLuy) {
        this.diemTichLuy = diemTichLuy;
    }

    public int getTongTieuDung() {
        return tongTieuDung;
    }

    public void setTongTieuDung(int tongTieuDung) {
        this.tongTieuDung = tongTieuDung;
    }
    public void nhap(){
        System.out.println("Mời nhập:");
        System.out.print("\nMa KH: "); this.maKH=tool.inp.nextLine();
        System.out.print("\nTên KH: "); this.Name=tool.inp.nextLine();
        System.out.print("\nGioi tinh: ");this.GT=tool.inp.nextLine();
        System.out.print("\nNgay Sinh (dd/mm/yyyy): ");
        this.setBirthday(tool.inp.nextLine());
        System.out.print("\nSo dien thoai: ");  this.SDT=tool.inp.nextLine();
        System.out.print("\nCMND: "); this.ID=tool.inp.nextLine();
        System.out.print("\nEmail: ");this.email=tool.inp.nextLine();
        System.out.print("\nDia chi: ");this.Address=tool.inp.nextLine();
    }
    public void xuat(){
        System.out.println(String.format("%-5s%-25s%-10s%-5s%-15s%-15s%-30s%-5d%-5d",this.maKH,this.Name,this.toBString(),this.GT,this.ID
        ,this.diemTichLuy,this.tongTieuDung));
    }
    public void updateLevel(){
        if(this.tongTieuDung>5000000) this.level ="VIP";
        else if(this.tongTieuDung>2500000) this.level ="Thành Viên";
        else this.level="Khách hàng thân thiết";
    }
}