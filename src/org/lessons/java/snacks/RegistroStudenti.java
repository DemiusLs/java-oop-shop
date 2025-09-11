package org.lessons.java.snacks;

public class RegistroStudenti {

    //attributi
    private Student[] registro ; 

    //costruttore
    public RegistroStudenti(){
       this.registro = new Student[0];
    }

    //Metodi
    public Student[] getRegistro(){
        return this.registro;
    }
    public void setRegistro(Student[] registro){
        this.registro = registro;
    }

    public void addStudent(Student student){

        //creo un nuovo array di oggetti di lungezza +1 rispetto a quello di partenza
        Student[] nuovoRegistro = new Student[this.registro.length + 1];
        //ciclo per la lunghezza del vecchio array per copiare i valori nel nuovo array
        for(int i = 0 ; i < this.registro.length ; i++){
            nuovoRegistro[i] = this.registro[i];            
        }
        //inserisco come ultimo elemento il nuovo studente  
        nuovoRegistro[nuovoRegistro.length - 1] = student;
        //sovrascrivo il vecchio array con quello nuovo
        this.registro = nuovoRegistro;

    }

    public String toString(){

        String output = "RegistroStudenti:";

        // for (int i= 0 ; i < this.registro.length ; i++){
        //     output = output + this.registro[i].getName();
        // }
        for(Student student : this.registro){
            output += String.format(" %s;" ,student.getString());
        }

        return output;
    }
}
