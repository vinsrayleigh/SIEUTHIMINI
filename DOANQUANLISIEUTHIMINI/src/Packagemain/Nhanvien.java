package Packagemain;
import java.util.Date;

public class Nhanvien extends Person{
    protected String maNV;
    protected float Luong;
    protected String chucVu;
    
    public void xuat(){                 //MS HoTEn  NS--GT--CMND--DC---SDT--Email--Chuc Vu--Luong//
        System.out.println(String.format("%-10s%-20s%-10s%-15s%-15s%-25s%-15s%-30s%-15s%-20s",this.maNV,this.Name,this.GT,this.toBString(),this.ID,this.Address,this.SDT,this.email,this.Luong,this.chucVu));
    }
    public void nhap(){
        System.out.println("Moi nhap:");
        System.out.print("\nMa NV: "); this.maNV=tool.inp.nextLine();
        System.out.print("\nTen NV: "); this.Name=tool.inp.nextLine();
        System.out.print("\nGioi tinh: ");this.GT=tool.inp.nextLine();
        System.out.print("\nNgay Sinh (dd/mm/yyyy): ");
        this.setBirthday(tool.inp.nextLine());
        System.out.print("\nSo dien thoai: ");  this.SDT=tool.inp.nextLine();
        System.out.print("\nCMND: "); this.ID=tool.inp.nextLine();
        System.out.print("\nEmail: ");this.email=tool.inp.nextLine();
        System.out.print("\nDia chi: ");this.Address=tool.inp.nextLine();
        System.out.print("\nChuc vu: ");this.chucVu=tool.inp.nextLine();
        System.out.print("\nLuong: ");this.Luong=Float.parseFloat(tool.inp.nextLine());
    }
    public String toString(){
        return maNV+"-"+Name+"-"+GT+"-"+this.toBString()+"-"+ID+"-"+SDT+"-"+email+"-"+Address+"-"+Luong+"-"+chucVu;
    }
    public static void main(String[] args){
        Nhanvien a= new Nhanvien();
        a.nhap();
        a.xuat();
    }

    public Nhanvien(String name, Date birthday, String sDT, String iD, String email, String address, String gT,
            String maNV, float luong, String chucVu) {
        super(name, birthday, sDT, iD, email, address, gT);
        this.maNV = maNV;
        Luong = luong;
        this.chucVu = chucVu;
    }

    public Nhanvien(String maNV, float luong, String chucVu) {
        this.maNV = maNV;
        Luong = luong;
        this.chucVu = chucVu;
    }

    public Nhanvien() {
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public float getLuong() {
        return Luong;
    }

    public void setLuong(float luong) {
        Luong = luong;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
}