package com.example.fbase1;

public class MainModel {

    String Ten, Mota, Anh;

    MainModel()
    {

    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String mota) {
        Mota = mota;
    }

    public String getAnh() {
        return Anh;
    }

    public void setAnh(String anh) {
        Anh = anh;
    }

    public MainModel(String ten, String mota, String anh) {
        Ten = ten;
        Mota = mota;
        Anh = anh;
    }
}
