package com.example;

public class AppClasses {
    public static void main(String[] args) {
        Clientes clientes=new Clientes();
        clientes.setRenda(10000);
        clientes.setSexo('F');
        clientes.setAnoNascimento(2020);
        System.out.println(clientes.getRenda());
        System.out.println(clientes.getSexo());
        System.out.println(clientes.getAnoNascimento());
    }
    
}
