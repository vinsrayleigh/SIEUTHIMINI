package Packagemain;
public class Main{
    public static void main(String[] args) {
        //load dữ liệu từ file
        int option;
        do{
            System.out.println(String.format("%20s","MENU"));
            System.out.println("1. Quản lí sản phẩm");
            System.out.println("2. Quản lí nhân viên");
            System.out.println("3. Quản lí khách hàng");
            System.out.println("4. Quản lí bán hàng");
            System.out.println("5. Quản lí nhập hàng");
            System.out.println("6. Quản lí nhà cung cấp");
            System.out.println("7. Thông kê doanh thu");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn để xem chi tiết:");
            option=Integer.parseInt(tool.inp.nextLine());
            switch(option){
                case 1:{

                    break;
                }
                case 2:{

                    break;
                }
                case 3:{
                    
                    break;
                }
                case 4:{
                    
                    break;
                }
                case 5:{
                    
                    break;
                }
                case 6:{
                    
                    break;
                }
                case 7:{
                    
                    break;
                }
                case 0:{
                    break;
                }
                default:{
                    System.out.println("Sai cú pháp");
                    break;
                }
            }
        }while(option!=0);

    }

}