package com.driver;

public class Main {

    public static void Main(String[] args)
    {
        RWOnly obj=new RWOnly();
        //obj.name="Haarini";
        //'name' has private access in 'com.driver.RWOnly'
        obj.setName("Harini");
        System.out.println(obj.getName());
    }
}