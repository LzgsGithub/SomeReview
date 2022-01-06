package com.company.javaproject;

public class Support  extends Hero implements Healer{
    private String name;
    public Support(){}
    public Support(String name,int hp){
        super(hp);
        this.name = name;
    }
    @Override
    public void heal(){
        System.out.println("辅助类实现了治疗方法！");
    }
}
