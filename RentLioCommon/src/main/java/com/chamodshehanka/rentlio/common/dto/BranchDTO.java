package com.chamodshehanka.rentlio.common.dto;

/**
 * @author chamodshehanka on 3/12/2018
 * @project RentLio
 **/
public class BranchDTO extends SuperDTO{

    private String branchId;
    private String registerId;
    private String address;
    private String email;
    private String tel;
    private String postalCode;

    public BranchDTO() {
    }

    public BranchDTO(String branchId, String registerId, String address, String email, String tel, String postalCode) {
        this.branchId = branchId;
        this.registerId = registerId;
        this.address = address;
        this.email = email;
        this.tel = tel;
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "BranchDTO{" +
                "branchId='" + branchId + '\'' +
                ", registerId='" + registerId + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getRegisterId() {
        return registerId;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
