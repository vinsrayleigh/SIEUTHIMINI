package Packagemain;

import java.util.Date;

public class KhachHang extends Person {
    protected String maKH;
    protected int diemTichLuy;
    protected int tongTieuDung;
    protected String level;

    public KhachHang(String name, Date birthday, String sDT, String address,
            String gT, String maKH) {
        super(name, birthday, sDT, null, null, address, gT);
        this.maKH = maKH;
        this.diemTichLuy = 0;
        this.tongTieuDung = 0;
    }
    public KhachHang(){
        
    }
    public void nhap(String S){
        String[] out = S.split("-");
        this.maKH=out[0];
        this.Name=out[1];
        this.GT=out[2];
        this.setBirthday(out[3]);
        this.setSDT(out[4]);
        this.Address=out[5];
        this.diemTichLuy=Integer.parseInt(out[6]);
        this.level=out[7];
        this.tongTieuDung=Integer.parseInt(out[8]);

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
        System.out.print("\nDia chi: ");this.Address=tool.inp.nextLine();
        this.updateLevel();
    }
    public void xuat(){
        System.out.println(String.format("%-10s%-20s%-10s%-25s%-15s%-25s%-15s%-22s%-20s",this.maKH,this.Name,this.GT,this.toBString(),this.SDT,this.Address,this.diemTichLuy,this.level,this.tongTieuDung));
    }
    public void updateLevel(){
        if(this.tongTieuDung>5000000) this.level ="VIP";
        else if(this.tongTieuDung>2500000) this.level ="Thành Viên";
        else this.level="Khách hàng thân thiết";
    }
    public String toString(){
        return this.maKH+"-"+this.Name+"-"+this.GT+"-"+this.toBString()+"-"+this.SDT+"-"+this.Address+"-"+this.diemTichLuy+"-"+this.level+"-"+this.tongTieuDung;
    }
}