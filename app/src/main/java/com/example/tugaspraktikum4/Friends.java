package com.example.tugaspraktikum4;

public class Friends {
    private String nama,status;
    private int img;

    public Friends(int img, String nama, String status){
        this.img=img;
        this.nama = nama;
        this.status = status;

    }
    public void setImg(){
        this.img=img;
    }
    public int getImg(){
        return img;
    }

    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
