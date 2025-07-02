package oop;
//tính đóng gói
public class User {
    private String name;
    private int age;
    private String soDt;
    //constructor dùng để khởi tạo name ,age , soDt
    public User (String name , int age, String soDT){
        this.name=name;
        this.age=age;
        this.soDt=soDT;
    }
    //phương thức
    //getter vaf setter
    //tạo phương thức public để lấy giá trị
    public String getName(){
     return name;
    }
    public int getAge(){
        return age;
    }
    public String getSoDT() {
        return soDt;
    }
        //tạo phương thức để update giá trị người dùng
        public void setName(String name){
            this.name =name;
        }
        public void setAge(int age){
            this.age=age;
        }

    //tạo phương thức để hiển thị thông tin người dùng
    public void displayInfor(){
        System.out.println("username:"+name + "age:"+age+"soDT"+soDt);
    }
}
