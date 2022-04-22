package com.examplehospital.hospitalapp.models;

public class Hospital {

    private int hospital_Id;
    private int ein;
    private String name;
    private String street_address;
    private String city;
    private String state;
    private String zip_code;

    public Hospital(int hospital_Id, int ein, String name, String street_address, String city, String state, String zip_code) {
        this.hospital_Id = hospital_Id;
        this.ein = ein;
        this.name = name;
        this.street_address = street_address;
        this.city = city;
        this.state = state;
        this.zip_code = zip_code;
    }
}
