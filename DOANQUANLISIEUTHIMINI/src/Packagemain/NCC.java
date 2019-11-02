package Packagemain;
public class NCC extends Person{
    protected String maNCC;
    protected String TenNCC;    //tên thương hiệu nhà cc còn name là tên người đại diện

    public NCC(String name, String sDT, String email, String address, String maNCC, String tenNCC) {
        super(name, sDT, email, address);
        this.maNCC = maNCC;
        TenNCC = tenNCC;
    }
    public NCC(String maNCC, String tenNCC) {
        this.maNCC = maNCC;
        TenNCC = tenNCC;
    }
    public NCC() {
    }
    public void nhap(){
        System.out.println("Mời nhập:");
    }
    
}