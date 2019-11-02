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
        System.out.println("Nhập mã NCC: ");this.maNCC=tool.inp.nextLine();
        System.out.println("Tên nhà cung cấp: "); this.TenNCC=tool.inp.nextLine();
        System.out.println("Tên người đại diện: "); this.Name=tool.inp.nextLine();
        System.out.println("Số điện thoại: "); this.SDT=tool.inp.nextLine();
        System.out.println("Email: "); this.email=tool.inp.nextLine();
        System.out.println("Địa chỉ: "); this.Address=tool.inp.nextLine();
    }
    public void xuat(){
        System.out.println(String.format("%-5s%-30s%-30s%-15s%-30s%-30s",this.maNCC,this.TenNCC,this.Name,this.SDT,this.email,this.Address));
    }
    
}