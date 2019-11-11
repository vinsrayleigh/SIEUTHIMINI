package Packagemain;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DSKhachHang {
    protected ArrayList<KhachHang> list = new ArrayList<>();
    protected static boolean isread;
    public void nhap(){
        int n;
            System.out.println("Nhập số lượng: ");
            n=Integer.parseInt(tool.inp.nextLine());
            for(int i=0;i<n;i++){
                KhachHang a =new KhachHang();
                a.nhap();
                list.add(a);
            }
    }
    public void xuat(){
        System.out.println("---------------------------------------------------------------DANH SÁCH KHÁCH HÀNG------------------------------------------------------------------------------");
        System.out.println(String.format("%-10s%-20s%-10s%-25s%-15s%-25s%-15s%-22s%-20s","MSKH","Họ tên","Giới tính","Ngày sinh","Số điện thoại","Địa chỉ","Điểm tích luỹ","Cấp bậc","Tổng Tiêu dùng"));
        for(int i=0;i<list.size();i++){
            list.get(i).xuat();
        }
    }
    public void docdl() throws IOException{
        File f = new File("./CSDL/KhachHang.txt");
        try(Scanner sc = new Scanner(f)){
            while(sc.hasNext()){
                String s=sc.nextLine();
                KhachHang a = new KhachHang();
                System.out.println(s);
                a.nhap(s);
                list.add(a);
            }
        } catch(Exception e){
        };
        isread=true;
    }
    public void ghidl(){
        if(isread==false) {
            return;
        }
        File f = new File("./CSDL/KhachHang.txt");

        try(PrintWriter pw = new PrintWriter(f)){
            for(int i=0;i<list.size();i++)
            pw.println(list.get(i).toString());
        } catch(Exception e){
        };
        isread = false;
    }
    public void xuat1(int i){
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(String.format("%-10s%-20s%-10s%-25s%-15s%-25s%-15s%-22s%-20s","MSKH","Họ tên","Giới tính","Ngày sinh","Số điện thoại","Địa chỉ","Điểm tích luỹ","Cấp bậc","Tổng Tiêu dùng"));
        list.get(i).xuat();
    }
    public void swap(int i,int j){
        KhachHang a;
            a=list.get(i);
            list.set(i, list.get(j));
            list.set(j, a);
    }
    public void sapxep(){
        for(int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                if(Integer.parseInt(list.get(i).getMaKH())>Integer.parseInt(list.get(j).getMaKH())){
                    swap(i,j);
                }
            }
        }
    }
    public int timkiem(String maKH){
        for(int i=0;i<list.size();i++)
            if(list.get(i).getMaKH().equals(maKH)) return i;
        return -1;
    }
    public void suaThongTin(){  
            System.out.println("Nhập mã số nv cần sửa thông tin");
            String maNV=tool.inp.nextLine();
            int index=this.timkiem(maNV);
            int option;
            if(index!=-1)
            do{
                this.xuat1(index);
                System.out.println("Chọn thông tin cần sửa");
                System.out.println("1.Tên");
                System.out.println("2.Giới tính");
                System.out.println("3.Ngày sinh");
                System.out.println("4.Địa chỉ");
                System.out.println("5.Số điện thoại");
                System.out.println("6.Cập nhật toàn bộ");
                System.out.println("0.Thoát");
                option=Integer.parseInt(tool.inp.nextLine());
                switch(option){
                    case 0:{
                        break;
                    }
                    case 1:{
                        System.out.println("Nhập tên mới");
                        list.get(index).setName(tool.inp.nextLine());
                        break;
                    }
                    case 2:{
                        System.out.println("Ngày sinh mới(dd/MM/yyyy)");
                        list.get(index).setAddress(tool.inp.nextLine());
                    }
                    case 3:{
                        System.out.println("Nhập ngày sinh mới");
                        list.get(index).setBirthday(tool.inp.nextLine());
                        break;
                    }
                    case 4:{
                        System.out.println("Nhập địa chỉ mới");
                        list.get(index).setAddress(tool.inp.nextLine());
                        break;
                    }
                    case 5:{
                        System.out.println("Nhập số điện thoại mới");
                        list.get(index).setSDT(tool.inp.nextLine());
                        break;
                    }
                    case 6:{
                        list.get(index).nhap();
                        break;
                    }
                    default:{
                        System.out.println("Nhập sai cú pháp mời nhập lại");
                    }
                }
            }while(option!=0);
            else {
                System.out.println("Không tồn tại mã số " + maNV);
            }
        }
        public void xoanhanvien(){ // chưa hoàn thiện
            list.clear();
        }
        public void menuQuanLiKhachHang() throws IOException {
            int option;
            this.docdl();
            this.sapxep();
            do{
                System.out.println("Quản lí khách hàng");
                System.out.println("1.Xuất Danh Sách");
                System.out.println("2.Cập nhật thông tin");
                System.out.println("3.Thêm khách hàng mới");
                System.out.println("0.Thoát");
                System.out.println("Mời nhập lựa chọn");
                option =Integer.parseInt(tool.inp.nextLine());
                switch(option){
                    case 1:{
                        this.xuat();
                        break;
                    }
                    case 2:{
                        this.suaThongTin();
                        break;
                    }
                    case 3:{
                        this.nhap();
                        this.sapxep();
                        break;
                    }
                    case 0:{
                        break;
                    }
                    default:{
                        System.out.println("Sai cú pháp mời nhập lại lựa chọn");
                        break;
                    }
                }
            }while(option!=0);
           this.ghidl();
        }
        public static void main(String[] args) throws IOException {
            DSKhachHang a= new DSKhachHang();
            a.menuQuanLiKhachHang();
        }
        
}