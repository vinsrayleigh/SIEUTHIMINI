package Packagemain;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DSNhanVien {
        protected ArrayList<Nhanvien> list = new ArrayList<>();
        protected boolean read;
        public void nhap(){ //nhập mới từ bàn phím 
            int n;
            System.out.println("Nhập số lượng: ");
            n=Integer.parseInt(tool.inp.nextLine());
            for(int i=0;i<n;i++){
                Nhanvien a =new Nhanvien();
                a.nhap();
                list.add(a);
            }
        }
        public void xuat(){
            System.out.println("---------------------------------------------------------------DANH SÁCH NHÂN VIÊN--------------------------------------------------------------------------------");
            System.out.println(String.format("%-10s%-20s%-10s%-15s%-15s%-25s%-15s%-30s%-15s%-20s","MSNV","Họ tên","Giới tính","Ngày sinh","CMND","Địa chỉ","Số điện thoại","email","Mức Lương","Chức vụ"));
            for(int i=0;i<list.size();i++){
                list.get(i).xuat();
            }
        }
        public void xuat1(int i){
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(String.format("%-10s%-20s%-10s%-15s%-15s%-25s%-15s%-30s%-15s%-20s","MSNV","Họ tên","Giới tính","Ngày sinh","CMND","Địa chỉ","Số điện thoại","email","Mức Lương","Chức vụ"));
                list.get(i).xuat();
        }
        public void swap(int i,int j){
                    Nhanvien a;
                        a=list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, a);
        }
        public void sapxep(){
            for(int i=0;i<list.size()-1;i++){
                for(int j=i+1;j<list.size();j++){
                    if(Integer.parseInt(list.get(i).getMaNV())>Integer.parseInt(list.get(j).getMaNV())){
                        swap(i,j);
                    }
                }
            }
        }
        public int timkiem(String maNV){
            for(int i=0;i<list.size();i++)
            if(list.get(i).getMaNV().equals(maNV)) return i;
            return -1;
        }
        public void nhap(String S){
            String[] out = S.split("-");
                    Nhanvien a= new Nhanvien();
                    a.setMaNV(out[0]);
                    a.setName(out[1]);
                    a.setGT(out[2]);
                    a.setBirthday(out[3]);
                    a.setID(out[4]);
                    a.setSDT(out[5]);
                    a.setEmail(out[6]);
                    a.setAddress(out[7]);
                    a.setChucVu(out[9]);
                    a.setLuong(Float.parseFloat(out[8]));
                    list.add(a);
        }
        public void docdl() throws IOException{
            File f = new File("./CSDL/NhanVien.txt");
            try(Scanner sc = new Scanner(f)){
                while(sc.hasNext()){
                    String s=sc.nextLine();
                    System.out.println(s);
                    this.nhap(s);
                }
            } catch(Exception e){
            };
            this.read=true;
        }
        public void ghidl(){
            if(read==false) {
                return;
            }
            File f = new File("./CSDL/NhanVien.txt");

            try(PrintWriter pw = new PrintWriter(f)){
                for(int i=0;i<list.size();i++)
                pw.println(list.get(i).toString());
            } catch(Exception e){
            };
            read = false;
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
                System.out.println("4.CMND");
                System.out.println("5.Địa chỉ");
                System.out.println("6.Số điện thoại");
                System.out.println("7.Email");
                System.out.println("8.Mức lương");
                System.out.println("9.Chức vụ");
                System.out.println("10.Cập nhật toàn bộ");
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
                        System.out.println("Nhập giới tính mới");
                        list.get(index).setGT(tool.inp.nextLine());
                        break;
                    }
                    case 3:{
                        System.out.println("Nhập ngày sinh mới");
                        list.get(index).setBirthday(tool.inp.nextLine());
                        break;
                    }
                    case 4:{
                        System.out.println("Nhập CMND mới");
                        list.get(index).setID(tool.inp.nextLine());
                        break;
                    }
                    case 5:{
                        System.out.println("Nhập địa chỉ mới");
                        list.get(index).setAddress(tool.inp.nextLine());
                        break;
                    }
                    case 6:{
                        System.out.println("Nhập số điện thoại mới");
                        list.get(index).setSDT(tool.inp.nextLine());
                        break;
                    }
                    case 7:{
                        System.out.println("Nhập Email mới");
                        list.get(index).setEmail(tool.inp.nextLine());
                        break;
                    }
                    case 8:{
                        System.out.println("Nhập lương mới");
                        list.get(index).setLuong(Float.parseFloat(tool.inp.nextLine()));
                        break;
                    }
                    case 9:{
                        System.out.println("Nhập chức vụ mới");
                        list.get(index).setChucVu(tool.inp.nextLine());
                        break;
                    }
                    case 10:{
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
        public void xoanhanvien(){
            list.clear();
        }
        public void menuQuanLiNhanVien() throws IOException {
            int option;
            this.docdl();
            this.sapxep();
            do{
                System.out.println("Quản lí nhân viên");
                System.out.println("1.Xuất Danh Sách");
                System.out.println("2.Cập nhật thông tin");
                System.out.println("3.Thêm nhân viên mới");
                System.out.println("1.Xuất Danh Sách");
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
            DSNhanVien list = new DSNhanVien();
            list.menuQuanLiNhanVien();
        }
}