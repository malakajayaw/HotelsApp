package com.example.myapplication;

public class User {

  private String uname;
  private  String uemail;
  private Integer umobile;
  private String upassword;

    public User() {
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public Integer getUmobile() {
        return umobile;
    }

    public void setUmobile(Integer umobile) {
        this.umobile = umobile;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }
}
