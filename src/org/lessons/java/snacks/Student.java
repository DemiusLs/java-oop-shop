package org.lessons.java.snacks;

public class Student {

    //atributi

    private String name; 
    private String surname;
    private int age;

    //constructor
    Student(String name , String surname, int age){

        this.name = name;
        this.surname =surname;
        this.age = age;
        
    }

    //metodi
     public void setName (String name){
        this.name = name;
     }

     public String getName (){
        return this.name;
     }

     public void setSurname (String surname){
        this.surname = surname;
     }

     public String getSurname (){
        return this.surname;
     }

     public void setAge (int age){
        this.age = age;
     }

     public int getAge (){
        return this.age ;
     }

     public String getString (){
        return(this.name + " " + this.surname + ", " + this.age + " anni");
     }

}
