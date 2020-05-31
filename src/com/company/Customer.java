
package com.company;

public class Customer {
    private String name;
    private int InBlacklist;
    public String getName(){
        return name;
    }
    public int getInBlacklist() {
        return InBlacklist;
    }

    public void setInBlacklist(int inBlacklist) {
        this.InBlacklist = inBlacklist;
    }

    public Customer(String n){
        this.name = n;
        this.InBlacklist = 0;
    }

    public void Show(){
        System.out.println(this.name + " : " + this.InBlacklist);
    }

}