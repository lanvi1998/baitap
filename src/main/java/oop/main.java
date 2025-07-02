package oop;

public class main {
    public static void main(String[] args) {
        //tạo ra 1 đối tượng là user
        User user = new User("lanvi", 18, "01111111");
        user.displayInfor();
        user.setName("nghi");
        user.setAge(28);
        user.displayInfor();

    }
}