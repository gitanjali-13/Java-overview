package com.bl.array.string;

public class Employee {
    int eid;
    String ename;
    Employee(int eid , String ename){
        this.eid = eid;
        this.ename = ename;

    }

    @Override
    public String toString() {
        return "e-id = " +eid+ "e-name= " +ename;
    }

    public static void main(String[] args) {
        Employee e = new Employee(111,"Rana");
        System.out.println(e);
        //System.out.println(e.toString()); It returns hashcode value of object class.
    }
}
