class Account {
    String username;
    String password;
    String email;

    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
        System.out.println("Doi mat khau thanh cong");
    }

    public void display(){
        System.out.println("Username: "+ username);
        System.out.println("Email: "+ email);
        System.out.println("Password: *******");

    }
}

public class Bai02 {
    public static void main(String[] args){
        Account acc1 = new Account ("user001", "123456", "user001@gmail.com");
        acc1.display();
        acc1.changePassword("1298364");
        acc1.display();
    }
}
