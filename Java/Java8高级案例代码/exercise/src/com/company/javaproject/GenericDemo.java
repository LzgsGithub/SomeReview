package com.company.javaproject;

public class GenericDemo {
    public static void myMethod(Generic<?> g1){
        g1.showDataType();
    }
    public static void main(String[] args) {
        Generic<String> strObj = new Generic<>("这是泛型类");
        strObj.showDataType();
        myMethod(strObj);

    }

}
