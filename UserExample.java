class UserExample {
    private String UserName;
    private String Password;

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPassword() {
        return Password;
    }

    public static void main(String[] args) {
        UserExample user = new UserExample();
        
        user.setUserName("KGM");
        user.setPassword("Kgm@123");
        
        String username = user.getUserName();
        String password = user.getPassword();

        
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
