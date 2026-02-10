package com.example.test_spring_scope_kosaka;

public class Exam01Form {

    private String mail;
    private String password;

    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "Exam01Form [mail=" + mail + ", password=" + password + "]";
    }


    

    

}
