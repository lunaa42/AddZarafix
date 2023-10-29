package com.example.addzara;

public class Zara {
    private String product;
    private String size;
    private String address;
    private String phone;

    public Zara(String product, String size, String address, String phone) {
        this.product = product;
        this.size = size;
        this.address = address;
        this.phone = phone;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Zara() {
    }
}
