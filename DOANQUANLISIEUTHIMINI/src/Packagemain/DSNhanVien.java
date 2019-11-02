package Packagemain;
public class DSNhanVien{
    protected Nhanvien[] listNV;
    protected int SL;
    public DSNhanVien(){
        SL=0;
    }
    public void nhap(){ //nhập mới từ bàn phím 
        int n;
        System.out.println("Nhập số lượng: ");
        n=Integer.parseInt(tool.inp.nextLine());
        for(int i=SL;i<n+SL;i++){
            listNV[i].nhap();
        }
    }
    public void xuat(){
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(String.format("%-10s%-20s%-10s%-10s%-20s%-25s%-15s%-30s%-15s%-20s","MSNV","Họ tên","Ngày sinh","Giới tính","CMND","Địa chỉ","Số điện thoại","email","Chức vụ","Mức lương"));
        for(int i=0;i<SL;i++){
            this.listNV[i].xuat();
        }
    }
    public void sapxep(){

    }
    public static void main(String[] args){
        DSNhanVien a=new DSNhanVien();
        a.nhap();

    }
}