/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author n
 */
public class student extends person {
    private String program ;
    private int year; 
    private double fee ;

    public student( String name, String address ,int phone, String program, int year, double fee) {
        super(name, address,phone);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getProgram() {
        return program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }
@Override    
    public String toString()
    {
        return "Student ["+super.toString()+" ,[ program = "+program+" , year = "+year+ " , fee = "+fee+"] ]" ; 
    }
}
