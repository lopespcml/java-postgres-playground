package com.example;

import Modelo.Clientes;

public class AppOperadoresRelacionais {
    public static void main(String[] args) {
        var cliente1=new Clientes();
        var cliente2=new Clientes();

        cliente1.setRenda(12000);
        cliente2.setRenda(12000);

        if(cliente1.getRenda()>cliente2.getRenda()) {
            System.out.println("O cliente 1 tem renda superior ao cliente 2");
   
        }
        else if ((cliente1.getRenda()<cliente2.getRenda())) {
            System.out.println("O cliente 1 tem renda inferior ao cliente 2");    
        }
        else {
            System.out.println("As rendas de ambos os clientes sao iguais.");
        }
    
}
}
