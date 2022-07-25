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
public class staff extends person {
    private String school ; 
    private double pay ;

    public staff( String name, String address ,int phone,String school, double pay) {
        super(name, address,phone);
        this.school = school;
        this.pay = pay;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public double getPay() {
        return pay;
    }
    @Override
    public String toString()
    {
        return "Stafff ["+super.toString()+" ,[ school = "+school+" , pay = "+pay+"] ]" ;
    }
}
