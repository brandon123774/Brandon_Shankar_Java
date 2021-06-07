package com.company.Composition;

import java.util.Objects;

public class CustomerAccount {

    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;

    private Address shippingAddress;
    private Address billingAddress;

    private RewardsMember IsRewardsMember;


    public CustomerAccount(String firstName, String lastName, String email, int phoneNumber, Address shippingAddress, Address billingAddress, RewardsMember isRewardsMember) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        IsRewardsMember = isRewardsMember;
        System.out.println("First Name:" + firstName);
        System.out.println("Last Name:" + lastName);
        System.out.println("Email:" + email);
        System.out.println("Phone Number:" + phoneNumber);

    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public RewardsMember getIsRewardsMember() {
        return IsRewardsMember;
    }

    public void setIsRewardsMember(RewardsMember isRewardsMember) {
        IsRewardsMember = isRewardsMember;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerAccount that = (CustomerAccount) o;
        return phoneNumber == that.phoneNumber && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(email, that.email) && Objects.equals(shippingAddress, that.shippingAddress) && Objects.equals(billingAddress, that.billingAddress) && Objects.equals(IsRewardsMember, that.IsRewardsMember);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, phoneNumber, shippingAddress, billingAddress, IsRewardsMember);
    }

    @Override
    public String toString() {
        return "CustomerAccount{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", shippingAddress=" + shippingAddress +
                ", billingAddress=" + billingAddress +
                ", IsRewardsMember=" + IsRewardsMember +
                '}';
    }
}


