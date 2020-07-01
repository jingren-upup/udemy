package com.company;

class Account {
    private String acountNumber;
    private double accountBalance;
    private String customerName;
    private String Email;
    private String phoneNumber;

//    public Account (String acountNumber, double accountBalance, String email) {
//        this("default", 123, "default");
//    }
    public void deposit(double depositAmount){//存钱
        this.accountBalance += depositAmount;
        System.out.println("存了 "+ depositAmount + " 多少钱 ， 还剩" + this.accountBalance);
    }

    public void withdrawal(double withdrawalAmount){//取钱
        if(accountBalance - withdrawalAmount <=0 ){
            System.out.println("Only " + accountBalance + "这么儿点钱了" );
        }else {
            this.accountBalance -= withdrawalAmount;
            System.out.println("取了 "
            + withdrawalAmount + " 这么多钱" +
            this.accountBalance +" 这么多钱");
        }

    }

    public String getAcountNumber() {
        return acountNumber;
    }

    public void setAcountNumber(String acountNumber) {
        this.acountNumber = acountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
