package com.decembertwenty;

class Parent {
    private String secretData;

    public String getSecretData() {
        return secretData;
    }

    public void setSecretData(String secretData) {
        this.secretData = secretData;
    }
}
class Child extends Parent{

    public static void main(String [] args){
        Child child = new Child();
        child.setSecretData("data");
        System.out.println(child.getSecretData());
    }

}