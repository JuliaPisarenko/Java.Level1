package ru.geekbrains.java.level1.Lesson5;

public class Employee {
    private String mSurnameNameMidName;
    private String mPosition;
    private String mEmail;
    private String mPhoneNumber;
    private long mSalary;
    private int mAge;

    public Employee(String surnameNameMidName, String position, String email, String phoneNumber, long salary, int age){
        this.mSurnameNameMidName = surnameNameMidName;
        this.mPosition = position;
        this.mEmail = email;
        this.mPhoneNumber = phoneNumber;
        this.mSalary = salary;
        this.mAge = age;
    }

    public String getmSurnameNameMidName() {
        return mSurnameNameMidName;
    }

    public void setmSurnameNameMidName(String mSurnameNameMidName) {
        this.mSurnameNameMidName = mSurnameNameMidName;
    }

    public String getmPosition() {
        return mPosition;
    }

    public void setmPosition(String mPosition) {
        this.mPosition = mPosition;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public String getmPhoneNumber() {
        return mPhoneNumber;
    }

    public void setmPhoneNumber(String mPhoneNumber) {
        this.mPhoneNumber = mPhoneNumber;
    }

    public long getmSalary() {
        return mSalary;
    }

    public void setmSalary(long mSalary) {
        this.mSalary = mSalary;
    }

    public int getmAge() {
        return mAge;
    }

    public void setmAge(int mAge) {
        this.mAge = mAge;
    }

    public void informationOfEmployee(){
        System.out.println("FullName: " + this.mSurnameNameMidName  + "\n Position: " + this.mPosition
                    + "\n Email: " +this.mEmail  + "\n Phone Number: " + this.mPhoneNumber
                    + "\n Salary: " + this.mSalary + "\n Age: " + this.mAge);
    }
}
