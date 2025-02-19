/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utem.rentalsystem;

import java.io.Serializable;

/**
 *
 * @author 
 */
public class Car extends Vehicle implements Serializable
{
    private String vehicleReg;
    private String vehicleName;
    private double price;
    private int seatQuantity;
    private String vehicleStatus;

    @Override
    public String getVehicleReg() {
        return vehicleReg;
    }

    @Override
    public void setVehicleReg(String vehicleReg) {
        this.vehicleReg = vehicleReg;
    }

    @Override
    public String getVehicleName() {
        return vehicleName;
    }

    @Override
    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int getSeatQuantity() {
        return seatQuantity;
    }

    @Override
    public void setSeatQuantity(int seatQuantity) {
        this.seatQuantity = seatQuantity;
    }

    @Override
    public String getVehicleStatus() {
        return vehicleStatus;
    }

    @Override
    public void setVehicleStatus(String vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }
}

