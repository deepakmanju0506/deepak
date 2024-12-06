package com.xworkz.collection1.dto;

public class AddressDTO {

    private String street;
    private int no;
    private String area;

    public AddressDTO() {
        System.out.println("no-args constructor");
    }

    public AddressDTO(String street, int no, String area) {
        this.street = street;
        this.no = no;
        this.area = area;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }


    @Override
    public String toString() {
        return "AddressDTO{" +
                "street='" + street + '\'' +
                ", no=" + no +
                ", area='" + area + '\'' +
                '}';
    }
}
