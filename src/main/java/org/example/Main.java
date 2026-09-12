package org.example;

public class Main {
    static void main() {
        int idade = 20;
        if (idade <= 10){
            System.out.println("Criança");
        } else if (idade >10 && idade <18) {
            System.out.println("Adolescente");
        }else{
            System.out.println("Adulto");
        }
    }
}