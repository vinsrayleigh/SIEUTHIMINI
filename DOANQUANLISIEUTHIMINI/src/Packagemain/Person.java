package Packagemain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Person {
    protected String Name;
    protected Date birthday;
    protected String SDT;
    protected String ID;
    protected String email;
    protected String Address;
    protected String GT;

    public Person(String name, Date birthday, String iD, String email, String address, String gT) {
        Name = name;
        this.birthday = birthday;
        ID = iD;
        this.email = email;
        Address = address;
        GT = gT;
    }
    public Person(String name, String sDT, String email, String address) {
        Name = name;
        SDT = sDT;
        this.email = email;
        Address = address;
    }    
    public Person(String name, Date birthday, String sDT, String iD, String email, String address,
            String gT) {
        Name = name;
        this.birthday = birthday;
        SDT = sDT;
        ID = iD;
        this.email = email;
        Address = address;
        GT = gT;
    }
    public Person() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(String S) {
        try {
            this.birthday = new SimpleDateFormat("dd/MM/yyyy").parse(S);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getGT() {
        return GT;
    }

    public void setGT(String gT) {
        GT = gT;
    }
    public String toBString(){  //chuyển ngày sang định dạng string dd/MM/yyyy
        if (this.birthday == null) {
            return " ";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(this.birthday);
    }
    public static void main(String[] argv){
        Person a = new Nhanvien();
        a.setBirthday("13/13/2011");
        System.out.println(a.toBString());
    }

}