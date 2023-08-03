package com.example;

import Modelo.Clientes;

public class AppClasses {
    public static void main(String[] args) {
        Clientes cliente1=new Clientes("01234567P","     Paulo Cesar   ",10000,'M',1966);
        Clientes cliente2=new Clientes(new String("01234567p"),"Lana",20000,'F',1983);
     /*  clientes.setRenda(10000);
        clientes.setSexo('F');
        clientes.setAnoNascimento(2020);
     */ 
        System.out.println(cliente1.getCpf());
        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getRenda());
        System.out.println(cliente1.getSexo());
        System.out.println(cliente1.getAnoNascimento());
        System.out.println(cliente1.isEspecial());

        if (cliente1.getCpf().equalsIgnoreCase(cliente2.getCpf()))
            System.out.println("Os clientes tem o mesmo CPF");
        else
            System.out.println("Os clientes tem CPFs diferentes"); 
        String[] vetor = cliente1.getNome().split(" ", 0);
        for (byte i=0; i <= vetor.length -1;i++)
            System.out.println( vetor[i]);  
            
    }
    
}
