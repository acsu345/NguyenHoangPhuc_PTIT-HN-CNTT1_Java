class User {
    private int id;
    private String username;
    private String password;
    private String email;

    public User(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        setPassword(password);
        setEmail(email);
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        if (password == null || password.trim().isEmpty()) {
            System.out.println("Mat khau khong duoc rong");
        } else {
            this.password = password;
        }
    }

    public void setEmail(String email) {
        if (email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            this.email = email;
        } else {
            System.out.println("Email khong hop le");
        }
    }

    public void hienThiThongTin() {
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: ********");
        System.out.println();
    }
}

public class Bai06 {
     public static void main(String[] args) {
        User u1 = new User(1, "phuc", "123456", "phuc@gmail.com");
        u1.hienThiThongTin();

        User u2 = new User(2, "user2", "", "email_sai");
        u2.hienThiThongTin();

        u1.setPassword("newpass");
        u1.setEmail("phuc123@gmail.com");
        u1.hienThiThongTin();
    }
}
