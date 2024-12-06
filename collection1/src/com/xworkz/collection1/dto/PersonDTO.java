package com.xworkz.collection1.dto;



public class PersonDTO {

    private String name;
    private String email;
    private long mobile;
    private AddressDTO address;

    public PersonDTO(){

        System.out.println("no-args constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        address = address;
    }

    public PersonDTO(String name, String email, long mobile, AddressDTO address) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile=" + mobile +
                ", Address='" + address + '\'' +
                '}';
    }
}
