package com.example.qno218arid2982.ui.home;

public class BillModel {
    int id;
    String customerName;
    String billNumber;
    String meterNumber;
    double pendingAmount;
    int lastUnits;
    int currentUnits;

    public BillModel(int id, String customerName, String billNumber, String meterNumber, double pendingAmount, int lastUnits, int currentUnits) {
        this.id = id;
        this.customerName = customerName;
        this.billNumber = billNumber;
        this.meterNumber = meterNumber;
        this.pendingAmount = pendingAmount;
        this.lastUnits = lastUnits;
        this.currentUnits = currentUnits;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public String getMeterNumber() {
        return meterNumber;
    }

    public void setMeterNumber(String meterNumber) {
        this.meterNumber = meterNumber;
    }

    public double getPendingAmount() {
        return pendingAmount;
    }

    public void setPendingAmount(double pendingAmount) {
        this.pendingAmount = pendingAmount;
    }

    public int getLastUnits() {
        return lastUnits;
    }

    public void setLastUnits(int lastUnits) {
        this.lastUnits = lastUnits;
    }

    public int getCurrentUnits() {
        return currentUnits;
    }

    public void setCurrentUnits(int currentUnits) {
        this.currentUnits = currentUnits;
    }
}
