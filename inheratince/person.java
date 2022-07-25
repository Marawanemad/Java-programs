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
public class person {
 private String name ; 
 private String address ;
 private int phone ;
 

    public person(String name, String address,int phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setPhone(int phone){
        this.phone = phone;
    }
    
    public int getPhone(){
        return phone;
    }
    
 @Override
    public String toString()
    {
     return "person[ name = "+name+" , "+"address = " +address+" , phone = "+phone+" ]" ;  
    }
}
